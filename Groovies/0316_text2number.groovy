//16 Text2number
//Write a program that reads a number with commas and decimal dots (such as “23,419.34”) and then prints a
//number that is half of it. Do not use Double.parseDouble().
//If you were writing a simple spreadsheet, you could use this code to parse the input in the cells.

//0. Introduction to program

print '''
====================
== Text 2 Number ===
====================

Enter number
>> ''';

//1. Get string

String input = System.console().readLine();

//2. Remove punctuation, observing where point is
char character;
Boolean charIsNum = true;
int nums = 0, positionDec = 0;
String numClean = "";
for (int i=0;i<input.length();i++) {
    character = input.charAt(i);
    switch (character) {
        case ",":
            charIsNum = false;
            break;
        case ".":
            charIsNum = false;
            positionDec = nums;        //numbers before the point
            break;
        default:
            nums = nums+1;
            numClean = numClean + character;
            break;
    }
}
positionDec = nums-positionDec
//4. Output

int answer = Integer.parseInt(numClean);
double realAnswer = (answer/(10**positionDec))/2;
println "Half that is " + realAnswer;
