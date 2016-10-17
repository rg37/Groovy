//accept terms representing game of rock paper scissors until 1 player wins (score above 3)
String str = "";
char P1,P2;
int S1=0,S2=0;
print '''
=========================
== ROCK-PAPER-SCISSORS ==
=========================

Enter first result >> '''
while ((S1-S2).abs()<3) {
  str = System.console().readLine().toLowerCase();
  while (!(str in ["pp","pr","ps","rp","rr","rs","sp","ss","sr"])) {
    print "Invalid input, please try again >> "
    str = System.console().readLine().toLowerCase();
  }
  P1 = str[0];
  P2 = str[1];
  if (P1=="p") {
    if (P2=="r") {
      S1=S1+1;
    } else if (P2=="s"){
      S2=S2+1;
    }
  } else if (P1=="r") {
    if (P2=="s") {
      S1=S1+1;
    } else if (P2=="p"){
      S2=S2+1;
    }
  } else if (P1=="s") {
    if (P2=="p") {
      S1=S1+1;
    } else if (P2=="r"){
      S2=S2+1;
    }
  }
  println """Player 1: $S1
Player 2: $S2""";
  if ((S1-S2).abs()<3) {
    print "Enter next result  >> ";
  }
}
println();
if (S1>S2) {
  println "Player 1 wins, ${S1} points to ${S2}";
} else {
  println "Player 2 wins, ${S2} points to ${S1}";
}
println();
