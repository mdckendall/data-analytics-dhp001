import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
    
    Scanner input= new Scanner(System.in);
    int option;
		while(true)
      {
        //Print User's options
        System.out.println("Press 1 to learn about salary.");
        System.out.println("Press 2 to learn about the job.");
        System.out.println("Press 3 to learn about demand.");
        System.out.println("Press 4 to view current students.");
        System.out.println("Press 5 to quit.");

        //Read an option
        option= input.nextInt();
        if(option==1) System.out.println("$98,345 average salary in South Florida!");
        if(option==2) System.out.println("US News - 100 Best Jobs!");
        if(option==3) System.out.println("Top 10 Forbes In-Demand Jobs!");
        if(option==4)
        {
          System.out.println("Current Students:");
          while (fileScanner.hasNextLine())
          {

          System.out.println(fileScanner.nextLine());
          }
        }
        if(option==5) break;        
        }
      }
	}