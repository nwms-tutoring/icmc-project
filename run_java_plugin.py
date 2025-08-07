# run_java_plugin.py
# Simple backend for running Java projects from the web UI
# Usage: python3 run_java_plugin.py

from flask import Flask, request, jsonify
import subprocess
import os

app = Flask(__name__)

PROJECTS = {
    'project': 'project',
    'project_v2': 'project_v2',
    'project_v3': 'project_v3',
    'project_v4': 'project_v4',
}

@app.route('/run-java', methods=['POST'])
def run_java():
    data = request.get_json()
    project_key = data.get('project')
    project_dir = PROJECTS.get(project_key)
    if not project_dir:
        return jsonify({'output': 'Invalid project selected.'}), 400
    abs_dir = os.path.abspath(project_dir)
    main_file = os.path.join(abs_dir, 'Main.java')
    if not os.path.exists(main_file):
        return jsonify({'output': 'Main.java not found in project.'}), 404
    try:
        # Compile
        compile_proc = subprocess.run(['javac', 'Main.java'], cwd=abs_dir, capture_output=True, text=True)
        if compile_proc.returncode != 0:
            return jsonify({'output': compile_proc.stderr}), 200
        # Run
        run_proc = subprocess.run(['java', 'Main'], cwd=abs_dir, capture_output=True, text=True)
        output = run_proc.stdout + run_proc.stderr
        return jsonify({'output': output}), 200
    except Exception as e:
        return jsonify({'output': f'Error: {e}'}), 500

if __name__ == '__main__':
    app.run(host='0.0.0.0', port=5000)
