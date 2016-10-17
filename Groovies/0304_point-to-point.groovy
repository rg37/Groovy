//closest points of 3

class Point {
  double x;
  double y;
}
int i=1;
double d12=0,d13=0,d23=0,minDist=0;
Point point1 = new Point();
Point point2 = new Point();
Point point3 = new Point();

print '''
==============
=== POINTS ===
==============
''';
while (i<4) {
  print "enter Point $i x co-ordinate >> ";
    if (i==1) {
      point1.x=Double.parseDouble(System.console().readLine());
    } else if (i==2) {
      point2.x=Double.parseDouble(System.console().readLine());
    } else {
      point3.x=Double.parseDouble(System.console().readLine());
    }
  print "enter Point $i y co-ordinate >> ";
  	 if (i==1) {
      point1.y=Double.parseDouble(System.console().readLine());
    } else if (i==2) {
      point2.y=Double.parseDouble(System.console().readLine());
    } else {
      point3.y=Double.parseDouble(System.console().readLine());
    }
  i=i+1;
}
d12=(((point1.x-point2.x)**2)+((point1.y-point2.y)**2))**(1/2);
d13=(((point1.x-point3.x)**2)+((point1.y-point3.y)**2))**(1/2);
d23=(((point2.x-point3.x)**2)+((point2.y-point3.y)**2))**(1/2);

minDist = [d12,d13,d23].min();

if (d12==d13 && d13==d23){
  println "The points are equidistant! (${d12.round(2)})";
} else if (d12==d13 && d12==minDist) {
  println "Points 2 and 3 are equidistant from 1 (${d12.round(2)}), they are closer to 1 than to each other (${d23.round(2)}).";
} else if (d12==d23 && d12==minDist) {
  println "Points 1 and 3 are equidistant from 2 (${d12.round(2)}), they are closer to 2 than to each other (${d13.round(2)}).";
} else if (d13==d23 && d13==minDist) {
  println "Points 1 and 2 are equidistant from 3 (${d13.round(2)}), they are closer to 3 than to each other (${d12.round(2)}).";
} else if (d12==minDist) {
  println "Points 1 and 2 are closest (${d12.round(2)})";
} else if (d13==minDist) {
  println "Points 1 and 3 are closest (${d13.round(2)})";
} else if (d23==minDist) {
  println "Points 2 and 3 are closest (${d23.round(2)})";
} else {
  println "Error";
}
