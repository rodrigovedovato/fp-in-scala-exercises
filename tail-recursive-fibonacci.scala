    def fibonacci(at: Int) = {
      def go(pos: Int, x0: Int, x1: Int) : Int = {
        if (pos == at) x1 else go(pos + 1, x1, x0 + x1)
      }
    
      go(1, 0, 1)
    }
  
