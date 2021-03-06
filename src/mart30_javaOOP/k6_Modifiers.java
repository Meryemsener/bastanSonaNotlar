        package mart30_javaOOP;

        public class k6_Modifiers {
            /*
            Modifiers
        By now, you are quite familiar with the public keyword that appears
        in almost all of our examples:

        public class Main
        The public keyword is an access modifier, meaning that it is used
        to set the access level for classes, attributes, methods and constructors.

        We divide modifiers into two groups:

        Access Modifiers - controls the access level
        Non-Access Modifiers - do not control access level, but
        provides other functionality
        Access Modifiers
        For classes, you can use either public or default:

        Modifier	Description	Try it
        public	The class is accessible by any other class
        default	The class is only accessible by classes in the same package.
        This is used when you don't specify a modifier. You will learn more
        about packages in the Packages chapter
        For attributes, methods and constructors, you can use the one of the following:

        Modifier	Description	Try it
        public	The code is accessible for all classes
        private	The code is only accessible within the declared class
        default	The code is only accessible in the same package.
        This is used when you don't specify a modifier. You will
         learn more about packages in the Packages chapter
        protected	The code is accessible in the same package and subclasses.
         You will learn more about subclasses and superclasses in the Inheritance chapter

        Non-Access Modifiers
        For classes, you can use either final or abstract:

        Modifier	Description	Try it
        final	The class cannot be inherited by other classes
         (You will learn more about inheritance in the Inheritance chapter)
        abstract	The class cannot be used to create objects
        (To access an abstract class, it must be inherited from another class.
         You will learn more about inheritance and abstraction in the
         Inheritance and Abstraction chapters)
        For attributes and methods, you can use the one of the following:

        Modifier	Description
        final	Attributes and methods cannot be overridden/modified
        static	Attributes and methods belongs to the class, rather than an object
        abstract	Can only be used in an abstract class, and can only be used on
        methods. The method does not have a body, for example abstract void run();.
        The body is provided by the subclass (inherited from). You will learn more
         about inheritance and abstraction in the Inheritance and Abstraction chapters
        transient	Attributes and methods are skipped when serializing the object
        containing them
        synchronized	Methods can only be accessed by one thread at a time
        volatile	The value of an attribute is not cached thread-locally,
         and is always read from the "main memory"
        Final
        If you don't want the ability to override existing attribute values,
         declare attributes as final:

        Example
        public class Main {
          final int x = 10;
          final double PI = 3.14;

          public static void main(String[] args) {
            Main myObj = new Main();
            myObj.x = 50; // will generate an error: cannot assign a value to a final
            variable
            myObj.PI = 25; // will generate an error: cannot assign a value to a final
            variable
            System.out.println(myObj.x);
          }
        }



        Static
        A static method means that it can be accessed without creating an
        object of the class, unlike public:

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
          public static void main(String[ ] args) {
            myStaticMethod(); // Call the static method
            // myPublicMethod(); This would output an error

            Main myObj = new Main(); // Create an object of Main
            myObj.myPublicMethod(); // Call the public method
          }
        }



        Abstract
        An abstract method belongs to an abstract class, and it does not have a body.
        The body is provided by the subclass:

        Example
        // Code from filename: Main.java
        // abstract class
        abstract class Main {
          public String fname = "John";
          public int age = 24;
          public abstract void study(); // abstract method
        }

        // Subclass (inherit from Main)
        class Student extends Main {
          public int graduationYear = 2018;
          public void study() { // the body of the abstract method is provided here
            System.out.println("Studying all day long");
          }
        }
        // End code from filename: Main.java

        // Code from filename: Second.java
        class Second {
          public static void main(String[] args) {
            // create an object of the Student class (which inherits attributes
            and methods from Main)
            Student myObj = new Student();

            System.out.println("Name: " + myObj.fname);
            System.out.println("Age: " + myObj.age);
            System.out.println("Graduation Year: " + myObj.graduationYear);
            myObj.study(); // call abstract method
          }
        }











        de??i??tiriciler
        ??imdiye kadar, hemen hemen t??m ??rneklerimizde g??r??nen genel anahtar
        kelimeye olduk??a a??inas??n??z:

        genel s??n??f Ana
        Public anahtar s??zc?????? bir eri??im de??i??tiricisidir, yani s??n??flar,
         nitelikler, y??ntemler ve kurucular i??in eri??im d??zeyini ayarlamak i??in kullan??l??r.

        De??i??tiricileri iki gruba ay??r??yoruz:

        Eri??im De??i??tiricileri - eri??im seviyesini kontrol eder
        Eri??im D?????? De??i??tiriciler - eri??im seviyesini kontrol etmeyin,
        ancak ba??ka i??levler sa??lar
        Eri??im De??i??tiricileri
        S??n??flar i??in genel veya varsay??lan?? kullanabilirsiniz:

        De??i??tirici A????klama Deneyin
        public S??n??fa ba??ka herhangi bir s??n??f taraf??ndan eri??ilebilir
        varsay??lan S??n??fa yaln??zca ayn?? paketteki s??n??flar taraf??ndan eri??ilebilir.
        Bu, bir de??i??tirici belirtmedi??inizde kullan??l??r. Paketler
        b??l??m??nde paketler hakk??nda daha fazla bilgi edineceksiniz.
        Nitelikler, y??ntemler ve kurucular i??in a??a????dakilerden birini kullanabilirsiniz:

        De??i??tirici A????klama Deneyin
        public Kod t??m s??n??flar i??in eri??ilebilirdir
        private Kod yaln??zca belirtilen s??n??f i??inde eri??ilebilir
        varsay??lan Kod yaln??zca ayn?? paketten eri??ilebilir. Bu, bir
        de??i??tirici belirtmedi??inizde kullan??l??r. Paketler b??l??m??nde paketler
        hakk??nda daha fazla bilgi edineceksiniz.
        korumal?? Kod, ayn?? paket ve alt s??n??flarda eri??ilebilir. Kal??t??m b??l??m??nde
        alt s??n??flar ve ??st s??n??flar hakk??nda daha fazla bilgi edineceksiniz.
        de??i??tiriciler
        ??imdiye kadar, hemen hemen t??m ??rneklerimizde g??r??nen genel anahtar kelimeye
         olduk??a a??inas??n??z:

        genel s??n??f Ana
        Public anahtar s??zc?????? bir eri??im de??i??tiricisidir, yani s??n??flar,
        nitelikler, y??ntemler ve kurucular i??in eri??im d??zeyini ayarlamak i??in kullan??l??r.

        De??i??tiricileri iki gruba ay??r??yoruz:

        Eri??im De??i??tiricileri - eri??im seviyesini kontrol eder
        Eri??im D?????? De??i??tiriciler - eri??im seviyesini kontrol etmeyin,
         ancak ba??ka i??levler sa??lar
        Eri??im De??i??tiricileri
        S??n??flar i??in genel veya varsay??lan?? kullanabilirsiniz:

        De??i??tirici A????klama Deneyin
        public S??n??fa ba??ka herhangi bir s??n??f taraf??ndan eri??ilebilir
        varsay??lan S??n??fa yaln??zca ayn?? paketteki s??n??flar taraf??ndan eri??ilebilir.
         Bu, bir de??i??tirici belirtmedi??inizde kullan??l??r.
         Paketler b??l??m??nde paketler hakk??nda daha fazla bilgi edineceksiniz.
        Nitelikler, y??ntemler ve kurucular i??in a??a????dakilerden birini kullanabilirsiniz:

        De??i??tirici A????klama Deneyin
        public Kod t??m s??n??flar i??in eri??ilebilirdir
        private Kod yaln??zca belirtilen s??n??f i??inde eri??ilebilir
        varsay??lan Kod yaln??zca ayn?? paketten eri??ilebilir. Bu, bir
        de??i??tirici belirtmedi??inizde kullan??l??r. Paketler b??l??m??nde
        paketler hakk??nda daha fazla bilgi edineceksiniz.
        korumal?? Kod, ayn?? paket ve alt s??n??flarda eri??ilebilir. Kal??t??m
         b??l??m??nde alt s??n??flar ve ??st s??n??flar hakk??nda daha fazla bilgi edineceksiniz.
        Eri??imsiz De??i??tiriciler
        S??n??flar i??in final veya ??zet kullanabilirsiniz:

        De??i??tirici A????klama Deneyin
        final S??n??f di??er s??n??flar taraf??ndan miras al??namaz (Kal??t??m hakk??nda
         daha fazla bilgiyi Kal??t??m b??l??m??nde ????reneceksiniz)
        abstract S??n??f nesne olu??turmak i??in kullan??lamaz (Soyut bir s??n??fa eri??mek
        i??in ba??ka bir s??n??ftan miras al??nmas?? gerekir. Kal??t??m ve soyutlama
        hakk??nda daha fazla bilgiyi Kal??t??m ve Soyutlama b??l??mlerinde ????reneceksiniz)
        Nitelikler ve y??ntemler i??in a??a????dakilerden birini kullanabilirsiniz:

        De??i??tirici A????klama
        nihai Nitelikler ve y??ntemler ge??ersiz k??l??namaz/de??i??tirilemez
        static Nitelikler ve y??ntemler bir nesneden ziyade s??n??fa aittir
        soyut Yaln??zca soyut bir s??n??fta kullan??labilir ve yaln??zca y??ntemlerde
         kullan??labilir. Y??ntemin bir g??vdesi yoktur, ??rne??in, abstract void run();.
          G??vde (kal??tsal) alt s??n??f taraf??ndan sa??lan??r. Kal??t??m ve
          Soyutlama b??l??mlerinde kal??t??m ve soyutlama hakk??nda daha fazla bilgi
          edineceksiniz.
        ge??ici ??znitelikler ve y??ntemler, bunlar?? i??eren nesne serile??tirilirken atlan??r
        senkronize Y??ntemlere bir seferde yaln??zca bir i?? par??ac?????? taraf??ndan
        eri??ilebilir
        u??ucu Bir ??zniteli??in de??eri i?? par??ac??????nda yerel olarak ??nbelle??e al??nmaz
        ve her zaman "ana bellekten" okunur

        son
        Mevcut ??znitelik de??erlerini ge??ersiz k??lmay?? istemiyorsan??z,
         ??znitelikleri nihai olarak bildirin:

        ??rnek vermek
        genel s??n??f Ana {
          son int x = 10;
          son ??ift PI = 3.14;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            myObj.x = 50; // bir hata ??retecek: son bir de??i??kene de??er atanamaz
            myObj.PI = 25; // bir hata ??retecek: son bir de??i??kene de??er atanamaz
            System.out.println(myObj.x);
          }
        }



        Statik
        Statik bir y??ntem, genelden farkl?? olarak, s??n??f??n bir nesnesini
        olu??turmadan eri??ilebilece??i anlam??na gelir:

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
          public static void main(String[ ] args) {
            benimStaticMethod(); // Statik y??ntemi ??a????r??n
            // benimPublicMethod(); Bu bir hata verir

            Ana myObj = yeni Ana(); // Bir Main nesnesi olu??turun
            myObj.myPublicMethod(); // genel y??ntemi ??a????r??n
          }
        }



        Soyut
        Soyut bir y??ntem, soyut bir s??n??fa aittir ve bir g??vdesi yoktur.
        G??vde alt s??n??f taraf??ndan sa??lan??r:

        ??rnek vermek
        // Dosya ad??ndaki kod: Main.java
        // soyut s??n??f
        soyut s??n??f Ana {
          public String fname = "John";
          genel int ya?? = 24;
          genel soyut bo??luk ??al????mas??(); // soyut y??ntem
        }

        // Alt s??n??f (Main'den devral)
        s??n??f ????renci Ana'y?? geni??letir {
          public int mezuniyetY??l = 2018;
          public void study() { // soyut y??ntemin g??vdesi burada sa??lan??r
            System.out.println("T??m g??n ders ??al????mak");
          }
        }
        // Dosya ad??ndaki kodu bitir: Main.java

        // Dosya ad??ndan kod: Second.java
        s??n??f ??kinci {
          public static void main(String[] args) {
            // Student s??n??f??n??n (Main'den ??znitelikleri ve y??ntemleri devralan)
             bir nesnesi olu??turun
            Student myObj = new Student();

            System.out.println("Ad: " + myObj.fname);
            System.out.println("Ya??: " + myObj.age);
            System.out.println("Mezuniyet Y??l??: " + myObj.graduationYear);
            myObj.study(); // soyut y??ntemi ??a????r
          }
        }

             */
        }
