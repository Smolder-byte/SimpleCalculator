package projectb;

public class Calculator {

 public  double multiply(double a, double b)   {
    return a*b;
}

 
 

    public double power (double a, double b) {
        return Math.pow(a,b);
    }

    
    public double add(double a, double b){
        return a + b;
    }
    
    public double subtract(double a, double b){
        return a - b;
    }
  
   public  double divide(double a, double b)   {
    return a/b;
    
} 
  
// public double divide(double a, double b) throws Exception {
//        if (b == 0) { 
//            throw new Exception("На ноль делить нельзя"); 
//        }
//        return a / b;
//    }
}