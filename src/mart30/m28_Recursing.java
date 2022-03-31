        package mart30;

        public class m28_Recursing {
            /*
            Java Recursion
        Recursion is the technique of making a function call itself. This technique provides a way to break complicated problems down into simple problems which are easier to solve.

        Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.

        Recursion Example
        Adding two numbers together is easy to do, but adding a range of numbers is more complicated. In the following example, recursion is used to add a range of numbers together by breaking it down into the simple task of adding two numbers:

        Example
        Use recursion to add all of the numbers up to 10.

        public class Main {
          public static void main(String[] args) {
            int result = sum(10);
            System.out.println(result);
          }
          public static int sum(int k) {
            if (k > 0) {
              return k + sum(k - 1);
            } else {
              return 0;
            }
          }
        }

        Example Explained
        When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k and returns the result. When k becomes 0, the function just returns 0. When running, the program follows these steps:

        10 + sum(9)
        10 + ( 9 + sum(8) )
        10 + ( 9 + ( 8 + sum(7) ) )
        ...
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
        Since the function does not call itself when k is 0, the program
        stops there and returns t

        Halting Condition
        Just as loops can run into the problem of infinite looping,
        recursive functions can run into the problem of infinite recursion.
        Infinite recursion is when the function never stops calling itself.
        Every recursive function should have a halting condition, which is
        the condition where the function stops calling itself. In the previous
         example, the halting condition is when the parameter k becomes 0.

        It is helpful to see a variety of different examples to better
         understand the concept. In this example, the function adds a range
         of numbers between a start and an end. The halting condition for this
         recursive function is when end is not greater than start:

        Example
        Use recursion to add all of the numbers between 5 to 10.

        public class Main {
          public static void main(String[] args) {
            int result = sum(5, 10);
            System.out.println(result);
          }
          public static int sum(int start, int end) {
            if (end > start) {
              return end + sum(start, end - 1);
            } else {
              return end;
            }
          }
        }

        The developer should be very careful with recursion as it
        can be quite easy to slip into writing a function which never terminates,
        or one that uses excess amounts of memory or processor power. However,
         when written correctly recursion can be a very efficient
         and mathematically-elegant approach to programming.








        Java Özyineleme
        Özyineleme, bir işlev çağrısının kendisini yapma tekniğidir. Bu teknik, karmaşık sorunları çözmesi daha kolay basit sorunlara ayırmanın bir yolunu sağlar.

        Özyinelemeyi anlamak biraz zor olabilir. Nasıl çalıştığını anlamanın en iyi yolu, onunla deney yapmaktır.

        Özyineleme Örneği
        İki sayıyı birbirine eklemek kolaydır, ancak bir dizi sayı eklemek daha karmaşıktır. Aşağıdaki örnekte, özyineleme, bir sayı aralığını iki sayı eklemek gibi basit bir göreve bölerek bir araya getirmek için kullanılır:

        Örnek vermek
        10'a kadar olan tüm sayıları toplamak için özyinelemeyi kullanın.

        genel sınıf Ana {
          public static void main(String[] args) {
            int sonuç = toplam(10);
            System.out.println(sonuç);
          }
          genel statik int toplam(int k) {
            eğer (k > 0) {
              dönüş k + toplam(k - 1);
            } Başka {
              0 döndür;
            }
          }
        }

        Örnek Açıklama
        sum() işlevi çağrıldığında, k'den küçük tüm sayıların toplamına k parametresini
         ekler ve sonucu döndürür. k 0 olduğunda, fonksiyon sadece 0'a döner. Çalışırken,
          program şu adımları takip eder:

        10 + toplam(9)
        10 + ( 9 + toplam(8) )
        10 + ( 9 + ( 8 + toplam(7) ) )
        ...
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + toplam(0)
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
        k 0 olduğunda fonksiyon kendini çağırmadığından, program burada durur ve t'yi
        döndürür.

        Durma Durumu
        Nasıl döngüler sonsuz döngü sorunuyla karşılaşabiliyorsa,
         özyinelemeli işlevler de sonsuz özyineleme sorunuyla karşılaşabilir.
         Sonsuz özyineleme, işlevin kendisini çağırmayı asla bırakmamasıdır.
         Her özyinelemeli işlevin, işlevin kendisini çağırmayı bıraktığı koşul
         olan durma koşulu olmalıdır. Önceki örnekte, durma koşulu, k parametresinin
          0 olması durumudur.

        Konsepti daha iyi anlamak için çeşitli farklı örnekler görmek faydalı olacaktır.
         Bu örnekte, işlev, bir başlangıç ​​ve bir bitiş arasına bir sayı aralığı ekler.
          Bu özyinelemeli işlev için durma koşulu, bitişin başlangıçtan büyük olmadığı durumdur:

        Örnek vermek
        5 ile 10 arasındaki tüm sayıları toplamak için özyinelemeyi kullanın.

        genel sınıf Ana {
          public static void main(String[] args) {
            int sonuç = toplam(5, 10);
            System.out.println(sonuç);
          }
          genel statik int toplamı(int başlangıç, int bitiş) {
            if (bitiş > başlangıç) {
              dönüş bitiş + toplam(başlangıç, bitiş - 1);
            } Başka {
              dönüş ucu;
            }
          }
        }

        Geliştirici, özyineleme konusunda çok dikkatli olmalıdır,
        çünkü hiçbir zaman sona ermeyen veya aşırı miktarda bellek veya işlemci
         gücü kullanan bir işlevi yazmak oldukça kolay olabilir. Bununla birlikte,
         doğru yazıldığında özyineleme, programlama için çok verimli ve matematiksel
         olarak zarif bir yaklaşım olabilir.




             */
        }
