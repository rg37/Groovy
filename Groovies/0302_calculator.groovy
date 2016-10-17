// simple arithmetic calculator, on two double precision inputs
double d1=0, d2=0;
int choice=0;
String operation="";
print '''

=====================
== calculator 1.01 ==
=====================

enter first number  >> ''';
d1=Double.parseDouble(System.console().readLine());
print "enter second number >> ";
d2=Double.parseDouble(System.console().readLine());
print '''
Select an operation
1 - Add
2 - Subtract
3 - Multiply
4 - Divide

>> '''
choice = Integer.parseInt(System.console().readLine());
switch (choice) {
  case 1: //Add
  	answer = d1+d2;
   operation = "+";
   break;
  case 2: //Subtract
  	answer = d1-d2;
   operation = "-";
   break;
  case 3: //Multiply
  	answer = d1*d2;
   operation = "*";
   break;
  case 4: //Divide
  	answer = d1/d2;
   operation = "/";
   break;
  default:
    println "Incorrect choice"
    break;
}
print """
Answer: $d1 $operation $d2 = $answer

"""
