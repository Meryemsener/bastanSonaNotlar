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











        değiştiriciler
        Şimdiye kadar, hemen hemen tüm örneklerimizde görünen genel anahtar
        kelimeye oldukça aşinasınız:

        genel sınıf Ana
        Public anahtar sözcüğü bir erişim değiştiricisidir, yani sınıflar,
         nitelikler, yöntemler ve kurucular için erişim düzeyini ayarlamak için kullanılır.

        Değiştiricileri iki gruba ayırıyoruz:

        Erişim Değiştiricileri - erişim seviyesini kontrol eder
        Erişim Dışı Değiştiriciler - erişim seviyesini kontrol etmeyin,
        ancak başka işlevler sağlar
        Erişim Değiştiricileri
        Sınıflar için genel veya varsayılanı kullanabilirsiniz:

        Değiştirici Açıklama Deneyin
        public Sınıfa başka herhangi bir sınıf tarafından erişilebilir
        varsayılan Sınıfa yalnızca aynı paketteki sınıflar tarafından erişilebilir.
        Bu, bir değiştirici belirtmediğinizde kullanılır. Paketler
        bölümünde paketler hakkında daha fazla bilgi edineceksiniz.
        Nitelikler, yöntemler ve kurucular için aşağıdakilerden birini kullanabilirsiniz:

        Değiştirici Açıklama Deneyin
        public Kod tüm sınıflar için erişilebilirdir
        private Kod yalnızca belirtilen sınıf içinde erişilebilir
        varsayılan Kod yalnızca aynı paketten erişilebilir. Bu, bir
        değiştirici belirtmediğinizde kullanılır. Paketler bölümünde paketler
        hakkında daha fazla bilgi edineceksiniz.
        korumalı Kod, aynı paket ve alt sınıflarda erişilebilir. Kalıtım bölümünde
        alt sınıflar ve üst sınıflar hakkında daha fazla bilgi edineceksiniz.
        değiştiriciler
        Şimdiye kadar, hemen hemen tüm örneklerimizde görünen genel anahtar kelimeye
         oldukça aşinasınız:

        genel sınıf Ana
        Public anahtar sözcüğü bir erişim değiştiricisidir, yani sınıflar,
        nitelikler, yöntemler ve kurucular için erişim düzeyini ayarlamak için kullanılır.

        Değiştiricileri iki gruba ayırıyoruz:

        Erişim Değiştiricileri - erişim seviyesini kontrol eder
        Erişim Dışı Değiştiriciler - erişim seviyesini kontrol etmeyin,
         ancak başka işlevler sağlar
        Erişim Değiştiricileri
        Sınıflar için genel veya varsayılanı kullanabilirsiniz:

        Değiştirici Açıklama Deneyin
        public Sınıfa başka herhangi bir sınıf tarafından erişilebilir
        varsayılan Sınıfa yalnızca aynı paketteki sınıflar tarafından erişilebilir.
         Bu, bir değiştirici belirtmediğinizde kullanılır.
         Paketler bölümünde paketler hakkında daha fazla bilgi edineceksiniz.
        Nitelikler, yöntemler ve kurucular için aşağıdakilerden birini kullanabilirsiniz:

        Değiştirici Açıklama Deneyin
        public Kod tüm sınıflar için erişilebilirdir
        private Kod yalnızca belirtilen sınıf içinde erişilebilir
        varsayılan Kod yalnızca aynı paketten erişilebilir. Bu, bir
        değiştirici belirtmediğinizde kullanılır. Paketler bölümünde
        paketler hakkında daha fazla bilgi edineceksiniz.
        korumalı Kod, aynı paket ve alt sınıflarda erişilebilir. Kalıtım
         bölümünde alt sınıflar ve üst sınıflar hakkında daha fazla bilgi edineceksiniz.
        Erişimsiz Değiştiriciler
        Sınıflar için final veya özet kullanabilirsiniz:

        Değiştirici Açıklama Deneyin
        final Sınıf diğer sınıflar tarafından miras alınamaz (Kalıtım hakkında
         daha fazla bilgiyi Kalıtım bölümünde öğreneceksiniz)
        abstract Sınıf nesne oluşturmak için kullanılamaz (Soyut bir sınıfa erişmek
        için başka bir sınıftan miras alınması gerekir. Kalıtım ve soyutlama
        hakkında daha fazla bilgiyi Kalıtım ve Soyutlama bölümlerinde öğreneceksiniz)
        Nitelikler ve yöntemler için aşağıdakilerden birini kullanabilirsiniz:

        Değiştirici Açıklama
        nihai Nitelikler ve yöntemler geçersiz kılınamaz/değiştirilemez
        static Nitelikler ve yöntemler bir nesneden ziyade sınıfa aittir
        soyut Yalnızca soyut bir sınıfta kullanılabilir ve yalnızca yöntemlerde
         kullanılabilir. Yöntemin bir gövdesi yoktur, örneğin, abstract void run();.
          Gövde (kalıtsal) alt sınıf tarafından sağlanır. Kalıtım ve
          Soyutlama bölümlerinde kalıtım ve soyutlama hakkında daha fazla bilgi
          edineceksiniz.
        geçici Öznitelikler ve yöntemler, bunları içeren nesne serileştirilirken atlanır
        senkronize Yöntemlere bir seferde yalnızca bir iş parçacığı tarafından
        erişilebilir
        uçucu Bir özniteliğin değeri iş parçacığında yerel olarak önbelleğe alınmaz
        ve her zaman "ana bellekten" okunur

        son
        Mevcut öznitelik değerlerini geçersiz kılmayı istemiyorsanız,
         öznitelikleri nihai olarak bildirin:

        Örnek vermek
        genel sınıf Ana {
          son int x = 10;
          son çift PI = 3.14;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            myObj.x = 50; // bir hata üretecek: son bir değişkene değer atanamaz
            myObj.PI = 25; // bir hata üretecek: son bir değişkene değer atanamaz
            System.out.println(myObj.x);
          }
        }



        Statik
        Statik bir yöntem, genelden farklı olarak, sınıfın bir nesnesini
        oluşturmadan erişilebileceği anlamına gelir:

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
          public static void main(String[ ] args) {
            benimStaticMethod(); // Statik yöntemi çağırın
            // benimPublicMethod(); Bu bir hata verir

            Ana myObj = yeni Ana(); // Bir Main nesnesi oluşturun
            myObj.myPublicMethod(); // genel yöntemi çağırın
          }
        }



        Soyut
        Soyut bir yöntem, soyut bir sınıfa aittir ve bir gövdesi yoktur.
        Gövde alt sınıf tarafından sağlanır:

        Örnek vermek
        // Dosya adındaki kod: Main.java
        // soyut sınıf
        soyut sınıf Ana {
          public String fname = "John";
          genel int yaş = 24;
          genel soyut boşluk çalışması(); // soyut yöntem
        }

        // Alt sınıf (Main'den devral)
        sınıf Öğrenci Ana'yı genişletir {
          public int mezuniyetYıl = 2018;
          public void study() { // soyut yöntemin gövdesi burada sağlanır
            System.out.println("Tüm gün ders çalışmak");
          }
        }
        // Dosya adındaki kodu bitir: Main.java

        // Dosya adından kod: Second.java
        sınıf İkinci {
          public static void main(String[] args) {
            // Student sınıfının (Main'den öznitelikleri ve yöntemleri devralan)
             bir nesnesi oluşturun
            Student myObj = new Student();

            System.out.println("Ad: " + myObj.fname);
            System.out.println("Yaş: " + myObj.age);
            System.out.println("Mezuniyet Yılı: " + myObj.graduationYear);
            myObj.study(); // soyut yöntemi çağır
          }
        }

             */
        }
