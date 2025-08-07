// runJavaPlugin.js
// This plugin enables running Java projects from the web UI by calling a backend endpoint.
// It expects a backend at /run-java that accepts POST { project: string } and returns { output: string }

async function runProject() {
    const project = document.getElementById('projectSelect').value;
    const outputElem = document.getElementById('output');
    outputElem.textContent = 'Running...';
    try {
        const response = await fetch('/run-java', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({ project })
        });
        if (!response.ok) throw new Error('Failed to run project');
        const data = await response.json();
        outputElem.textContent = data.output || 'No output.';
    } catch (err) {
        outputElem.textContent = 'Error: ' + err.message;
    }
}
