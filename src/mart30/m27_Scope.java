        package mart30;

        public class m27_Scope {
            /*
            Java Scope
        In Java, variables are only accessible inside the region they are
        created. This is called scope.

        Method Scope
        Variables declared directly inside a method are available
        anywhere in the method following the line of code in which they were
        declared:

        Example
        public class Main {
          public static void main(String[] args) {

            // Code here CANNOT use x

            int x = 100;

            // Code here can use x
            System.out.println(x);
          }
        }

        Block Scope
        A block of code refers to all of the code between curly braces {}.
        Variables declared inside blocks of code are only accessible by the
        code between the curly braces, which follows the line in which the
        variable was declared:

        Example
        public class Main {
          public static void main(String[] args) {

            // Code here CANNOT use x

            { // This is a block

              // Code here CANNOT use x

              int x = 100;

              // Code here CAN use x
              System.out.println(x);

           } // The block ends here

          // Code here CANNOT use x

          }
        }

        A block of code may exist on its own or it can belong to an if,
         while or for statement. In the case of for statements, variables
          declared in the statement itself are also available inside the
          block's scope.




        Java Kapsamı
        Java'da değişkenlere yalnızca oluşturuldukları bölge içinde erişilebilir.
         Buna kapsam denir.

        Yöntem Kapsamı
        Doğrudan bir yöntemin içinde bildirilen değişkenler, bildirildikleri kod
        satırını izleyen yöntemin herhangi bir yerinde bulunur:

        Örnek vermek
        genel sınıf Ana {
          public static void main(String[] args) {

            // Buradaki kod x KULLANILAMAZ

            int x = 100;

            // Buradaki kod x kullanabilir
            System.out.println(x);
          }
        }

        Blok Kapsamı
        Bir kod bloğu, küme parantezleri {} arasındaki tüm kodu ifade eder.
        Kod blokları içinde bildirilen değişkenlere yalnızca, değişkenin
        bildirildiği satırı izleyen küme parantezleri arasındaki kod tarafından
        erişilebilir:

        Örnek vermek
        genel sınıf Ana {
          public static void main(String[] args) {

            // Buradaki kod x KULLANILAMAZ

            { // Bu bir bloktur

              // Buradaki kod x KULLANILAMAZ

              int x = 100;

              // Kod burada x kullanabilir
              System.out.println(x);

           } // Blok burada bitiyor

          // Buradaki kod x KULLANILAMAZ

          }
        }

        Bir kod bloğu kendi başına var olabilir veya bir if, while veya
        for ifadesine ait olabilir. for deyimleri söz konusu olduğunda,
        deyimin kendisinde bildirilen değişkenler de bloğun kapsamında mevcuttur.





             */
        }
