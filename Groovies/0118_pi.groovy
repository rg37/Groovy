//calculate pi expansion to n terms
int i=0;
double pi=0, realpi=Math.PI;
print '''

=================
==== Pi to n ====
=================

Type 'n' here >> ''';

int n = Integer.parseInt(System.console().readLine());
while (i<n) {
  pi = pi + 4*(((-1)**i)/((2*i)+1));
  //println ((-1)**i);  //debug check line
  i=i+1;
  //println pi;  //debug check line
}
println "Your pi is $pi"
println "Real pi is $realpi"
