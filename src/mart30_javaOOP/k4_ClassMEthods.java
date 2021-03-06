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











            Java S??n??f?? Y??ntemleri
            Java Y??ntemleri b??l??m??nden, y??ntemlerin bir s??n??f i??inde
            bildirildi??ini ve belirli eylemleri ger??ekle??tirmek i??in kullan??ld??????n?? ????rendiniz:

            ??rnek vermek
            Main'de myMethod() adl?? bir y??ntem olu??turun:

            genel s??n??f Ana {
              statik ge??ersiz myMethod() {
                System.out.println("Merhaba D??nya!");
              }
            }

            myMethod(), ??a??r??ld??????nda bir metin (eylem) yazd??r??r. Bir y??ntemi
            ??a????rmak i??in, y??ntemin ad??n?? ve ard??ndan iki parantez () ve noktal?? virg??l yaz??n;

            ??rnek vermek
            Main i??inde myMethod() ????esini ??a????r??n:

            genel s??n??f Ana {
              statik ge??ersiz myMethod() {
                System.out.println("Merhaba D??nya!");
              }

              public static void main(String[] args) {
                benimY??ntem();
              }
            }

            // ????kt?? "Merhaba D??nya!"


            Statik ve Statik Olmayan
            Statik veya genel niteliklere ve y??ntemlere sahip Java programlar??n??
            s??k s??k g??receksiniz.

            Yukar??daki ??rnekte, yaln??zca nesneler taraf??ndan eri??ilebilen public'ten
            farkl?? olarak, s??n??f??n bir nesnesi olu??turulmadan eri??ilebilece??i anlam??na
            gelen statik bir y??ntem olu??turduk:

            ??rnek vermek
            Statik ve genel y??ntemler aras??ndaki farklar?? g??steren bir ??rnek:

            genel s??n??f Ana {
              // Statik y??ntem
              statik bo??luk myStaticMethod() {
                System.out.println("Statik metotlar nesne yaratmadan ??a??r??labilir");
              }

              // Genel y??ntem
              public void myPublicMethod() {
                System.out.println("Genel metotlar nesneler yarat??larak ??a??r??lmal??d??r");
              }

              // Ana y??ntem
              public static void main(String[] args) {
                benimStaticMethod(); // Statik y??ntemi ??a????r??n
                // benimPublicMethod(); Bu bir hata derler

                Ana myObj = yeni Ana(); // Bir Main nesnesi olu??turun
                myObj.myPublicMethod(); // Nesne ??zerinde genel y??ntemi ??a????r??n
              }
            }



            Not: Java De??i??tiriciler b??l??m??nde bu anahtar s??zc??kler (de??i??tiriciler
            olarak adland??r??l??r) hakk??nda daha fazla bilgi edineceksiniz.
            Bir Nesne ile Eri??im Y??ntemleri
            ??rnek vermek
            myCar adl?? bir Car nesnesi olu??turun. myCar nesnesindeki fullThrottle()
            ve speed() y??ntemlerini ??a????r??n ve program?? ??al????t??r??n:

            // Bir Ana s??n??f olu??turun
            genel s??n??f Ana {

              // bir fullThrottle() y??ntemi olu??turun
              public void fullThrottle() {
                System.out.println("Araba olabildi??ince h??zl?? gidiyor!");
              }

              // Bir speed() y??ntemi olu??turun ve bir parametre ekleyin
              public void speed(int maxSpeed) {
                System.out.println("Maksimum h??z: " + maxSpeed);
              }

              // main i??inde, myCar nesnesindeki y??ntemleri ??a????r??n
              public static void main(String[] args) {
                Ana myCar = yeni Ana(); // bir myCar nesnesi olu??tur
                myCar.fullThrottle(); // fullThrottle() y??ntemini ??a????r??n
                myCar.speed(200); // speed() y??ntemini ??a????r??n
              }
            }

            // Araba olabildi??ince h??zl?? gidiyor!
            // Maksimum h??z: 200

            ??rnek a????klama
            1) class anahtar kelimesi ile ??zel bir Ana s??n??f olu??turduk.

            2) Main s??n??f??nda fullThrottle() ve speed() y??ntemlerini olu??turduk.

            3) fullThrottle() y??ntemi ve speed() y??ntemi, ??a??r??ld??klar??nda bir
            miktar metin yazd??racakt??r.

            4) speed() y??ntemi, maxSpeed ??????adl?? bir int parametresini kabul
             eder - bunu 8'de kullanaca????z).

            5) Main s??n??f?? ve y??ntemlerini kullanmak i??in Main Class'tan bir nesne
            olu??turmam??z gerekiyor.

            6) Ard??ndan, ??imdiye kadar program??n??z?? ??al????t??ran yerle??ik bir Java
            y??ntemi oldu??unu bildi??iniz main() y??ntemine gidin (main i??indeki herhangi bir
             kod y??r??t??l??r).

            7) new anahtar s??zc??????n?? kullanarak myCar ad??nda bir nesne olu??turduk.

            8) Ard??ndan myCar nesnesi ??zerinde fullThrottle() ve speed() y??ntemlerini
            ??a????r??r ve nesnenin ad??n?? (myCar), ard??ndan bir nokta (.), ard??ndan y??ntemin ad??n?? () kullanarak program?? ??al????t??r??r??z. fullThrottle(); ve h??z(200);). speed() y??nteminin i??ine 200'l??k bir int parametresi ekledi??imize dikkat edin.

            Bunu hat??rla..
            Nokta (.) nesnenin ??zniteliklerine ve y??ntemlerine eri??mek i??in kullan??l??r.

            Java'da bir y??ntemi ??a????rmak i??in, y??ntem ad??n?? ve ard??ndan bir dizi
            parantez () ve ard??ndan noktal?? virg??l (;) yaz??n.

            Bir s??n??f??n e??le??en bir dosya ad?? olmal??d??r (Main ve Main.java).
            Birden ??ok S??n??f Kullanma
            S??n??flar b??l??m??nde belirtti??imiz gibi, bir s??n??f??n nesnesini olu??turmak
            ve ona ba??ka bir s??n??ftan eri??mek iyi bir uygulamad??r.

            Java dosyas??n??n ad??n??n s??n??f ad??yla e??le??mesi gerekti??ini unutmay??n.
            Bu ??rnekte, ayn?? dizinde iki dosya olu??turduk:

            ana.java
            ikinci.java
            ana.java
            genel s??n??f Ana {
              public void fullThrottle() {
                System.out.println("Araba olabildi??ince h??zl?? gidiyor!");
              }

              public void speed(int maxSpeed) {
                System.out.println("Maksimum h??z: " + maxSpeed);
              }
            }
            ikinci.java
            s??n??f ??kinci {
              public static void main(String[] args) {
                Ana myCar = yeni Ana(); // bir myCar nesnesi olu??tur
                myCar.fullThrottle(); // fullThrottle() y??ntemini ??a????r??n
                myCar.speed(200); // speed() y??ntemini ??a????r??n
              }
            }
            Her iki dosya da derlendi??inde:

            C:\Kullan??c??lar\Ad??n??z>javac Main.java
            C:\Kullan??c??lar\Ad??n??z>javac Second.java
            Second.java dosyas??n?? ??al????t??r??n:

            C:\Kullan??c??lar\Ad??n??z>java ??kinci
            Ve ????kt?? ????yle olacakt??r:

            Araba olabildi??ince h??zl?? gidiyor!
            Maksimum h??z: 200

                 */
            }
