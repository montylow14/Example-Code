public class Exercise_3_6
{
	public static void main(String[] args)
   {
   
      int numFactors=0; //Highest number of Factors
      int number=0; //The number with the most factors
      String numbers=""; //creates a list of all the numbers with the same number of factors
      
      for(int num=1; num <=10000; num++) //make numerator go from 1 to 10,000
      {
         int count = 0;    //number of factors current numerator has
         
         for(int denom=1; denom<=num; denom++)  //checks factors of numerator from 1 to numerator
         {
            if(num%denom == 0)
               count++;
         }
         
         if(count > numFactors)
         {
            numFactors = count; //set the new high number of factors
            number = num; //sets the number with the most factors
            numbers = number + "";
         }   
         else if(count == numFactors)
         {
            numbers = numbers + ", " + num;
         }
      }
      
      System.out.println("The greatest number of factors is: " + numFactors);
      System.out.println("The number with that many factors is: " + numbers);      
   }
}        