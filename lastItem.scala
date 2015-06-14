/* Get last element of a list
 * in:      List(A, A ,A ,A') 
 * out:     A'
 */
object P01{
   def main(args: Array[String]){
     println(helper(args)) 
   }
   def helper(args: Array[String]):Int = {

     if (args.length > 1) 
        helper(args.tail)
     else 
        args(0).toInt
   }

}
