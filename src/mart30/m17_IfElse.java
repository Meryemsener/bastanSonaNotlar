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










            Java Koşulları ve If İfadeleri
            Java, matematikteki olağan mantıksal koşulları destekler:

            Küçüktür: a < b
            Küçük veya eşit: a <= b
        Şundan büyüktür: a > b
        Şundan büyük veya eşittir: a >= b
        a == b'ye eşit
        Eşit Değil: a != b
        Farklı kararlar için farklı eylemler gerçekleştirmek için bu koşulları kullanabilirsiniz.

        Java aşağıdaki koşullu ifadelere sahiptir:

        Belirtilen bir koşul doğruysa yürütülecek bir kod bloğu belirtmek için if kullanın
        Aynı koşul yanlışsa, yürütülecek kod bloğunu belirtmek için else kullanın.
        İlk koşul yanlışsa, test edilecek yeni bir koşul belirtmek için else if öğesini kullanın.
        Yürütülecek birçok alternatif kod bloğu belirtmek için anahtarı kullanın
        if Bildirimi
        Bir koşul doğruysa yürütülecek Java kodu bloğunu belirtmek için if ifadesini kullanın.

        Sözdizimi
        if (koşul) {
          // koşul doğruysa yürütülecek kod bloğu
        }
        Küçük harflerle ise if olduğuna dikkat edin. Büyük harfler (If veya IF) bir hata üretecektir.

        Aşağıdaki örnekte, 20'nin 18'den büyük olup olmadığını bulmak için iki değeri test ediyoruz. Koşul doğruysa, bir metin yazdırın:

        Örnek vermek
        eğer (20 > 18) {
          System.out.println("20, 18'den büyüktür");
        }

        Değişkenleri de test edebiliriz:

        Örnek vermek
        int x = 20;
        int y = 18;
        eğer (x > y) {
          System.out.println("x, y'den büyüktür");
        }

        Örnek açıklama
        Yukarıdaki örnekte, x'in y'den büyük olup olmadığını test etmek için x ve y olmak üzere iki değişken kullanıyoruz (> operatörünü kullanarak). x 20 ve y 18 olduğundan ve 20'nin 18'den büyük olduğunu bildiğimiz için ekrana "x y'den büyüktür" yazdırıyoruz.


        Diğer Bildirimi
        Koşul yanlışsa yürütülecek kod bloğunu belirtmek için else ifadesini kullanın.

        Sözdizimi
        if (koşul) {
          // koşul doğruysa yürütülecek kod bloğu
        } Başka {
          // koşul yanlışsa yürütülecek kod bloğu
        }
        Örnek vermek
        int zaman = 20;
        if (zaman < 18) {
          System.out.println("İyi günler.");
        } Başka {
          System.out.println("İyi akşamlar.");
        }
        // "İyi akşamlar" çıktısı verir.


        Örnek açıklama
        Yukarıdaki örnekte zaman (20) 18'den büyüktür, dolayısıyla koşul yanlıştır. Bu nedenle diğer koşuluna geçiyoruz ve ekrana "İyi akşamlar" yazdırıyoruz. Zaman 18'den az olsaydı, program "İyi günler" yazdırırdı.

        Diğer if Bildirimi
        İlk koşul yanlışsa, yeni bir koşul belirtmek için else if ifadesini kullanın.

        Sözdizimi
        eğer (koşul1) {
          // koşul1 doğruysa yürütülecek kod bloğu
        } else if (koşul2) {
          // koşul1 yanlış ve koşul2 doğruysa yürütülecek kod bloğu
        } Başka {
          // koşul1 yanlış ve koşul2 yanlışsa yürütülecek kod bloğu
        }
        Örnek vermek
        int zaman = 22;
        if (zaman < 10) {
          System.out.println("Günaydın.");
        } else if (zaman < 20) {
          System.out.println("İyi günler.");
        } Başka {
          System.out.println("İyi akşamlar.");
        }
        // "İyi akşamlar" çıktısı verir.


        Örnek açıklama
        Yukarıdaki örnekte, zaman (22) 10'dan büyüktür, dolayısıyla ilk koşul yanlıştır. Bir sonraki koşul, else if ifadesinde de yanlıştır, bu nedenle koşul1 ve koşul2'nin her ikisi de yanlış olduğu için else koşuluna geçiyoruz ve ekrana "İyi akşamlar" yazdırıyoruz.

        Ancak, saat 14 olsaydı, programımız "İyi günler" yazdırırdı.



     */
}
