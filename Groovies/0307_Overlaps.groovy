// Rectangle and point
class Point {
   double x;
   double y;
}
class Rectangle {
    Point upLeft;
    Point downRight;
    double minX;
    double minY;
    double maxX;
    double maxY;
}
Rectangle rectangle1 = new Rectangle();
Rectangle rectangle2 = new Rectangle();
Point point = new Point();

print '''
 ===========================
 === Rectangles vs Point ===
 ===========================

''';
print '''
======= 1st Rectangle =======
'''
print "enter 1st x co-ordinate >> ";
rectangle1.upLeft = new Point();
rectangle1.upLeft.x=Double.parseDouble(System.console().readLine());
rectangle1.minX=rectangle1.upLeft.x;
rectangle1.maxX=rectangle1.upLeft.x;

print "enter 1st y co-ordinate >> ";
rectangle1.upLeft.y=Double.parseDouble(System.console().readLine());
rectangle1.minY=rectangle1.upLeft.y
rectangle1.minY=rectangle1.upLeft.y;

print "enter 2nd x co-ordinate >> ";
rectangle1.downRight = new Point();
rectangle1.downRight.x=Double.parseDouble(System.console().readLine());
if (rectangle1.downRight.x<rectangle1.minX) {rectangle1.minX=rectangle1.downRight.x} else {rectangle1.maxX=rectangle1.downRight.x};

print "enter 2nd y co-ordinate >> ";
rectangle1.downRight.y=Double.parseDouble(System.console().readLine());
if (rectangle1.downRight.y<rectangle1.minY) {minY=rectangle1.downRight.y} else {rectangle1.maxY=rectangle1.downRight.y};

print '''
======= 2nd Rectangle =======
'''
print "enter 1st x co-ordinate >> ";
rectangle2.upLeft = new Point();
rectangle2.upLeft.x=Double.parseDouble(System.console().readLine());
rectangle2.minX=rectangle2.upLeft.x;
rectangle2.maxX=rectangle2.upLeft.x;

print "enter 1st y co-ordinate >> ";
rectangle2.upLeft.y=Double.parseDouble(System.console().readLine());
rectangle2.minY=rectangle2.upLeft.y
rectangle2.minY=rectangle2.upLeft.y;

print "enter 2nd x co-ordinate >> ";
rectangle2.downRight = new Point();
rectangle2.downRight.x=Double.parseDouble(System.console().readLine());
if (rectangle2.downRight.x<rectangle2.minX) {rectangle2.minX=rectangle2.downRight.x} else {rectangle2.maxX=rectangle2.downRight.x};

print "enter 2nd y co-ordinate >> ";
rectangle2.downRight.y=Double.parseDouble(System.console().readLine());
if (rectangle2.downRight.y<rectangle2.minY) {minY=rectangle2.downRight.y} else {rectangle2.maxY=rectangle2.downRight.y};

print '''
====== the magic point ======
'''
print "enter outside point x co-ordinate >> ";
point.x=Double.parseDouble(System.console().readLine());
print "enter outside point y co-ordinate >> ";
point.y=Double.parseDouble(System.console().readLine());

if (point.x>=rectangle1.minX && point.x<=rectangle1.maxX && point.y>=rectangle1.minY && point.y<=rectangle1.maxY) {
    if (point.x>=rectangle2.minX && point.x<=rectangle2.maxX && point.y>=rectangle2.minY && point.y<=rectangle2.maxY) {
        println "Point is within both rectangles!"
    } else {
        println "Point is within only rectangle 1!";
    }
} else if (point.x>=rectangle2.minX && point.x<=rectangle2.maxX && point.y>=rectangle2.minY && point.y<=rectangle2.maxY) {
    println "Point is within only rectangle 2!";
} else {
    println "Point isn't within either rectangle."
}


