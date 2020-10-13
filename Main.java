
/**
 *Tells user their first digit
 * @author Tolga Nurtekin 
 */
public class Main {

  public static int firstDigit(int userNum){
    while(userNum > 10 || userNum < -10){
      userNum = userNum/10;
    }
    return userNum;
  }


  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    
    
    
    //create total variable
    int total = Math.abs(firstDigit(-35));
    //tell user their first first digit
    System.out.println(total);

    
  }
}
