//read a string and output it as a column
int i=0, countE=0;

print '''
===================
== Count Letters ==
===================

Please type a string
>> '''
String str = System.console().readLine();
while (i<str.length()) {
    if (str[i]=="e" || str[i]=="E") {
        countE=countE+1;
    }
    i=i+1;
}
println "There were $countE occurences of the letter e";



