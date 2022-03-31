        package mart30_javaOOP;

        public class k5_Constructos {
            /*
        Java Constructors
        A constructor in Java is a special method that is used to initialize objects.
        The constructor is called when an object of a class is created.
        It can be used to set initial values for object attributes:

        Example
        Create a constructor:

        // Create a Main class
        public class Main {
          int x;  // Create a class attribute

          // Create a class constructor for the Main class
          public Main() {
            x = 5;  // Set the initial value for the class attribute x
          }

          public static void main(String[] args) {
            Main myObj = new Main(); // Create an object of class Main
            (This will call the constructor)
            System.out.println(myObj.x); // Print the value of x
          }
        }

        // Outputs 5


        Note that the constructor name must match the class name, and it
         cannot have a return type (like void).

        Also note that the constructor is called when the object is created.

        All classes have constructors by default: if you do not create a
        class constructor yourself, Java creates one for you. However,
        then you are not able to set initial values for object attributes.
        Constructor Parameters
        Constructors can also take parameters, which is used to initialize attributes.

        The following example adds an int y parameter to the constructor.
        Inside the constructor we set x to y (x=y). When we call the constructor,
         we pass a parameter to the constructor (5), which will set the value of x to 5:

        Example
        public class Main {
          int x;

          public Main(int y) {
            x = y;
          }

          public static void main(String[] args) {
            Main myObj = new Main(5);
            System.out.println(myObj.x);
          }
        }

        // Outputs 5


        You can have as many parameters as you want:

        Example
        public class Main {
          int modelYear;
          String modelName;

          public Main(int year, String name) {
            modelYear = year;
            modelName = name;
          }

          public static void main(String[] args) {
            Main myCar = new Main(1969, "Mustang");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
          }
        }

        // Outputs 1969 Mustang




        Java Oluşturucuları
        Java'daki yapıcı, nesneleri başlatmak için kullanılan özel bir
        yöntemdir. Yapıcı, bir sınıfın nesnesi oluşturulduğunda çağrılır.
        Nesne nitelikleri için başlangıç ​​değerlerini ayarlamak için kullanılabilir:

        Örnek vermek
        Bir kurucu oluşturun:

        // Bir Ana sınıf oluşturun
        genel sınıf Ana {
          int x; // Bir sınıf niteliği oluştur

          // Ana sınıf için bir sınıf kurucusu oluşturun
          genel Ana() {
            x = 5; // x sınıfı özniteliği için başlangıç değerini ayarlayın
          }

          public static void main(String[] args) {
            Ana myObj = yeni Ana(); // Main sınıfından bir nesne oluşturun
             (Bu, yapıcıyı çağırır)
            System.out.println(myObj.x); // x'in değerini yazdır
          }
        }

        // Çıkışlar 5


        Yapıcı adının sınıf adıyla eşleşmesi gerektiğine ve bir dönüş türüne
        (void gibi) sahip olamayacağına dikkat edin.

        Ayrıca, nesne oluşturulduğunda yapıcının çağrıldığını unutmayın.

        Tüm sınıfların varsayılan olarak kurucuları vardır: Kendiniz bir sınıf
        kurucusu oluşturmazsanız, Java sizin için bir tane oluşturur.
        Ancak, o zaman nesne nitelikleri için başlangıç değerleri ayarlayamazsınız.

        Yapıcı Parametreleri
        Yapıcılar, öznitelikleri başlatmak için kullanılan parametreleri de alabilir.

        Aşağıdaki örnek, yapıcıya bir int y parametresi ekler.
        Yapıcının içinde x'i y'ye (x=y) ayarladık. Yapıcıyı çağırdığımızda, yapıcıya
        (5), x'in değerini 5'e ayarlayacak bir parametre iletiyoruz:

        Örnek vermek
        genel sınıf Ana {
          int x;

          public Main(int y) {
            x = y;
          }

          public static void main(String[] args) {
            Ana myObj = yeni Ana(5);
            System.out.println(myObj.x);
          }
        }

        // Çıkışlar 5


        İstediğiniz kadar parametreye sahip olabilirsiniz:

        Örnek vermek
        genel sınıf Ana {
          int modelYıl;
          Dize modeliAdı;

          public Main(int yıl, Dize adı) {
            modelYıl = yıl;
            modelAdı = isim;
          }

          public static void main(String[] args) {
            Ana myCar = yeni Ana(1969, "Mustang");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
          }
        }

        // 1969 Mustang çıktıları




             */
        }
