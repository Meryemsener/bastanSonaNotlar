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








        Java ??zyineleme
        ??zyineleme, bir i??lev ??a??r??s??n??n kendisini yapma tekni??idir. Bu teknik, karma????k sorunlar?? ????zmesi daha kolay basit sorunlara ay??rman??n bir yolunu sa??lar.

        ??zyinelemeyi anlamak biraz zor olabilir. Nas??l ??al????t??????n?? anlaman??n en iyi yolu, onunla deney yapmakt??r.

        ??zyineleme ??rne??i
        ??ki say??y?? birbirine eklemek kolayd??r, ancak bir dizi say?? eklemek daha karma????kt??r. A??a????daki ??rnekte, ??zyineleme, bir say?? aral??????n?? iki say?? eklemek gibi basit bir g??reve b??lerek bir araya getirmek i??in kullan??l??r:

        ??rnek vermek
        10'a kadar olan t??m say??lar?? toplamak i??in ??zyinelemeyi kullan??n.

        genel s??n??f Ana {
          public static void main(String[] args) {
            int sonu?? = toplam(10);
            System.out.println(sonu??);
          }
          genel statik int toplam(int k) {
            e??er (k > 0) {
              d??n???? k + toplam(k - 1);
            } Ba??ka {
              0 d??nd??r;
            }
          }
        }

        ??rnek A????klama
        sum() i??levi ??a??r??ld??????nda, k'den k??????k t??m say??lar??n toplam??na k parametresini
         ekler ve sonucu d??nd??r??r. k 0 oldu??unda, fonksiyon sadece 0'a d??ner. ??al??????rken,
          program ??u ad??mlar?? takip eder:

        10 + toplam(9)
        10 + ( 9 + toplam(8) )
        10 + ( 9 + ( 8 + toplam(7) ) )
        ...
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + toplam(0)
        10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
        k 0 oldu??unda fonksiyon kendini ??a????rmad??????ndan, program burada durur ve t'yi
        d??nd??r??r.

        Durma Durumu
        Nas??l d??ng??ler sonsuz d??ng?? sorunuyla kar????la??abiliyorsa,
         ??zyinelemeli i??levler de sonsuz ??zyineleme sorunuyla kar????la??abilir.
         Sonsuz ??zyineleme, i??levin kendisini ??a????rmay?? asla b??rakmamas??d??r.
         Her ??zyinelemeli i??levin, i??levin kendisini ??a????rmay?? b??rakt?????? ko??ul
         olan durma ko??ulu olmal??d??r. ??nceki ??rnekte, durma ko??ulu, k parametresinin
          0 olmas?? durumudur.

        Konsepti daha iyi anlamak i??in ??e??itli farkl?? ??rnekler g??rmek faydal?? olacakt??r.
         Bu ??rnekte, i??lev, bir ba??lang???? ??????ve bir biti?? aras??na bir say?? aral?????? ekler.
          Bu ??zyinelemeli i??lev i??in durma ko??ulu, biti??in ba??lang????tan b??y??k olmad?????? durumdur:

        ??rnek vermek
        5 ile 10 aras??ndaki t??m say??lar?? toplamak i??in ??zyinelemeyi kullan??n.

        genel s??n??f Ana {
          public static void main(String[] args) {
            int sonu?? = toplam(5, 10);
            System.out.println(sonu??);
          }
          genel statik int toplam??(int ba??lang????, int biti??) {
            if (biti?? > ba??lang????) {
              d??n???? biti?? + toplam(ba??lang????, biti?? - 1);
            } Ba??ka {
              d??n???? ucu;
            }
          }
        }

        Geli??tirici, ??zyineleme konusunda ??ok dikkatli olmal??d??r,
        ????nk?? hi??bir zaman sona ermeyen veya a????r?? miktarda bellek veya i??lemci
         g??c?? kullanan bir i??levi yazmak olduk??a kolay olabilir. Bununla birlikte,
         do??ru yaz??ld??????nda ??zyineleme, programlama i??in ??ok verimli ve matematiksel
         olarak zarif bir yakla????m olabilir.




             */
        }
