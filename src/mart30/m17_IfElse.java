package mart30;

public class m17_IfElse {
            /*
                    -----Java Conditions and If Statements
                Java supports the usual logical conditions from mathematics:

                Less than: a < b
                Less than or equal to: a <= b
                Greater than: a > b
                Greater than or equal to: a >= b
                Equal to a == b
                 Not Equal to: a != b
              You can use these conditions to perform different actions for different decisions.

            Java has the following conditional statements:

            Use if to specify a block of code to be executed, if a specified condition is true
            Use else to specify a block of code to be executed, if the same condition is false
            Use else if to specify a new condition to test, if the first condition is false
            Use switch to specify many alternative blocks of code to be executed
            The if Statement
            Use the if statement to specify a block of Java code to be executed if a condition is true.

            Syntax
            if (condition) {
              // block of code to be executed if the condition is true
            }
            Note that if is in lowercase letters. Uppercase letters (If or IF) will generate an error.

            In the example below, we test two values to find out if 20 is greater than 18. If the condition is true, print some text:

            Example
            if (20 > 18) {
              System.out.println("20 is greater than 18");
            }

            We can also test variables:

            Example
            int x = 20;
            int y = 18;
            if (x > y) {
              System.out.println("x is greater than y");
            }

            Example explained
            In the example above we use two variables, x and y, to test whether x is greater than y (using the > operator). As x is 20, and y is 18, and we know that 20 is greater than 18, we print to the screen that "x is greater than y".

            The else Statement
            Use the else statement to specify a block of code to be executed if the condition is false.

            Syntax
            if (condition) {
              // block of code to be executed if the condition is true
            } else {
              // block of code to be executed if the condition is false
            }
            Example
            int time = 20;
            if (time < 18) {
              System.out.println("Good day.");
            } else {
              System.out.println("Good evening.");
            }
            // Outputs "Good evening."


            Example explained
            In the example above, time (20) is greater than 18, so the condition is false. Because of this, we move on to the else condition and print to the screen "Good evening". If the time was less than 18, the program would print "Good day".

            The else if Statement
            Use the else if statement to specify a new condition if the first condition is false.

            Syntax
            if (condition1) {
              // block of code to be executed if condition1 is true
            } else if (condition2) {
              // block of code to be executed if the condition1 is false and condition2 is true
            } else {
              // block of code to be executed if the condition1 is false and condition2 is false
            }
            Example
            int time = 22;
            if (time < 10) {
              System.out.println("Good morning.");
            } else if (time < 20) {
              System.out.println("Good day.");
            } else {
              System.out.println("Good evening.");
            }
            // Outputs "Good evening."


            Example explained
            In the example above, time (22) is greater than 10, so the first condition is false. The next condition, in the else if statement, is also false, so we move on to the else condition since condition1 and condition2 is both false - and print to the screen "Good evening".

            However, if the time was 14, our program would print "Good day."










            Java Ko??ullar?? ve If ??fadeleri
            Java, matematikteki ola??an mant??ksal ko??ullar?? destekler:

            K??????kt??r: a < b
            K??????k veya e??it: a <= b
        ??undan b??y??kt??r: a > b
        ??undan b??y??k veya e??ittir: a >= b
        a == b'ye e??it
        E??it De??il: a != b
        Farkl?? kararlar i??in farkl?? eylemler ger??ekle??tirmek i??in bu ko??ullar?? kullanabilirsiniz.

        Java a??a????daki ko??ullu ifadelere sahiptir:

        Belirtilen bir ko??ul do??ruysa y??r??t??lecek bir kod blo??u belirtmek i??in if kullan??n
        Ayn?? ko??ul yanl????sa, y??r??t??lecek kod blo??unu belirtmek i??in else kullan??n.
        ??lk ko??ul yanl????sa, test edilecek yeni bir ko??ul belirtmek i??in else if ????esini kullan??n.
        Y??r??t??lecek bir??ok alternatif kod blo??u belirtmek i??in anahtar?? kullan??n
        if Bildirimi
        Bir ko??ul do??ruysa y??r??t??lecek Java kodu blo??unu belirtmek i??in if ifadesini kullan??n.

        S??zdizimi
        if (ko??ul) {
          // ko??ul do??ruysa y??r??t??lecek kod blo??u
        }
        K??????k harflerle ise if oldu??una dikkat edin. B??y??k harfler (If veya IF) bir hata ??retecektir.

        A??a????daki ??rnekte, 20'nin 18'den b??y??k olup olmad??????n?? bulmak i??in iki de??eri test ediyoruz. Ko??ul do??ruysa, bir metin yazd??r??n:

        ??rnek vermek
        e??er (20 > 18) {
          System.out.println("20, 18'den b??y??kt??r");
        }

        De??i??kenleri de test edebiliriz:

        ??rnek vermek
        int x = 20;
        int y = 18;
        e??er (x > y) {
          System.out.println("x, y'den b??y??kt??r");
        }

        ??rnek a????klama
        Yukar??daki ??rnekte, x'in y'den b??y??k olup olmad??????n?? test etmek i??in x ve y olmak ??zere iki de??i??ken kullan??yoruz (> operat??r??n?? kullanarak). x 20 ve y 18 oldu??undan ve 20'nin 18'den b??y??k oldu??unu bildi??imiz i??in ekrana "x y'den b??y??kt??r" yazd??r??yoruz.


        Di??er Bildirimi
        Ko??ul yanl????sa y??r??t??lecek kod blo??unu belirtmek i??in else ifadesini kullan??n.

        S??zdizimi
        if (ko??ul) {
          // ko??ul do??ruysa y??r??t??lecek kod blo??u
        } Ba??ka {
          // ko??ul yanl????sa y??r??t??lecek kod blo??u
        }
        ??rnek vermek
        int zaman = 20;
        if (zaman < 18) {
          System.out.println("??yi g??nler.");
        } Ba??ka {
          System.out.println("??yi ak??amlar.");
        }
        // "??yi ak??amlar" ????kt??s?? verir.


        ??rnek a????klama
        Yukar??daki ??rnekte zaman (20) 18'den b??y??kt??r, dolay??s??yla ko??ul yanl????t??r. Bu nedenle di??er ko??uluna ge??iyoruz ve ekrana "??yi ak??amlar" yazd??r??yoruz. Zaman 18'den az olsayd??, program "??yi g??nler" yazd??r??rd??.

        Di??er if Bildirimi
        ??lk ko??ul yanl????sa, yeni bir ko??ul belirtmek i??in else if ifadesini kullan??n.

        S??zdizimi
        e??er (ko??ul1) {
          // ko??ul1 do??ruysa y??r??t??lecek kod blo??u
        } else if (ko??ul2) {
          // ko??ul1 yanl???? ve ko??ul2 do??ruysa y??r??t??lecek kod blo??u
        } Ba??ka {
          // ko??ul1 yanl???? ve ko??ul2 yanl????sa y??r??t??lecek kod blo??u
        }
        ??rnek vermek
        int zaman = 22;
        if (zaman < 10) {
          System.out.println("G??nayd??n.");
        } else if (zaman < 20) {
          System.out.println("??yi g??nler.");
        } Ba??ka {
          System.out.println("??yi ak??amlar.");
        }
        // "??yi ak??amlar" ????kt??s?? verir.


        ??rnek a????klama
        Yukar??daki ??rnekte, zaman (22) 10'dan b??y??kt??r, dolay??s??yla ilk ko??ul yanl????t??r. Bir sonraki ko??ul, else if ifadesinde de yanl????t??r, bu nedenle ko??ul1 ve ko??ul2'nin her ikisi de yanl???? oldu??u i??in else ko??uluna ge??iyoruz ve ekrana "??yi ak??amlar" yazd??r??yoruz.

        Ancak, saat 14 olsayd??, program??m??z "??yi g??nler" yazd??r??rd??.



     */
}
