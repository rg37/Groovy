//Rectangle and point

class Point {
  double x;
  double y;
}
class Rectangle {
	Point upLeft = new Point();
	Point downRight = new Point();
}

Rectangle rectangle = new Rectangle();
Point point = new Point();
double minX=0,minY=0, maxX=0,maxY=0;

print '''
===========================
=== Rectangles vs Point ===
===========================

''';
print "enter 1st x co-ordinate >> ";
rectangle.upLeft.x=Double.parseDouble(System.console().readLine());
minX=rectangle.upLeft.x;
maxX=rectangle.upLeft.x;
print "enter 1st y co-ordinate >> ";
rectangle.upLeft.y=Double.parseDouble(System.console().readLine());
minY=rectangle.upLeft.y
minY=rectangle.upLeft.y;
print "enter 2nd x co-ordinate >> ";
rectangle.downRight.x=Double.parseDouble(System.console().readLine());
if (rectangle.downRight.x<minX) {minX=rectangle.downRight.x} else {maxX=rectangle.downRight.x};
print "enter 2nd y co-ordinate >> ";
rectangle.downRight.y=Double.parseDouble(System.console().readLine());
if (rectangle.downRight.y<minY) {minY=rectangle.downRight.y} else {maxY=rectangle.downRight.y};


print "enter outside point x co-ordinate >> ";
point.x=Double.parseDouble(System.console().readLine());
print "enter outside point y co-ordinate >> ";
point.y=Double.parseDouble(System.console().readLine());

if (point.x>=minX && point.x<=maxX && point.y>=minY && point.y<=maxY) {
  println "Point is within the rectangle!";
} else {
  println "Point is NOT within the rectangle.";
}

