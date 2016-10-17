//Rectangle area and perimeter

class Point {
  double x;
  double y;
}
class Rectangle {
	Point upLeft = new Point();
	Point downRight = new Point();
}

Rectangle rectangle = new Rectangle();
double xLenght=0,yLength=0,perimeter=0, area=0;

print '''
==================
=== Rectangles ===
==================

''';
print "enter 1st x co-ordinate >> ";
rectangle.upLeft.x=Double.parseDouble(System.console().readLine());
print "enter 1st y co-ordinate >> ";
rectangle.upLeft.y=Double.parseDouble(System.console().readLine());
print "enter 2nd x co-ordinate >> ";
rectangle.downRight.x=Double.parseDouble(System.console().readLine());
print "enter 2nd y co-ordinate >> ";
rectangle.downRight.y=Double.parseDouble(System.console().readLine());

xLength = (rectangle.upLeft.x - rectangle.downRight.x).abs();
yLength = (rectangle.upLeft.y - rectangle.downRight.y).abs();

perimeter = 2*(xLength+yLength);
area = xLength*yLength;
println """
The perimeter of this rectangle is ${perimeter.round(3)} and its area is ${area.round(3)}
"""
