fun main(args: Array<String>) {

println("Select the math operation to be do:\n1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Modulo");
var sec:Int= readln().toInt();
    println("Enter first value: ");
    var first:Double= readln().toDouble();
    println("Enter second value: ");
    var second:Double= readln().toDouble();
    calculate(sec,first,second);

}
fun calculate(coos:Int,x: Double,y: Double)
{var sum:Double=0.0;
    var selection:Int=when(coos){
        1->{sum=x+y; 1}
        2->{sum=x-y; 2}
        3->{sum=x*y; 3}
        4->{sum=x/y; 4}
        5->{sum=x%y; 5}
        else-> {
            println("You selected wrong number");
            -1
        }


}
    println("Answer: "+sum);

}

