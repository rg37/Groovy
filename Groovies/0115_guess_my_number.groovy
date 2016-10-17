// lets user guess random number between 1 and 1000
Random random = new Random();
int number = random.nextInt(1000+1), guess = 0, prevHigh = 1000, prevLow = 0, guesses = 1;
Boolean validGuess = false;
String str = "";
print '''
=====================
== GUESS MY NUMBER ==
=====================

Enter first guess >> '''
str = System.console().readLine();
while (!validGuess) {	//first entry checks
  if (str.isInteger()){
    guess = Integer.parseInt(str);
    if (guess<=prevHigh && guess>=prevLow) {
      validGuess = true;
      if (guess<number) {
        prevLow = guess+1;
      } else {
        prevHigh = guess-1;
      }
    } else {
      print "Integer outside range ($prevLow - $prevHigh), try again >> "
      str = System.console().readLine();
    }
  } else {
      print "You didn't enter an Integer, try again >> "
      str = System.console().readLine();    
  }
}
validGuess = false;
while (!(guess == number)) { //loop until guess is correct
  if (guess<number) {
    print "Too low! Guess again >> "
  } else {
    print "Too High! Guess again >> "
  }
    str = System.console().readLine();
    while (!validGuess) {
      if (str.isInteger()){
        guess = Integer.parseInt(str);
        if (guess<=prevHigh && guess>=prevLow) {
          validGuess = true;
          if (guess<number) {
            prevLow = guess+1;
          } else {
            prevHigh = guess-1;
          }
          guesses = guesses +1
        } else {
          print "Integer outside range ($prevLow - $prevHigh), try again >> "
          str = System.console().readLine();
        }
      } else {
          print "You didn't enter an Integer, try again >> "
          str = System.console().readLine();    
      }
    }
    validGuess = false;
}
println """
=====================
====== CORRECT ======
=====================

My number was $number
You needed $guesses guesses
"""
