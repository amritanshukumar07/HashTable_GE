import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to day 10 HashTable Program ");
        String sentence= "To be or not to be";
        String[] words= sentence.toLowerCase().split(" ");
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