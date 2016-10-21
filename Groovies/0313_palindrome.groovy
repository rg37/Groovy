//13 Palindrome
//A palindrome is a word, phrase, number, or other sequence of units that may be read the same way in either
//direction. Examples of strict palindromes include “ABBA”, “madam”, “radar”, “kayak”, and “step on no pets”.
//Write a program that reads a text and detects whether the text is a strict palindrome.


//0. Introduction to program

print '''
=========================
== STRICT PALINDROME? ===
=========================

Enter string to test
>> ''';

//1. Get string

String str = System.console().readLine();

//2. get reverse string
int length = str.length();
String strReverse = "";
for (int i=length;i>0;i--) {
    strReverse = strReverse + str.charAt(i-1);
}

//4. compare both halves

if (str==strReverse) {
    println "YES!! Strict Palindrome!"
} else {
    println "No, not a strict palindrome.."
}

