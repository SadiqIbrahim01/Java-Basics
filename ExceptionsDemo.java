public class ExceptionsDemo {
    public static void main(String[] args) {
        try {  
            int[] arr = new int[2];
            System.out.println(arr[3]); 
        } catch (ArrayIndexOutOfBoundsException e) { 
            System.out.println("Error: " + e.getMessage());  
        } catch (Exception e) {  
            System.out.println("General error: " + e);
        } finally { 
            System.out.println("Cleanup done.");
        }
        
      
        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
    
   
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be negative!"); 
        }
        System.out.println("Valid age.");
    }
}