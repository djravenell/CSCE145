import java.util.Scanner;
/**
 * Auto Generated Java Class.
 */
public class ManyLoops {
  

  
  //G.T.O.E = greater than or equal to argument, >=
  //use a while loop or a do-while
  public static int smallestPowerOf2GTOE(int num) {
    int pow2 = 1;//2^0
    while(pow2 < num) {
    	pow2 *= 2;
    }
    return pow2;
  }
  
  //L.T.O.E = less than or equal to argument, <=
  //use a for loop
  //update step can use specialized assignment
  //may assume num > 2
  public static int greatestPowerOf2LTOE(int num) {
	int pow2 = 2;//2^1
	  for(int i = 1; pow2 <= num; ++i) {
		pow2 = (int)Math.pow(2, i);
	}
    return pow2/2;
  }
  
  
  // this method performs integer division (a/b)
  // you may assume a and b are both positive
  // use a loop to do it "manually"
  // this will return the quotient
  // DIY = do it yourself
  // you may assume b>0
  public static int  DIYDivide(int a, int b){  
	  int quotient = 0;
	  
	  while(a >= b) {
		  a -= b;
		  ++quotient;
	  }
	  return quotient;
  }
  
  /* this method performs the same thing as indexOf()
  * for String s, looking for char c
  * use a loop to do it "manually"
  * this returns -1 if c not in s
  * DIY = do it yourself
  * you can use charAt()
  * you can return at anypoint in your code (espcially in an if..)
  * you can return at multiple points too
  */
  public static int DIYindexOf(String s, char c){
	  int index = 0;
	  for(int i = 0; i < s.length(); ++i) {
    	
		  if (s.charAt(i) == c) {
    		index = i;
    		return index;
    	} else {
    		index = -1;
        }
		  
    } 
	  return index;
  }
  
  //returns the first n letters of alphabet, altoether as a String
  //you may assume n is >
  public static  String firstNAlphabet(int n){
    String letters = "";
	  for(int i = 0; i < n; ++i) {
		  char c = (char)(i+'a');
		  letters += c;
	  }
	  return letters;
  }
  
  //go until SUCCESSIVE repeats or nothing entered
  public static void goUntilRepeatsOrNothing(){
    //void functions don't return anything (you can use "return;", but don't have to)
	  String str1 = "";
	  String str2 = "";
	  boolean cont = true;
	  Scanner in = new Scanner(System.in);
	  
	  while(cont) {
		  str1 = in.nextLine();
		  
		  if(str1.equals("")) {
			  cont = false;
		  } else if (str1.equals(str2)) {
			  cont = false;
		  } else {
			  str2 = str1;
			  str1 = "";
		  }
		  
	  }
	  
  }
  
  //Don't need to fill anything out here
  public static void main(String[] args) { 
	System.out.println("Press \"Test\" to run JUnit tests");
    
    System.out.println("TEST goUntilRepeatsOrNothing() at command line for NOTHING, i.e. \"\"");
    goUntilRepeatsOrNothing();
    
    System.out.println("TEST goUntilRepeatsOrNothing() at command line for REPEATS");
    goUntilRepeatsOrNothing();
    
  } 
}
