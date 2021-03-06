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




        Java Olu??turucular??
        Java'daki yap??c??, nesneleri ba??latmak i??in kullan??lan ??zel bir
        y??ntemdir. Yap??c??, bir s??n??f??n nesnesi olu??turuldu??unda ??a??r??l??r.
        Nesne nitelikleri i??in ba??lang???? ??????de??erlerini ayarlamak i??in kullan??labilir:

        ??rnek vermek
        Bir kurucu olu??turun:

        // Bir Ana s??n??f olu??turun
        genel s??n??f Ana {
          int x; // Bir s??n??f niteli??i olu??tur

          // Ana s??n??f i??in bir s??n??f kurucusu olu??turun
          genel Ana() {
            x = 5; // x s??n??f?? ??zniteli??i i??in ba??lang???? de??erini ayarlay??n
          }

          public static void main(String[] args) {
            Ana myObj = yeni Ana(); // Main s??n??f??ndan bir nesne olu??turun
             (Bu, yap??c??y?? ??a????r??r)
            System.out.println(myObj.x); // x'in de??erini yazd??r
          }
        }

        // ????k????lar 5


        Yap??c?? ad??n??n s??n??f ad??yla e??le??mesi gerekti??ine ve bir d??n???? t??r??ne
        (void gibi) sahip olamayaca????na dikkat edin.

        Ayr??ca, nesne olu??turuldu??unda yap??c??n??n ??a??r??ld??????n?? unutmay??n.

        T??m s??n??flar??n varsay??lan olarak kurucular?? vard??r: Kendiniz bir s??n??f
        kurucusu olu??turmazsan??z, Java sizin i??in bir tane olu??turur.
        Ancak, o zaman nesne nitelikleri i??in ba??lang???? de??erleri ayarlayamazs??n??z.

        Yap??c?? Parametreleri
        Yap??c??lar, ??znitelikleri ba??latmak i??in kullan??lan parametreleri de alabilir.

        A??a????daki ??rnek, yap??c??ya bir int y parametresi ekler.
        Yap??c??n??n i??inde x'i y'ye (x=y) ayarlad??k. Yap??c??y?? ??a????rd??????m??zda, yap??c??ya
        (5), x'in de??erini 5'e ayarlayacak bir parametre iletiyoruz:

        ??rnek vermek
        genel s??n??f Ana {
          int x;

          public Main(int y) {
            x = y;
          }

          public static void main(String[] args) {
            Ana myObj = yeni Ana(5);
            System.out.println(myObj.x);
          }
        }

        // ????k????lar 5


        ??stedi??iniz kadar parametreye sahip olabilirsiniz:

        ??rnek vermek
        genel s??n??f Ana {
          int modelY??l;
          Dize modeliAd??;

          public Main(int y??l, Dize ad??) {
            modelY??l = y??l;
            modelAd?? = isim;
          }

          public static void main(String[] args) {
            Ana myCar = yeni Ana(1969, "Mustang");
            System.out.println(myCar.modelYear + " " + myCar.modelName);
          }
        }

        // 1969 Mustang ????kt??lar??




             */
        }
