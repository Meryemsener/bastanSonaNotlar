package mart30;
import java.util.Scanner;  // Import the Scanner class
public class m3_ScannerClas {
    /*
     The Scanner class is used to get user input,
     and it is found in the java.util package.
     To use the Scanner class, create an object
     of the class and use any of the available
     methods found in the Scanner class documentation.
     In our example, we will use the nextLine() method,
     which is used to read Strings:

     Tarayıcı sınıfı, kullanıcı girdisi almak için kullanılır,
     ve java.util paketinde bulunur.
     Scanner sınıfını kullanmak için bir nesne oluşturun
     sınıfın ve mevcut olanlardan herhangi birini kullanın
     Tarayıcı sınıfı belgelerinde bulunan yöntemler.
     Örneğimizde nextLine() yöntemini kullanacağız,
     Dizeleri okumak için kullanılır:

     */

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter username");

        String userName = myObj.nextLine();  // Read user input
        System.out.println("Username is: " + userName);  // Output user input
    }
}
