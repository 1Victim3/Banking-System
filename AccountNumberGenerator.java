package miniProjectAttempt2;

public class AccountNumberGenerator {
	 String AccountBuilder() {
		// chose a Character random from this String
		  String AllString = "ABCDEFGHIJKL"
		         + "0123456789"
		         + "abcdefghijkl";
		 
		  // create StringBuffer size of All The String possible
		  StringBuilder sb = new StringBuilder(17);
		  for (int i = 0; i < 17; i++)
		  {		 
		   // generate a random number between 0 to 17 As Account number has 17 As a length
		   int index = (int)(AllString.length()* Math.random());
		 
		   // add Character one by one in end of sb
		   sb.append(AllString.charAt(index));
		  }		 
		  return sb.toString();
	} 
		 
}
