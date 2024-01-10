/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }
    public static String lowerCase(String s) 
    {
        String newString = "";
        char c ;
        
        for (int i = 0; i < s.length(); i++) 
        {
        
            if (Character.isLetter(s.charAt(i))) //Is c a letter?
            {
        
                if ((s.charAt(i) >= 'A') && (s.charAt(i)<= 'Z')) //Is c upper case?
                {
                    c = Character.toLowerCase(s.charAt(i)); //change c to lower case
                } 
                   else 
                   {c = s.charAt(i);}
                }       
                      else
                      {c = s.charAt(i);
             }

            newString = newString + c;
        }
        return newString;

 
    }
}