/*
12 Your change, please
Write a program that reads the total cost of a purchase and an amount of money that is paid to buy it. Your
program should output the correct change specifying the amount of notes (50, 20, 10, 5) and coins (2, 1, 0.50, 0.20,
0.10, 0.05, 0.02, 0.01) needed.
*/
//I have started using methods in a small way because I know they are coming next week.

//0. variable/class/method declaration and/or initialisation
//   need cost and money given, a temporary variable (what change is left) and a Boolean test for handing out change.

class Input {
  double cost;
  double paid;
}
class Output {
  int quantity;
  double remain;
  
  Output construct(Double denom, Double amount) {
    this.quantity=((amount-this.remain)/denom).round(2);
    this.remain=(amount % denom).round(2);
  }
}

double change;
double[] denom = [50,20,10,5,2,1,0.5,0.2,0.1,0.05,0.02,0.01];
println denom[0];
int i=0;
Boolean finished=false;
//1. receive inputs from user
Input input = new Input();
print "enter total cost >> "
input.cost = Double.parseDouble(System.console().readLine()).round(2);
print "enter money paid >> "
input.paid = Double.parseDouble(System.console().readLine()).round(2);
//2. calculate change
change = (input.paid - input.cost).round(2);
//3. return calculation to user
Output output = new Output();
if (input.paid<input.cost) {
  println "You didn't pay enough!";
  finsihed = true
} else {
  print "Your change: "
}
while (!finished && i<=denom.size()){
  output = output.construct(denom[i],change);
  if (output.quantity>0) {
    println output.quantity + " of " + denom[i];
  }
  change = change-(output.quantity*denom[i]);
  if (change==0) {
    finished = true;
  }
  i++;
}
println "====End====";
