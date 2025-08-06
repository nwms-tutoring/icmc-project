import random


def play_guessing_game():
   target = random.randint(100, 999)
   attempts = 0


   print("Welcome to the 3-digit Guessing Game")
   print("Try to guess the number from 100 to 999!")
   print("If your guess is higher than the real number, then we will tell you TOO HIGH.")
   print("If your guess is lower than the real number, then we will tell you TOO LOW.")


   while True:
       guess = input("Enter your guess: ")


       if not guess.isdigit or len(guess) !=3:
           print("Invalid. Please enter a valid guess.")
           continue


       guess = int(guess)
       attempts += 1


       if guess < target:
           print("TOO LOW!")
       elif guess > target:
           print("TOO HIGH!")
       else:
           print(f"Correct. The desired integer was {target}.")
           print(f"You guessed it in {attempts} attempt(s).")
           print(f"\x1B[3mConsider it an achievement if you guessed in under 20.\x1B[3m")
           break


play_guessing_game()
