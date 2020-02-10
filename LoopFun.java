 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          int j = 1;
         if (number == 0) {
          j= 1; 
        }
        else {
        j= number*factorial(number-1); 
    
    } 
  return j;
}
      

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String acronym = "";
          String words[] = phrase.split(" ");
         for(String s : words){
             acronym += s.charAt(0);
            }
            
          return acronym.toUpperCase();
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          
          char[] ch = new char[word.length()];
          for(int i = 0; i < word.length(); i++){
              ch[i] = word.charAt(i);
            }
            for(int i = 0; i < ch.length; i++){
                if(ch[i] == 120){ //122 - z    97 - a
                    ch[i] = 97;
                }
                else if(ch[i] == 121){
                    ch[i] = 98;
                }
                else if(ch[i] == 122){
                    ch[i] = 99;
                }
                else{
                    int j = 3;
                   while(j!=0){
                       ch[i]++;
                    j-= 1;
                    }
                }
            }
            String result = String.valueOf(ch);
          return result;
      }
}
