import java.util.ArrayList; //import arraylist class

public class Main {
    
    //create arraylist to hold words
    public static ArrayList<String> words = new ArrayList<String>();

    static int maxSize = 5; //maximum number of characters in words

    //make words method

    public static void makeWords(int length, String word) {
        char whichletter = 'A';
  
        if (length > maxSize) {
            return;
        }
        
        while (whichletter <= 'Z') {
          String new_word = word + whichletter;
  
          words.add(new_word);
          //System.out.println(new_word);
          makeWords(length+1, new_word);
          
          whichletter++;
        }
      }


    public static void main(String[] args){

          //define two strings
    String pw1="1c75d402fb481523acd44e9d8247bc80";
    String pw2="5b1d59b5451c06afb65ab1bc2713cfb4";

    //create passwordHash object
    PasswordHash hasher = new PasswordHash();

    //call makeWords Method

    makeWords(1,"");

    //go over arraylist
    for(int x = 0; x < words.size(); x++){

       // System.out.println(words.get(x));

        //check if it matches passwords

        if(pw1.equals(hasher.hashPW(words.get(x)))){

            System.out.println("Found password 1: " + words.get(x));


        }

        if(pw2.equals(hasher.hashPW(words.get(x)))){

            System.out.println("Found password 2: " + words.get(x));

        }

    
    }

    }
}
