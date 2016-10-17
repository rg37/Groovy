//print first n primes, n specified by user
int i=2,j=2,primes=0;
boolean prime = true;
print '''

========================
=== gimme tHE pRIMES ===
========================

How many? >> ''';
input = Integer.parseInt(System.console().readLine());
println();
print "1";
primes = 1;
while (primes<input){
  while (prime && j<i) {
    if ((i % j) == 0){
      prime = false;
    }
    j=j+1;
  }
  if (prime) {
    print ", $i"
    primes = primes+1;
  }
  j=2;
  i=i+1
  prime = true;
}
println """

========================
========= END! =========
========================
"""
