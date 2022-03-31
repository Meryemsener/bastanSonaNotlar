            package mart30_javaOOP;

            public class k4_ClassMEthods {
                /*
                Java Class Methods
            You learned from the Java Methods chapter that methods are declared within a
            class, and that they are used to perform certain actions:

            Example
            Create a method named myMethod() in Main:

            public class Main {
              static void myMethod() {
                System.out.println("Hello World!");
              }
            }

            myMethod() prints a text (the action), when it is called. To call a method,
             write the method's name followed by two parentheses () and a semicolon;

            Example
            Inside main, call myMethod():

            public class Main {
              static void myMethod() {
                System.out.println("Hello World!");
              }

              public static void main(String[] args) {
                myMethod();
              }
            }

            // Outputs "Hello World!"


            Static vs. Non-Static
            You will often see Java programs that have either static or public attributes
             and methods.

            In the example above, we created a static method, which means that it can be
            accessed without creating an object of the class, unlike public, which can
             only be accessed by objects:

            Example
            An example to demonstrate the differences between static and public methods:

            public class Main {
              // Static method
              static void myStaticMethod() {
                System.out.println("Static methods can be called without creating objects");
              }

              // Public method
              public void myPublicMethod() {
                System.out.println("Public methods must be called by creating objects");
              }

              // Main method
              public static void main(String[] args) {
                myStaticMethod(); // Call the static method
                // myPublicMethod(); This would compile an error

                Main myObj = new Main(); // Create an object of Main
                myObj.myPublicMethod(); // Call the public method on the object
              }
            }



            Note: You will learn more about these keywords (called modifiers)
            in the Java Modifiers chapter.
            Access Methods With an Object
            Example
            Create a Car object named myCar. Call the fullThrottle() and speed()
             methods on the myCar object, and run the program:

            // Create a Main class
            public class Main {

              // Create a fullThrottle() method
              public void fullThrottle() {
                System.out.println("The car is going as fast as it can!");
              }

              // Create a speed() method and add a parameter
              public void speed(int maxSpeed) {
                System.out.println("Max speed is: " + maxSpeed);
              }

              // Inside main, call the methods on the myCar object
              public static void main(String[] args) {
                Main myCar = new Main();   // Create a myCar object
                myCar.fullThrottle();      // Call the fullThrottle() method
                myCar.speed(200);          // Call the speed() method
              }
            }

            // The car is going as fast as it can!
            // Max speed is: 200

            Example explained
            1) We created a custom Main class with the class keyword.

            2) We created the fullThrottle() and speed() methods in the Main class.

            3) The fullThrottle() method and the speed() method will print out some
            text, when they are called.

            4) The speed() method accepts an int parameter called maxSpeed - we will use
            this in 8).

            5) In order to use the Main class and its methods, we need to create an object
            of the Main Class.

            6) Then, go to the main() method, which you know by now is a built-in Java method
            that runs your program (any code inside main is executed).

            7) By using the new keyword we created an object with the name myCar.

            8) Then, we call the fullThrottle() and speed() methods on the myCar object,
            and run the program using the name of the object (myCar), followed by a dot (.),
            followed by the name of the method (fullThrottle(); and speed(200);). Notice that
             we add an int parameter of 200 inside the speed() method.

            Remember that..
            The dot (.) is used to access the object's attributes and methods.

            To call a method in Java, write the method name followed by a set of
            parentheses(), followed by a semicolon (;).

            A class must have a matching filename (Main and Main.java).
            Using Multiple Classes
            Like we specified in the Classes chapter, it is a good practice to create an
            object of a class and access it in another class.

            Remember that the name of the java file should match the class name. In this
            example, we have created two files in the same directory:

            Main.java
            Second.java
            Main.java
            public class Main {
              public void fullThrottle() {
                System.out.println("The car is going as fast as it can!");
              }

              public void speed(int maxSpeed) {
                System.out.println("Max speed is: " + maxSpeed);
              }
            }
            Second.java
            class Second {
              public static void main(String[] args) {
                Main myCar = new Main();     // Create a myCar object
                myCar.fullThrottle();      // Call the fullThrottle() method
                myCar.speed(200);          // Call the speed() method
              }
            }
            When both files have been compiled:

            C:\Users\Your Name>javac Main.java
            C:\Users\Your Name>javac Second.java
            Run the Second.java file:

            C:\Users\Your Name>java Second
            And the output will be:

            The car is going as fast as it can!
            Max speed is: 200











            Java Sınıfı Yöntemleri
            Java Yöntemleri bölümünden, yöntemlerin bir sınıf içinde
            bildirildiğini ve belirli eylemleri gerçekleştirmek için kullanıldığını öğrendiniz:

            Örnek vermek
            Main'de myMethod() adlı bir yöntem oluşturun:

            genel sınıf Ana {
              statik geçersiz myMethod() {
                System.out.println("Merhaba Dünya!");
              }
            }

            myMethod(), çağrıldığında bir metin (eylem) yazdırır. Bir yöntemi
            çağırmak için, yöntemin adını ve ardından iki parantez () ve noktalı virgül yazın;

            Örnek vermek
            Main içinde myMethod() öğesini çağırın:

            genel sınıf Ana {
              statik geçersiz myMethod() {
                System.out.println("Merhaba Dünya!");
              }

              public static void main(String[] args) {
                benimYöntem();
              }
            }

            // Çıktı "Merhaba Dünya!"


            Statik ve Statik Olmayan
            Statik veya genel niteliklere ve yöntemlere sahip Java programlarını
            sık sık göreceksiniz.

            Yukarıdaki örnekte, yalnızca nesneler tarafından erişilebilen public'ten
            farklı olarak, sınıfın bir nesnesi oluşturulmadan erişilebileceği anlamına
            gelen statik bir yöntem oluşturduk:

            Örnek vermek
            Statik ve genel yöntemler arasındaki farkları gösteren bir örnek:

            genel sınıf Ana {
              // Statik yöntem
              statik boşluk myStaticMethod() {
                System.out.println("Statik metotlar nesne yaratmadan çağrılabilir");
              }

              // Genel yöntem
              public void myPublicMethod() {
                System.out.println("Genel metotlar nesneler yaratılarak çağrılmalıdır");
              }

              // Ana yöntem
              public static void main(String[] args) {
                benimStaticMethod(); // Statik yöntemi çağırın
                // benimPublicMethod(); Bu bir hata derler

                Ana myObj = yeni Ana(); // Bir Main nesnesi oluşturun
                myObj.myPublicMethod(); // Nesne üzerinde genel yöntemi çağırın
              }
            }



            Not: Java Değiştiriciler bölümünde bu anahtar sözcükler (değiştiriciler
            olarak adlandırılır) hakkında daha fazla bilgi edineceksiniz.
            Bir Nesne ile Erişim Yöntemleri
            Örnek vermek
            myCar adlı bir Car nesnesi oluşturun. myCar nesnesindeki fullThrottle()
            ve speed() yöntemlerini çağırın ve programı çalıştırın:

            // Bir Ana sınıf oluşturun
            genel sınıf Ana {

              // bir fullThrottle() yöntemi oluşturun
              public void fullThrottle() {
                System.out.println("Araba olabildiğince hızlı gidiyor!");
              }

              // Bir speed() yöntemi oluşturun ve bir parametre ekleyin
              public void speed(int maxSpeed) {
                System.out.println("Maksimum hız: " + maxSpeed);
              }

              // main içinde, myCar nesnesindeki yöntemleri çağırın
              public static void main(String[] args) {
                Ana myCar = yeni Ana(); // bir myCar nesnesi oluştur
                myCar.fullThrottle(); // fullThrottle() yöntemini çağırın
                myCar.speed(200); // speed() yöntemini çağırın
              }
            }

            // Araba olabildiğince hızlı gidiyor!
            // Maksimum hız: 200

            Örnek açıklama
            1) class anahtar kelimesi ile özel bir Ana sınıf oluşturduk.

            2) Main sınıfında fullThrottle() ve speed() yöntemlerini oluşturduk.

            3) fullThrottle() yöntemi ve speed() yöntemi, çağrıldıklarında bir
            miktar metin yazdıracaktır.

            4) speed() yöntemi, maxSpeed ​​adlı bir int parametresini kabul
             eder - bunu 8'de kullanacağız).

            5) Main sınıfı ve yöntemlerini kullanmak için Main Class'tan bir nesne
            oluşturmamız gerekiyor.

            6) Ardından, şimdiye kadar programınızı çalıştıran yerleşik bir Java
            yöntemi olduğunu bildiğiniz main() yöntemine gidin (main içindeki herhangi bir
             kod yürütülür).

            7) new anahtar sözcüğünü kullanarak myCar adında bir nesne oluşturduk.

            8) Ardından myCar nesnesi üzerinde fullThrottle() ve speed() yöntemlerini
            çağırır ve nesnenin adını (myCar), ardından bir nokta (.), ardından yöntemin adını () kullanarak programı çalıştırırız. fullThrottle(); ve hız(200);). speed() yönteminin içine 200'lük bir int parametresi eklediğimize dikkat edin.

            Bunu hatırla..
            Nokta (.) nesnenin özniteliklerine ve yöntemlerine erişmek için kullanılır.

            Java'da bir yöntemi çağırmak için, yöntem adını ve ardından bir dizi
            parantez () ve ardından noktalı virgül (;) yazın.

            Bir sınıfın eşleşen bir dosya adı olmalıdır (Main ve Main.java).
            Birden Çok Sınıf Kullanma
            Sınıflar bölümünde belirttiğimiz gibi, bir sınıfın nesnesini oluşturmak
            ve ona başka bir sınıftan erişmek iyi bir uygulamadır.

            Java dosyasının adının sınıf adıyla eşleşmesi gerektiğini unutmayın.
            Bu örnekte, aynı dizinde iki dosya oluşturduk:

            ana.java
            ikinci.java
            ana.java
            genel sınıf Ana {
              public void fullThrottle() {
                System.out.println("Araba olabildiğince hızlı gidiyor!");
              }

              public void speed(int maxSpeed) {
                System.out.println("Maksimum hız: " + maxSpeed);
              }
            }
            ikinci.java
            sınıf İkinci {
              public static void main(String[] args) {
                Ana myCar = yeni Ana(); // bir myCar nesnesi oluştur
                myCar.fullThrottle(); // fullThrottle() yöntemini çağırın
                myCar.speed(200); // speed() yöntemini çağırın
              }
            }
            Her iki dosya da derlendiğinde:

            C:\Kullanıcılar\Adınız>javac Main.java
            C:\Kullanıcılar\Adınız>javac Second.java
            Second.java dosyasını çalıştırın:

            C:\Kullanıcılar\Adınız>java İkinci
            Ve çıktı şöyle olacaktır:

            Araba olabildiğince hızlı gidiyor!
            Maksimum hız: 200

                 */
            }
