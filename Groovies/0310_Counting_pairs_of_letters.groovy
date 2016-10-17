//read two strings and find one in the other
int i=0,j=0,count=0;
Boolean found = false, finished = false;
print '''
===================
== String Search ==
===================

Enter the first long string
>> ''';
String bigStr = System.console().readLine();
print '''
Now enter the search string
>> '''
while (!finished) {
    count = 0;
    String smallStr = System.console().readLine();
    if (smallStr == "") {
        finished = true;
        println "==== Finished ====";
    } else {
        for (i=0;i<bigStr.length()-smallStr.length()+1;i++) {
            if (bigStr.charAt(i)==smallStr.charAt(0)) {   //found first letter, now check the rest
                for (j=0;j<smallStr.length(); j++) {             //loop through 2nd string
                    if (!(smallStr.charAt(j)==bigStr.charAt(i+j))) {break;}                        
                    if (j==(smallStr.length()-1)) {count=count+1;}    //ie if it got through whole small string
                }
            }
        }
        print """
\"${smallStr}\" was found in the text $count times
"""
        print "Test again? >> "
    }
}

