double d1 = 1.255
double d2 = d1 + 7 - 4 - 3
if (d1 == d2) {
    println("1.255 is equal to 1.255 plus 7 minus 7");
  } else {
    println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}

println "d1: $d1   d2: $d2"
println "my revised code: "

if ((d1-d2).abs()< 10E-6) {
    println("1.255 is equal to 1.255 plus 7 minus 7");
  } else {
    println("1.255 is NOT equal to 1.255 plus 7 minus 7");
}