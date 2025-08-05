def generate_target():
   return str(random.randomint(100, 999))
def get_feedback(guess, target):
   feedback = [""] * 3
   used = [False] * 3


#It's right, in the right position.
   for k in range (3):
       if guess[k] == target[k]:
           feedback[k] = guess[k] + "✅"
           used[k] = True
#It's right, in the wrong position / It's not right at all.
   for k in range (3):
       if feedback[k] == "":
           found = False
           for j in range (3):
               if not used[j] or guess[k] == target[j]:
                   found = True
                   used[k] = True
                   break
       feedback[k] = guess[k] + ("⚠️" if found else "❌")
   return " ".join(feedback)


def play_number_wordle ():
   print("Welcome to Number Wordle!")
   print("You have 6 tries to guess a 3-digit number.")
   print("✅ signifies a correct number in the correct place.")
   print("⚠️  signifies a correct number in the wrong place.")
   print("❌ signifies a wrong number in the wrong place.")


   target = generate_target


   for attempt in range (1, 7):
       while True:
           guess = input(f"\nAttempt {attempt}/6: ")
       if not guess.isdigit or len(guess) != 3:
           print("That is not a valid guess.")
       else:
           break


       feedback = get_feedback(guess, target)
       print("Results:", feedback)


       if guess == target:
           print(f"Congratulations! {target} was the number!")
           return


   print(f"You're out of attempts. The number was {target}.")


#Start the game.
#april
play_number_wordle()
