        package mart30;

        public class m25_MethodParameters {
            /*
            Parameters and Arguments
        Information can be passed to methods as parameter. Parameters act as variables inside the method.

        Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

        The following example has a method that takes a String called fname as parameter. When the method is called, we pass along a first name, which is used inside the method to print the full name:

        Example
        public class Main {
          static void myMethod(String fname) {
            System.out.println(fname + " Refsnes");
          }

          public static void main(String[] args) {
            myMethod("Liam");
            myMethod("Jenny");
            myMethod("Anja");
          }
        }
        // Liam Refsnes
        // Jenny Refsnes
        // Anja Refsnes





        When a parameter is passed to the method, it is called an argument. So, from the example above: fname is a parameter, while Liam, Jenny and Anja are arguments.

        Multiple Parameters
        You can have as many parameters as you like:

        Example
        public class Main {
          static void myMethod(String fname, int age) {
            System.out.println(fname + " is " + age);
          }

          public static void main(String[] args) {
            myMethod("Liam", 5);
            myMethod("Jenny", 8);
            myMethod("Anja", 31);
          }
        }

        // Liam is 5
        // Jenny is 8
        // Anja is 31

        Note that when you are working with multiple parameters, the method call must have the same number of arguments as there are parameters, and the arguments must be passed in the same order.

        Return Values
        The void keyword, used in the examples above, indicates that the method should not return a value. If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:

        Example
        public class Main {
          static int myMethod(int x) {
            return 5 + x;
          }

          public static void main(String[] args) {
            System.out.println(myMethod(3));
          }
        }
        // Outputs 8 (5 + 3)


        This example returns the sum of a method's two parameters:

        Example
        public class Main {
          static int myMethod(int x, int y) {
            return x + y;
          }

          public static void main(String[] args) {
            System.out.println(myMethod(5, 3));
          }
        }
        // Outputs 8 (5 + 3)

        You can also store the result in a variable (recommended, as it is easier to read and maintain):

        Example
        public class Main {
          static int myMethod(int x, int y) {
            return x + y;
          }

          public static void main(String[] args) {
            int z = myMethod(5, 3);
            System.out.println(z);
          }
        }
        // Outputs 8 (5 + 3)

        A Method with If...Else
        It is common to use if...else statements inside methods:

        Example
        public class Main {

          // Create a checkAge() method with an integer variable called age
          static void checkAge(int age) {

            // If age is less than 18, print "access denied"
            if (age < 18) {
              System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
            } else {
              System.out.println("Access granted - You are old enough!");
            }

          }

          public static void main(String[] args) {
            checkAge(20); // Call the checkAge method and pass along an age of 20
          }
        }

        // Outputs "Access granted - You are old enough!"















        Parametreler ve Argümanlar
        Yöntemlere parametre olarak bilgi aktarılabilir. Parametreler, yöntem içinde değişkenler olarak işlev görür.

        Parametreler, yöntem adından sonra parantez içinde belirtilir. İstediğiniz kadar parametre ekleyebilirsiniz, bunları virgülle ayırmanız yeterlidir.

        Aşağıdaki örnek, parametre olarak fname adlı bir String alan bir metoda sahiptir. Yöntem çağrıldığında, yöntemin içinde tam adı yazdırmak için kullanılan bir ad iletiyoruz:

        Örnek vermek
        genel sınıf Ana {
          static void myMethod(String fname) {
            System.out.println(fname + " Referanslar");
          }

          public static void main(String[] args) {
            myMethod("Liam");
            myMethod("Jenny");
            myMethod("Anja");
          }
        }
        // Liam Refsnes
        // Jenny Refsnes
        // Anja Refsnes





        Yönteme bir parametre iletildiğinde, buna argüman denir. Yani, yukarıdaki örnekten: fname bir parametredir, Liam, Jenny ve Anja ise argümanlardır.

        Çoklu Parametreler
        İstediğiniz kadar parametreye sahip olabilirsiniz:

        Örnek vermek
        genel sınıf Ana {
          static void myMethod(String fname, int age) {
            System.out.println(fname + ", " + yaştır);
          }

          public static void main(String[] args) {
            myMethod("Liam", 5);
            myMethod("Jenny", 8);
            myMethod("Anja", 31);
          }
        }

        // Liam 5 yaşında
        // Jenny 8 yaşında
        // Anja 31 yaşında

        Birden çok parametreyle çalışırken, yöntem çağrısının parametrelerle aynı sayıda bağımsız değişkene sahip olması ve bağımsız değişkenlerin aynı sırada iletilmesi gerektiğini unutmayın.
        Dönüş Değerleri
        Yukarıdaki örneklerde kullanılan void anahtar sözcüğü, yöntemin bir değer döndürmemesi gerektiğini belirtir. Yöntemin bir değer döndürmesini istiyorsanız, void yerine ilkel bir veri türü (int, char vb. gibi) kullanabilir ve yöntemin içinde return anahtar sözcüğünü kullanabilirsiniz:

        Örnek vermek
        genel sınıf Ana {
          statik int myMethod(int x) {
            5 + x döndür;
          }

          public static void main(String[] args) {
            System.out.println(myMethod(3));
          }
        }
        // Çıkışlar 8 (5 + 3)


        Bu örnek, bir yöntemin iki parametresinin toplamını döndürür:

        Örnek vermek
        genel sınıf Ana {
          statik int myMethod(int x, int y) {
            x + y'yi döndür;
          }

          public static void main(String[] args) {
            System.out.println(myMethod(5, 3));
          }
        }
        // Çıkışlar 8 (5 + 3)

        Sonucu bir değişkende de saklayabilirsiniz (okunması ve bakımı daha kolay olduğu için önerilir):

        Örnek vermek
        genel sınıf Ana {
          statik int myMethod(int x, int y) {
            x + y'yi döndür;
          }

          public static void main(String[] args) {
            int z = benimYöntemim(5, 3);
            System.out.println(z);
          }
        }
        // Çıkışlar 8 (5 + 3)

        If...Else ile Bir Yöntem
        Yöntemlerin içinde if...else ifadelerinin kullanılması yaygındır:

        Örnek vermek
        genel sınıf Ana {

          // age adlı bir tamsayı değişkeniyle bir checkAge() yöntemi oluşturun
          static void checkAge(int yaş) {

            // Yaş 18'den küçükse "erişim reddedildi" yazdır
            if (yaş < 18) {
              System.out.println("Erişim engellendi - Yeterince yaşlı değilsiniz!");

            // Yaş 18'den büyük veya 18'e eşitse, "erişim verildi" yazdır
            } Başka {
              System.out.println("Erişim verildi - Yeterince büyüksünüz!");
            }

          }

          public static void main(String[] args) {
            kontrolYaşı(20); // checkAge yöntemini çağırın ve 20 yaşını iletin
          }
        }

        // "Erişim verildi - Yeterince büyüksün!" Çıktıları

             */
        }
