/*
Write a program that reads a text from the user and then enter a loop of requesting letters and counting them.
The program stops if the user asks for the same letter twice. This is an example of the output of such a program
(with a rather short and boring text):

Please write a text: It was a dark and stormy night
Which letter would you like to count now? a
There are 6 in your text.
Which letter would you like to count now? s
There are 3 in your text.
Which letter would you like to count now? u
There are 0 in your text.
Which letter would you like to count now? a
Repeated character. Exiting the program...
Thank you for your cooperation. Good bye!
*/
//So after week 3 of PiJ I'm going to try and make this more explicit/clearer/well commented than some of my succinct earlier solutions

//0. Variable declaration and/or initialisation

class Input {											//let's use a class to store data
  String mainText;
  String charList;								   //string of thus far checked chars
  char checkChar;
  int lengthText;

  Boolean inputOK(String strtotest)	{			//method within class to check string entry is not empty
    if (strtotest == "") {
      false;
    } else {
      true;
    }
  }
  
}

int i=0,j=0,count=0;									//integers for looping and counting
Boolean finished = false;							//to determine when to end the program
String str="";											//for temporary handling of input

Input input = new Input();							//instance of class, input

//1. Read initial data from user, into a class, because week 3 is about classes!

println();																//program header
println "=========================";
println "== Character find loop ==";
println "=========================";
println();
println "Please enter some text";
print ">> ";

str = System.console().readLine();
while (!input.inputOK(str)) {										//this tests if input is empty using the class method. if so ask again
  print "Please enter something >> "
  str = System.console().readLine();
}

input.mainText = str;												//main text string into class input
input.lengthText = input.mainText.length();					//I think in future this could happen within the class. Only dabbling in methods here

println "Enter the first character to find";
print ">> ";

str = System.console().readLine();
while (!input.inputOK(str)) {										//this tests if input is empty using the class method. if so ask again
  print "Please enter something >> "
  str = System.console().readLine();
}

input.checkChar = str.charAt(0);									//takes only the first character of whatever is entered

//2. count occurences of charcater in text
for (i=0;i<input.lengthText;i++) {
  if (input.checkChar == input.mainText.charAt(i)) {
    count++;
  }
}

//3. output the answer
println "Your character " + input.checkChar + " was found in the text " + count + " times."

//4. Repeat until same char entered again. this loop could have started before 1st instance but for clarity I have separated this step. 
//   Results in some slightly unnecessary repetition.

input.charList = input.checkChar;								//remember this is my list to know when to stop
while (!finished) {
  count=0;																//important to reset this
  println "Enter another character";
  print ">> ";
  str = System.console().readLine();
  while (!input.inputOK(str)) {									//this tests if input is empty using the class method. then loops until good
  	 print "Please enter something >> "
    str = System.console().readLine();
  }
  input.checkChar = str.charAt(0);
  
  for (j=0;j<input.charList.length();j++) {					//check here if already checked this char
    if (input.checkChar==input.charList.charAt(j)) {
      finished = true;
      break;
    }											
  }
  if (finished) {														//this means it doesn't complete the test for character twice
    break;
  }
    input.charList = input.charList + input.checkChar;		//add new character to check list
  for (i=0;i<input.lengthText;i++) {							//do the counting of char
    if (input.checkChar == input.mainText.charAt(i)) {
      count++;
    }
  }
  println "Your character " + input.checkChar + " was found in the text " + count + " times."    //output
}
println "You already tested the character " + input.checkChar + ". Goodbye."
