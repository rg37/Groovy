//gives nearest prime to input
int high, low, disthigh=0, distlow=0, j=2;
boolean prime = true, primefound = false;
print '''

==================
==NEAREST PRIMES==
==================

enter number >> '''

int input = Integer.parseInt(System.console().readLine());
//up
int testp=input
while (!primefound){  //loop for finding prime above
  while (prime && j<testp) {  //loop for testing prime
    if ((testp % j) == 0){
      prime = false;
    }
    j=j+1;
  }
  if (prime) {
    primefound = true;
    high = testp;
  }
  j=2; //reset check quotient
  prime = true; //reset check variable
  testp=testp+1;
}
//down
testp=input
j=2;
primefound = false;
prime = true;
while (!primefound){  //loop for finding prime above
  while (prime && j<testp) {  //loop for testing prime
    if ((testp % j) == 0){
      prime = false;
    }
    j=j+1;
  }
  if (prime) {
    primefound = true;
    low = testp;
  }
  prime = true;
  j=2;
  testp=testp-1;
}
//compare&output
disthigh = high-input;
distlow = input-low;

println "$high ($disthigh) $low ($distlow)"

if (distlow<=disthigh){
  println "Prime below is $low ($distlow away)";
} 
if (disthigh<=distlow){
  println "Prime above is $high ($disthigh away)";
}
println "=======END======="