//14 Palindrome creator
//Write a program that reads a text and then writes on the screen a palindrome by writing the same text followed
//by the same text in reversed order. For example, if the user enters the text “It was a dark and stormy night” the
//program must output “It was a dark and stormy nightthgin ymrots dna krad a saw tI”.


//0. Introduction to program

print '''
========================
== CREATE PALINDROME ===
========================

Enter string
>> ''';

//1. Get string

String str = System.console().readLine();

//2. get reverse string
int length = str.length();
String strReverse = "";
for (int i=length;i>0;i--) {
    strReverse = strReverse + str.charAt(i-1);
}

//4. Output

println str + strReverse;
