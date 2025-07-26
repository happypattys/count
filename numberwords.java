import java.util.Scanner; 

public class numberwords {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a sentence or phrase: ");
        String inputSentence = scanner.nextLine(); 

        
        inputSentence = inputSentence.trim();

        
        if (inputSentence.isEmpty()) {
            System.out.println("The input is empty. Number of words: 0");
        } else {
            
            String[] words = inputSentence.split("\\s+");

            
            int wordCount = words.length;

            System.out.println("Number of words in the input: " + wordCount);
        }

        
        scanner.close();
    }
}
