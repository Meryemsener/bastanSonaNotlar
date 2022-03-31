        package mart30_javaOOP;

        public class k3_ClassAttributes {
            /*
            Java Class Attributes
        In the previous chapter, we used the term "variable" for x in the example
        (as shown below). It is actually an attribute of the class. Or you could say
        that class attributes are variables within a class:

        Example
        Create a class called "Main" with two attributes: x and y:

        public class Main {
          int x = 5;
          int y = 3;
        }
        Another term for class attributes is fields.

        Accessing Attributes
        You can access attributes by creating an object of the class,
         and by using the dot syntax (.):

        The following example will create an object of the Main class,
         with the name myObj. We use the x attribute on the object to print its value:

        Example
        Create an object called "myObj" and print the value of x:

        public class Main {
          int x = 5;

          public static void main(String[] args) {
            Main myObj = new Main();
            System.out.println(myObj.x);
          }
        }



        Modify Attributes
        You can also modify attribute values:

        Example
        Set the value of x to 40:

        public class Main {
          int x;

          public static void main(String[] args) {
            Main myObj = new Main();
            myObj.x = 40;
            System.out.println(myObj.x);
          }
        }
        Or override existing values:

        Example
        Change the value of x to 25:

        public class Main {
          int x = 10;

          public static void main(String[] args) {
            Main myObj = new Main();
            myObj.x = 25; // x is now 25
            System.out.println(myObj.x);
          }
        }


        If you don't want the ability to override existing values,
        declare the attribute as final:

        Example
        public class Main {
          final int x = 10;

          public static void main(String[] args) {
            Main myObj = new Main();
            myObj.x = 25; // will generate an error: cannot assign a value to a final
            variable
            System.out.println(myObj.x);
          }
        }


        The final keyword is useful when you want a variable to always store
        the same value, like PI (3.14159...).

        The final keyword is called a "modifier". You will learn more about these
        in the Java Modifiers Chapter.
        Multiple Objects
        If you create multiple objects of one class, you can change the attribute
        values in one object, without affecting the attribute values in the other:

        Example
        Change the value of x to 25 in myObj2, and leave x in myObj1 unchanged:

        public class Main {
          int x = 5;

          public static void main(String[] args) {
            Main myObj1 = new Main();  // Object 1
            Main myObj2 = new Main();  // Object 2
            myObj2.x = 25;
            System.out.println(myObj1.x);  // Outputs 5
            System.out.println(myObj2.x);  // Outputs 25
          }
        }

        Multiple Attributes
        You can specify as many attributes as you want:

        Example
        public class Main {
          String fname = "John";
          String lname = "Doe";
          int age = 24;

          public static void main(String[] args) {
            Main myObj = new Main();
            System.out.println("Name: " + myObj.fname + " " + myObj.lname);
            System.out.println("Age: " + myObj.age);
          }
        }

        The next chapter will teach you how to create class methods and how to
        access them with objects.












        Java Sınıfı Nitelikleri
        Önceki bölümde, örnekte x için "değişken" terimini kullandık (aşağıda
         gösterildiği gibi). Aslında sınıfın bir özelliğidir. Veya sınıf niteliklerinin
         bir sınıf içindeki değişkenler olduğunu söyleyebilirsiniz:

        Örnek vermek
        İki öznitelikle "Main" adında bir sınıf oluşturun: x ve y:

        genel sınıf Ana {
          int x = 5;
          int y = 3;
        }
        Sınıf öznitelikleri için başka bir terim alanlardır.

        Niteliklere Erişme
        Niteliklere, sınıfın bir nesnesini oluşturarak ve nokta sözdizimini (.)
        kullanarak erişebilirsiniz:

        Aşağıdaki örnek, Main sınıfından myObj adında bir nesne oluşturacaktır.
         Değerini yazdırmak için nesne üzerindeki x niteliğini kullanırız:

        Örnek vermek
        "myObj" adında bir nesne oluşturun ve x'in değerini yazdırın:

        genel sınıf Ana {
          int x = 5;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            System.out.println(myObj.x);
          }
        }



        Öznitelikleri Değiştir
        Ayrıca öznitelik değerlerini de değiştirebilirsiniz:

        Örnek vermek
        x değerini 40 olarak ayarlayın:

        genel sınıf Ana {
          int x;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            myObj.x = 40;
            System.out.println(myObj.x);
          }
        }

        Veya mevcut değerleri geçersiz kılın:

        Örnek vermek
        x değerini 25 olarak değiştirin:

        genel sınıf Ana {
          int x = 10;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            myObj.x = 25; // x şimdi 25
            System.out.println(myObj.x);
          }
        }


        Mevcut değerleri geçersiz kılmayı istemiyorsanız, özelliği nihai olarak bildirin:

        Örnek vermek
        genel sınıf Ana {
          son int x = 10;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            myObj.x = 25; // bir hata üretecek: son bir değişkene değer atanamaz
            System.out.println(myObj.x);
          }
        }


        Final anahtar sözcüğü, bir değişkenin PI (3.14159...) gibi her zaman aynı
        değeri saklamasını istediğinizde kullanışlıdır.

        Son anahtar kelimeye "değiştirici" denir. Java Değiştiriciler Bölümünde bunlar
        hakkında daha fazla bilgi edineceksiniz.
        Çoklu Nesneler
        Bir sınıftan birden çok nesne oluşturursanız, diğerindeki öznitelik değerlerini
        etkilemeden bir nesnedeki öznitelik değerlerini değiştirebilirsiniz:

        Örnek vermek
        myObj2'de x değerini 25 olarak değiştirin ve myObj1'de x'i değiştirmeden bırakın:

        genel sınıf Ana {
          int x = 5;

          public static void main(String[] args) {
            Ana myObj1 = yeni Ana(); // Nesne 1
            Ana myObj2 = yeni Ana(); // Nesne 2
            myObj2.x = 25;
            System.out.println(myObj1.x); // Çıkışlar 5
            System.out.println(myObj2.x); // Çıktılar 25
          }
        }

        Çoklu Nitelikler
        İstediğiniz kadar nitelik belirtebilirsiniz:

        Örnek vermek
        genel sınıf Ana {
          String fname = "John";
          String lname = "Doe";
          int yaş = 24;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            System.out.println("Ad: " + benimObj.fname + " " + benimObj.lname);
            System.out.println("Yaş: " + myObj.age);
          }
        }

        Sonraki bölüm size sınıf yöntemlerinin nasıl oluşturulacağını ve
        bunlara nesnelerle nasıl erişileceğini öğretecektir.


             */
        }
