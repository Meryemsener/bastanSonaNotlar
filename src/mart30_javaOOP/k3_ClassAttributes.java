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












        Java S??n??f?? Nitelikleri
        ??nceki b??l??mde, ??rnekte x i??in "de??i??ken" terimini kulland??k (a??a????da
         g??sterildi??i gibi). Asl??nda s??n??f??n bir ??zelli??idir. Veya s??n??f niteliklerinin
         bir s??n??f i??indeki de??i??kenler oldu??unu s??yleyebilirsiniz:

        ??rnek vermek
        ??ki ??znitelikle "Main" ad??nda bir s??n??f olu??turun: x ve y:

        genel s??n??f Ana {
          int x = 5;
          int y = 3;
        }
        S??n??f ??znitelikleri i??in ba??ka bir terim alanlard??r.

        Niteliklere Eri??me
        Niteliklere, s??n??f??n bir nesnesini olu??turarak ve nokta s??zdizimini (.)
        kullanarak eri??ebilirsiniz:

        A??a????daki ??rnek, Main s??n??f??ndan myObj ad??nda bir nesne olu??turacakt??r.
         De??erini yazd??rmak i??in nesne ??zerindeki x niteli??ini kullan??r??z:

        ??rnek vermek
        "myObj" ad??nda bir nesne olu??turun ve x'in de??erini yazd??r??n:

        genel s??n??f Ana {
          int x = 5;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            System.out.println(myObj.x);
          }
        }



        ??znitelikleri De??i??tir
        Ayr??ca ??znitelik de??erlerini de de??i??tirebilirsiniz:

        ??rnek vermek
        x de??erini 40 olarak ayarlay??n:

        genel s??n??f Ana {
          int x;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            myObj.x = 40;
            System.out.println(myObj.x);
          }
        }

        Veya mevcut de??erleri ge??ersiz k??l??n:

        ??rnek vermek
        x de??erini 25 olarak de??i??tirin:

        genel s??n??f Ana {
          int x = 10;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            myObj.x = 25; // x ??imdi 25
            System.out.println(myObj.x);
          }
        }


        Mevcut de??erleri ge??ersiz k??lmay?? istemiyorsan??z, ??zelli??i nihai olarak bildirin:

        ??rnek vermek
        genel s??n??f Ana {
          son int x = 10;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            myObj.x = 25; // bir hata ??retecek: son bir de??i??kene de??er atanamaz
            System.out.println(myObj.x);
          }
        }


        Final anahtar s??zc??????, bir de??i??kenin PI (3.14159...) gibi her zaman ayn??
        de??eri saklamas??n?? istedi??inizde kullan????l??d??r.

        Son anahtar kelimeye "de??i??tirici" denir. Java De??i??tiriciler B??l??m??nde bunlar
        hakk??nda daha fazla bilgi edineceksiniz.
        ??oklu Nesneler
        Bir s??n??ftan birden ??ok nesne olu??turursan??z, di??erindeki ??znitelik de??erlerini
        etkilemeden bir nesnedeki ??znitelik de??erlerini de??i??tirebilirsiniz:

        ??rnek vermek
        myObj2'de x de??erini 25 olarak de??i??tirin ve myObj1'de x'i de??i??tirmeden b??rak??n:

        genel s??n??f Ana {
          int x = 5;

          public static void main(String[] args) {
            Ana myObj1 = yeni Ana(); // Nesne 1
            Ana myObj2 = yeni Ana(); // Nesne 2
            myObj2.x = 25;
            System.out.println(myObj1.x); // ????k????lar 5
            System.out.println(myObj2.x); // ????kt??lar 25
          }
        }

        ??oklu Nitelikler
        ??stedi??iniz kadar nitelik belirtebilirsiniz:

        ??rnek vermek
        genel s??n??f Ana {
          String fname = "John";
          String lname = "Doe";
          int ya?? = 24;

          public static void main(String[] args) {
            Ana myObj = yeni Ana();
            System.out.println("Ad: " + benimObj.fname + " " + benimObj.lname);
            System.out.println("Ya??: " + myObj.age);
          }
        }

        Sonraki b??l??m size s??n??f y??ntemlerinin nas??l olu??turulaca????n?? ve
        bunlara nesnelerle nas??l eri??ilece??ini ????retecektir.


             */
        }
