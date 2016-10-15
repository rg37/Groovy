// ask for a number and output if it is prime
int i=2;
boolean prime = true;
print '''

====================
=== IS IT PRIME? ===
====================

>>''';
int input = Integer.parseInt(System.console().readLine());
while (prime && i<input) {
    if ((input % i) == 0){
      prime = false;
    }
    i=i+1;
}
if (prime) {
  println "$input is Prime!!"
} else {
  println "$input is not Prime!!"
}