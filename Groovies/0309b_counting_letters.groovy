//read a string and count number of occurences of letter in it
int i=0, count=0;

print '''
===================
== Count Letters ==
===================

Please type a string
>> '''
String str = System.console().readLine();
print'''thanks! now enter the letter to test
>> '''
char test = System.console().readLine().toLowerCase();
while (i<str.length()) {
    if (str[i].toLowerCase()==test) {
        count=count+1;
    }
    i=i+1;
}
println "There were $count occurrences of the letter $test in your string";
