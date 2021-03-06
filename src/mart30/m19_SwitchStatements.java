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










                Java Anahtar?? ??fadeleri
                Y??r??t??lecek bir??ok kod blo??undan birini se??mek i??in switch ifadesini kullan??n.

                S??zdizimi
                switch(ifade) {
                  durum x:
                    // kod blo??u
                    k??rmak;
                  durum y:
                    // kod blo??u
                    k??rmak;
                  varsay??lan:
                    // kod blo??u
                }
                Bu nas??l ??al??????r:

                Switch ifadesi bir kez de??erlendirilir.
                ??fadenin de??eri, her bir durumun de??erleri ile kar????la??t??r??l??r.
                Bir e??le??me varsa, ilgili kod blo??u y??r??t??l??r.
                break ve default anahtar s??zc??kleri iste??e ba??l??d??r ve bu b??l??mde daha sonra a????klanacakt??r.
                A??a????daki ??rnek, haftan??n g??n?? ad??n?? hesaplamak i??in g??n numaras??n?? kullan??r:

                ??rnek vermek
                int g??n = 4;
                ge??i?? (g??n) {
                  dava 1:
                    System.out.println("Pazartesi");
                    k??rmak;
                  durum 2:
                    System.out.println("Sal??");
                    k??rmak;
                  durum 3:
                    System.out.println("??ar??amba");
                    k??rmak;
                  durum 4:
                    System.out.println("Per??embe");
                    k??rmak;
                  durum 5:
                    System.out.println("Cuma");
                    k??rmak;
                  durum 6:
                    System.out.println("Cumartesi");
                    k??rmak;
                  durum 7:
                    System.out.println("Pazar");
                    k??rmak;
                }
                // "Per??embe" ????kt??s?? (4. g??n)

                Ara Anahtar Kelime
                Java bir break anahtar s??zc??????ne ula??t??????nda, anahtar blo??undan ????kar.

                Bu, blok i??inde daha fazla kod ve vaka testinin y??r??t??lmesini durduracakt??r.

                Bir e??le??me bulundu??unda ve i?? bitti??inde, mola verme zaman??. Daha fazla teste gerek yok.

                Bir mola, anahtar blo??undaki kodun geri kalan??n??n t??m??n??n y??r??t??lmesini "yok sayd??????" i??in ??ok fazla y??r??tme s??resi kazand??rabilir.
                Varsay??lan Anahtar Kelime
                Varsay??lan anahtar kelime, b??y??k/k??????k harf e??le??mesi olmad??????nda ??al????t??r??lacak baz?? kodlar?? belirtir:

                ??rnek vermek
                int g??n = 4;
                ge??i?? (g??n) {
                  durum 6:
                    System.out.println("Bug??n Cumartesi");
                    k??rmak;
                  durum 7:
                    System.out.println("Bug??n Pazar");
                    k??rmak;
                  varsay??lan:
                    System.out.println("Hafta Sonunu Bekliyoruz");
                }
                // "Hafta sonunu d??rt g??zle bekliyorum" ????kt??lar??


                Bir switch blo??undaki son deyim olarak varsay??lan deyim kullan??l??rsa, bir break gerekmedi??ini unutmay??n.




                     */
                }
