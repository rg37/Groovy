// simple arithmetic calculator, on two double precision inputs
String str, operation="";
double d1=0, d2=0;
int i=0; 

print '''

 =====================
 == calculator 1.01 ==
 =====================

     enter two numbers 
with operation between  
>> ''';
str = System.console().readLine();
while (!(str[i] in ["+","-","*","/"])) {
  i=i+1;
}

       
d1=Double.parseDouble(str.substring(0,i));
d2=Double.parseDouble(str.substring(i+1));
operation = str[i];
switch (operation) {
  case "+": //Add
  	answer = d1+d2;
   break;
  case "-": //Subtract
  	answer = d1-d2;
   break;
  case "*": //Multiply
  	answer = d1*d2;
   break;
  case "/": //Divide
  	answer = d1/d2;
   break;
  default:
    println "Incorrect choice"
    break;
}
print """
Answer: $d1 $operation $d2 = ${answer.round(3)}

"""