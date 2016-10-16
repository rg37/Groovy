//calculate how many terms to get pi accurate to n terms
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
  i=terms-1
  pi = pi + 4*(((-1)**i)/((2*i)+1));
  if ((realpi-pi).abs()<(1*(10**(-(n))))) {
    //println (1*(10**(-n)));   //debug check line
    accuracymet = true;
  }
  terms = terms+1;
}  
println "Your pi is $pi"
println "Real pi is $realpi"
if (terms == 100000000) {
  println "Accuracy to $n s.f. could not be achieved with 1,000,000,000 terms"
} else {
  println "It took $terms terms to get $n s.f. accuracy"
}
println '''
=========== END ==========
'''
