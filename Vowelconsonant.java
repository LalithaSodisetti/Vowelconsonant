package Practice;
import java.util.Scanner;
public class Vowelconsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isVowel=false;;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch=scanner.next().charAt(0); 
		scanner.close();
		switch(ch)
		{
		   case 'a' :
		   case 'e' :
		   case 'i' :
		   case 'o' :
		   case 'u' :
		   case 'A' :
		   case 'E' :
		   case 'I' :
		   case 'O' :
		   case 'U': System.out.println(ch+" is a Vowel.");
		   break;

		   default: System.out.println(ch+" is a Non-Vowel Character.");
		   
		}

	}

}


