//print all primes up to entered number
int i=2,j=2;
boolean prime = true;
print '''

======================
=== aLL tHE pRIMES ===
======================

Enter max >>''';
input = Integer.parseInt(System.console().readLine());
while (i<=input){
  while (prime && j<i) {
    if ((i % j) == 0){
      prime = false;
    }
    j=j+1;
  }
  if (prime) {println i}
  j=2;
  i=i+1
  prime = true;
}
println "======== END! ========"