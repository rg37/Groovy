//draws a number pyramid
int i=1,j=1;
int input;
print '''

====================
===NUMBER PyRAMID===
====================
  
How Big? >>'''
input = Integer.parseInt(System.console().readLine());
while (i<=input) {
  
  while (j<=i){
	print i;
	j=j+1
  }
  println();
  j=1;
  i=i+1;
}