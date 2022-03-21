/**
 * 
 * Implement Fizz Buzz Game with TDD
 * 
 * Players generally sit in a circle. The player designated to go first says the number "1",
 * and each player thenceforth counts one number in turn.
 * However, any number divisible by three is replaced by the word fizz and any number divisible by five by the word buzz.
 * Numbers divisible by 15 become fizz buzz.
 * A player who hesitates or makes a mistake is eliminated from the game.
 *
 * For example, a typical round of fizz buzz would start as follows:
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 
 * 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 
 * 31, 32, Fizz, 34, Buzz, Fizz, ...
 *
 * @author <Will>, <Kevin>
 */

public class Main { 
    
    /**
	 * Process a number
	 * @param num a number
	 * @return a string corresponds to that number
	 */
	public static String processNumber(int num) {
        // TODO: Write your code here
          if(num == 0)
          {
            return String.valueOf(0);  
          }
          else if(num % 15 == 0)
          {
            return "fizz buzz";
          }
          else if(num % 5 == 0)
          {
            return "buzz";
          }
          else if(num % 3 == 0)
          {
            return "fizz";
          }
          else
          {
            return String.valueOf(num);
          }
    }
    
    /**
	 * Process numbers
	 * @param nums an array of numbers
	 * @return a string corresponds to that numbers array
	 */
	public static String processNumbers(int[] nums) {
    String temp = "";
    if(nums.length == 0)
          {
            return "invalid";
          }
        for(int i = 0; i < nums.length; i++)
        {
          if(nums[i] == 0)
          {
            temp += String.valueOf(0) + ",";  
          }
          else if(nums[i] % 15 == 0)
          {
            temp += "fizz buzz,";
          }
          else if(nums[i] % 5 == 0)
          {
            temp += "buzz,";
          }
          else if(nums[i] % 3 == 0)
          {
            temp += "fizz,";
          }
          else
          {
            temp += String.valueOf(nums[i]) + ",";
          }
        }
        return temp;
    }
    
    /**
	 * Test processNumber
	 */
    private static void testProcessNumber() {
        System.out.println("Running processNumber test cases");
        // TODO: Write test cases for processNumber here using assertEquals
        // E.g., assertEquals(processNumber(1), "1");
      assertEquals(processNumber(1), "1");
      assertEquals(processNumber(15), "fizz buzz");
      assertEquals(processNumber(3), "fizz");
      assertEquals(processNumber(5), "buzz");
      assertEquals(processNumber(-1), "-1");
       assertEquals(processNumber(0), "0");
    }
    
    /**
	 * Test processNumbers
	 */
    private static void testProcessNumbers() {
        System.out.println("Running processNumbers test cases");
        // TODO: Write test cases for processNumbers here using assertEquals
        // E.g., assertEquals(processNumbers(new int[] {1}), "1");
      assertEquals(processNumbers(new int[] {}), "invalid");
      assertEquals(processNumbers(new int[] {1}), "1,");
      assertEquals(processNumbers(new int[] {1,2,3}), "1,2,fizz,");
    assertEquals(processNumbers(new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}), "1,2,fizz,4,buzz,fizz,7,8,fizz,buzz,11,fizz,13,14,fizz buzz,");
    }

    /**
	 * Implement assertEquals, print out Pass if actual string equals to expected; fail otherwise
	 * @param actual actual string
	 * @param expected expected string     
	 */
    private static void assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Pass");
        }
        else {
            System.out.println(String.format("Fail: expected: %s, actual: %s", expected, actual));
        }
    }
    
    public static void main(String[] args) {
        testProcessNumber();
        testProcessNumbers();
    }
}