//Defining an array of integers and calculating the product of its elements.
fun main(args: Array<String>) {
    var nums :IntArray = intArrayOf(13,34,52,7);
    
    var sum :Int =0;
    for(num in nums) {
        sum +=num;
    }
    println("The product of the elements in the array is $sum.")
    println("======================================")
    
//Defining a range of numbers from 0 to 100,and outputting only the odd numbers in that range.

println("Odd numbers from 1 to 100:");
    var rr = 1..100 step 2;
    for(range in rr) {
        println(range);
    }
}