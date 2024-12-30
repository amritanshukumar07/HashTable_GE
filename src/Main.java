import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 10 HashTable Program ");
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] words = paragraph.toLowerCase().split(" ");
        HashTable<String,Integer>map= new HashTable<>();

        // calculate freq of each word

        for( String word: words){
            Integer count= map.get(word);
            if(count==null){
                map.put(word,1);
            }else{
                map.put(word,count+1);
            }
        }

        System.out.println("Word Frequencies");
        map.display();


    }
}