//calculate how many terms to get pi accurate to n sig figs
int i=0, terms=1;
double pi=0, realpi=Math.PI;
boolean accuracymet = false;
print '''
==========================
==== Pi to n sig figs ====
==========================

Type 'n' here >> ''';

int n = Integer.parseInt(System.console().readLine());
while (!accuracymet && terms<100000000) { //stop after 100,000,000 terms
  i=terms-1  //first term when i=0
  pi = pi + 4*(((-1)**i)/((2*i)+1));
  if (realpi.trunc(n-1)==pi.trunc(n-1)) {
    accuracymet = true;
  }
  if (terms%1000000==0){
    println "At ${terms/1000000} million cycles calc is $pi"
  }
  terms = terms+1;
}  
println "Your pi is $pi"
println "Real pi is $realpi"
if (terms == 100000000) {
  println "Accuracy to $n s.f. could not be achieved after 100,000,000 terms"
} else {
  println "Precisely ${terms-1} terms is the first point of $n s.f. accuracy"
}
println '''
=========== END ==========
'''
