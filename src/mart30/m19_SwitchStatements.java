                package mart30;

                public class m19_SwitchStatements {
                    /*
                Java Switch Statements
                Use the switch statement to select one of many code blocks to be executed.

                Syntax
                switch(expression) {
                  case x:
                    // code block
                    break;
                  case y:
                    // code block
                    break;
                  default:
                    // code block
                }
                This is how it works:

                The switch expression is evaluated once.
                The value of the expression is compared with the values of each case.
                If there is a match, the associated block of code is executed.
                The break and default keywords are optional, and will be described later in this chapter
                The example below uses the weekday number to calculate the weekday name:

                Example
                int day = 4;
                switch (day) {
                  case 1:
                    System.out.println("Monday");
                    break;
                  case 2:
                    System.out.println("Tuesday");
                    break;
                  case 3:
                    System.out.println("Wednesday");
                    break;
                  case 4:
                    System.out.println("Thursday");
                    break;
                  case 5:
                    System.out.println("Friday");
                    break;
                  case 6:
                    System.out.println("Saturday");
                    break;
                  case 7:
                    System.out.println("Sunday");
                    break;
                }
                // Outputs "Thursday" (day 4)

                The break Keyword
                When Java reaches a break keyword, it breaks out of the switch block.

                This will stop the execution of more code and case testing inside the block.

                When a match is found, and the job is done, it's time for a break. There is no need for more testing.

                A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.

                The default Keyword
                The default keyword specifies some code to run if there is no case match:

                Example
                int day = 4;
                switch (day) {
                  case 6:
                    System.out.println("Today is Saturday");
                    break;
                  case 7:
                    System.out.println("Today is Sunday");
                    break;
                  default:
                    System.out.println("Looking forward to the Weekend");
                }
                // Outputs "Looking forward to the Weekend"


                Note that if the default statement is used as the last statement in a switch block, it does not need a break.










                Java Anahtarı İfadeleri
                Yürütülecek birçok kod bloğundan birini seçmek için switch ifadesini kullanın.

                Sözdizimi
                switch(ifade) {
                  durum x:
                    // kod bloğu
                    kırmak;
                  durum y:
                    // kod bloğu
                    kırmak;
                  varsayılan:
                    // kod bloğu
                }
                Bu nasıl çalışır:

                Switch ifadesi bir kez değerlendirilir.
                İfadenin değeri, her bir durumun değerleri ile karşılaştırılır.
                Bir eşleşme varsa, ilgili kod bloğu yürütülür.
                break ve default anahtar sözcükleri isteğe bağlıdır ve bu bölümde daha sonra açıklanacaktır.
                Aşağıdaki örnek, haftanın günü adını hesaplamak için gün numarasını kullanır:

                Örnek vermek
                int gün = 4;
                geçiş (gün) {
                  dava 1:
                    System.out.println("Pazartesi");
                    kırmak;
                  durum 2:
                    System.out.println("Salı");
                    kırmak;
                  durum 3:
                    System.out.println("Çarşamba");
                    kırmak;
                  durum 4:
                    System.out.println("Perşembe");
                    kırmak;
                  durum 5:
                    System.out.println("Cuma");
                    kırmak;
                  durum 6:
                    System.out.println("Cumartesi");
                    kırmak;
                  durum 7:
                    System.out.println("Pazar");
                    kırmak;
                }
                // "Perşembe" çıktısı (4. gün)

                Ara Anahtar Kelime
                Java bir break anahtar sözcüğüne ulaştığında, anahtar bloğundan çıkar.

                Bu, blok içinde daha fazla kod ve vaka testinin yürütülmesini durduracaktır.

                Bir eşleşme bulunduğunda ve iş bittiğinde, mola verme zamanı. Daha fazla teste gerek yok.

                Bir mola, anahtar bloğundaki kodun geri kalanının tümünün yürütülmesini "yok saydığı" için çok fazla yürütme süresi kazandırabilir.
                Varsayılan Anahtar Kelime
                Varsayılan anahtar kelime, büyük/küçük harf eşleşmesi olmadığında çalıştırılacak bazı kodları belirtir:

                Örnek vermek
                int gün = 4;
                geçiş (gün) {
                  durum 6:
                    System.out.println("Bugün Cumartesi");
                    kırmak;
                  durum 7:
                    System.out.println("Bugün Pazar");
                    kırmak;
                  varsayılan:
                    System.out.println("Hafta Sonunu Bekliyoruz");
                }
                // "Hafta sonunu dört gözle bekliyorum" çıktıları


                Bir switch bloğundaki son deyim olarak varsayılan deyim kullanılırsa, bir break gerekmediğini unutmayın.




                     */
                }
