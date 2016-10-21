//15 Palindrome redux (*)
//A strict palindrome is difficult to see in every day language. A relaxed palindrome, a text that is a palindrome if
//you ignore punctuation marks such as commas or spaces, is easier to see. Examples include “A man, a plan, a canal
//- Panama!”, “Was it a car or a cat I saw?”, and “Rise to vote, sir”.
//Write a program that reads a text from the user and then says whether the text is a relaxed palindrome. Note
//that all strict palindromes are relaxed palindromes by definition.
//Hint: There are two methods that will make your life easier. The first one is Character.isLetter(), that accepts
//a character (not a String, even of length one) and returns true if the character is a letter (e.g. ’a’, ’R’) and false
//otherwise (e.g. ’.’, ’5’). The second one is Character.toLowerCase(), that accepts a character (not a String) and
//returns the lower case version of the character.


//0. Introduction to program

print '''
=======================
== PALINDROME REDUX ===
=======================

Enter string
>> ''';

//1. Get string

String input = System.console().readLine();

//2. clean string
String str = input.toLowerCase();
String strClean = "";
for (int i=0;i<str.length();i++) {
    if (str.charAt(i).isLetter()) {
        strClean = strClean + str.charAt(i);
    }
}

//3. reverse
String strReverse = "";
int length = strClean.length();
for (int i=length;i>0;i--) {
    strReverse = strReverse + strClean.charAt(i-1);
}

//4. Output

if (strReverse == strClean) {
    println "That is a relaxed palindrome!";
} else {
    println "Sorry, not a relaxed palindrome.";
}

