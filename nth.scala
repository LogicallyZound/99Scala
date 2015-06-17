def nth (n: Int, ls:List[Any]): Any = {
   (n, ls) match{
      case (0, h::t) => h 
      case (_, Nil) =>  throw new NoSuchElementException
      case (_, h::t) => nth(n-1, t)
   }
}

println (nth(2, List(1,2,3,4,5)))
println (nth(4, List(1,2,3,4,5)))
println (nth(5, List(1,2,3,4,5)))
