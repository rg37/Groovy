//read a string and output it as a column
int i=0;

print '''
======================
== String to column ==
======================

Please type a string
>> '''
String str = System.console().readLine();
while (i<str.length()) {
    println str[i];
    i=i+1;
}
println();

