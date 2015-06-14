

object P02{
      def helper(arg: List[Int]): Int  = {
         arg match {
            case Nil   => sys.error("no")
            case h::_::Nil => h
            case h::tl => helper(tl)
         }
      }
}


