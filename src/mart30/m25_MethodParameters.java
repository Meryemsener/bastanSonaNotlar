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















        Parametreler ve Arg??manlar
        Y??ntemlere parametre olarak bilgi aktar??labilir. Parametreler, y??ntem i??inde de??i??kenler olarak i??lev g??r??r.

        Parametreler, y??ntem ad??ndan sonra parantez i??inde belirtilir. ??stedi??iniz kadar parametre ekleyebilirsiniz, bunlar?? virg??lle ay??rman??z yeterlidir.

        A??a????daki ??rnek, parametre olarak fname adl?? bir String alan bir metoda sahiptir. Y??ntem ??a??r??ld??????nda, y??ntemin i??inde tam ad?? yazd??rmak i??in kullan??lan bir ad iletiyoruz:

        ??rnek vermek
        genel s??n??f Ana {
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





        Y??nteme bir parametre iletildi??inde, buna arg??man denir. Yani, yukar??daki ??rnekten: fname bir parametredir, Liam, Jenny ve Anja ise arg??manlard??r.

        ??oklu Parametreler
        ??stedi??iniz kadar parametreye sahip olabilirsiniz:

        ??rnek vermek
        genel s??n??f Ana {
          static void myMethod(String fname, int age) {
            System.out.println(fname + ", " + ya??t??r);
          }

          public static void main(String[] args) {
            myMethod("Liam", 5);
            myMethod("Jenny", 8);
            myMethod("Anja", 31);
          }
        }

        // Liam 5 ya????nda
        // Jenny 8 ya????nda
        // Anja 31 ya????nda

        Birden ??ok parametreyle ??al??????rken, y??ntem ??a??r??s??n??n parametrelerle ayn?? say??da ba????ms??z de??i??kene sahip olmas?? ve ba????ms??z de??i??kenlerin ayn?? s??rada iletilmesi gerekti??ini unutmay??n.
        D??n???? De??erleri
        Yukar??daki ??rneklerde kullan??lan void anahtar s??zc??????, y??ntemin bir de??er d??nd??rmemesi gerekti??ini belirtir. Y??ntemin bir de??er d??nd??rmesini istiyorsan??z, void yerine ilkel bir veri t??r?? (int, char vb. gibi) kullanabilir ve y??ntemin i??inde return anahtar s??zc??????n?? kullanabilirsiniz:

        ??rnek vermek
        genel s??n??f Ana {
          statik int myMethod(int x) {
            5 + x d??nd??r;
          }

          public static void main(String[] args) {
            System.out.println(myMethod(3));
          }
        }
        // ????k????lar 8 (5 + 3)


        Bu ??rnek, bir y??ntemin iki parametresinin toplam??n?? d??nd??r??r:

        ??rnek vermek
        genel s??n??f Ana {
          statik int myMethod(int x, int y) {
            x + y'yi d??nd??r;
          }

          public static void main(String[] args) {
            System.out.println(myMethod(5, 3));
          }
        }
        // ????k????lar 8 (5 + 3)

        Sonucu bir de??i??kende de saklayabilirsiniz (okunmas?? ve bak??m?? daha kolay oldu??u i??in ??nerilir):

        ??rnek vermek
        genel s??n??f Ana {
          statik int myMethod(int x, int y) {
            x + y'yi d??nd??r;
          }

          public static void main(String[] args) {
            int z = benimY??ntemim(5, 3);
            System.out.println(z);
          }
        }
        // ????k????lar 8 (5 + 3)

        If...Else ile Bir Y??ntem
        Y??ntemlerin i??inde if...else ifadelerinin kullan??lmas?? yayg??nd??r:

        ??rnek vermek
        genel s??n??f Ana {

          // age adl?? bir tamsay?? de??i??keniyle bir checkAge() y??ntemi olu??turun
          static void checkAge(int ya??) {

            // Ya?? 18'den k??????kse "eri??im reddedildi" yazd??r
            if (ya?? < 18) {
              System.out.println("Eri??im engellendi - Yeterince ya??l?? de??ilsiniz!");

            // Ya?? 18'den b??y??k veya 18'e e??itse, "eri??im verildi" yazd??r
            } Ba??ka {
              System.out.println("Eri??im verildi - Yeterince b??y??ks??n??z!");
            }

          }

          public static void main(String[] args) {
            kontrolYa????(20); // checkAge y??ntemini ??a????r??n ve 20 ya????n?? iletin
          }
        }

        // "Eri??im verildi - Yeterince b??y??ks??n!" ????kt??lar??

             */
        }
