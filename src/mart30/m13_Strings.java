package mart30;

public class m13_Strings {
    /*
       --------Java Strings
            Strings are used for storing text.

        A String variable contains a collection of characters surrounded by double quotes:

        Example
        Create a variable of type String and assign it a value:

        String greeting = "Hello";

        --String Length
            A String in Java is actually an object, which contain methods that can perform
            certain operations on strings. For example, the length of a string can be found with the
            length() method:

        Example
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

         ------More String Methods
        There are many string methods available, for example toUpperCase() and toLowerCase():

            Example
         String txt = "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        ---Finding a Character in a String
        The indexOf() method returns the index (the position) of the first occurrence of a specified text in a string (including whitespace):

        Example
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        ---Java counts positions from zero.
        0 is the first position in a string, 1 is the second, 2 is the third ...

        ---String Concatenation
        The + operator can be used between strings to combine them. This is called concatenation:

        Example
            String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);

            Note that we have added an empty text (" ") to create a space between firstName and lastName on print.

        ---You can also use the concat() method to concatenate two strings:

        Example
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

            -----Adding Numbers and Strings
            ---WARNING!

        Java uses the + operator for both addition and concatenation.

        Numbers are added. Strings are concatenated.

        If you add two numbers, the result will be a number:

        Example
        int x = 10;
        int y = 20;
        int z = x + y;      // z will be 30 (an integer/number)

        If you add two strings, the result will be a string concatenation:

        Example
        String x = "10";
        String y = "20";
        String z = x + y;   // z will be 1020 (a String)

        If you add a number and a string, the result will be a string concatenation:

        Example
        String x = "10";
        int y = 20;
        String z = x + y;   // z will be 1020 (a String)

        ------Complete String Reference
        For a complete reference of String methods, go to our Java String Methods Reference.

        The reference contains descriptions and examples of all string methods.








        ------Java Dizeleri
        Dizeler metin depolamak için kullanılır.

        Bir String değişkeni, çift tırnak içine alınmış bir karakter koleksiyonu içerir:

        Örnek
        String türünde bir değişken oluşturun ve ona bir değer atayın:

        String greeting = "Merhaba";

            ---String uzunluğu
        Java'da bir String, aslında, stringler üzerinde belirli işlemleri gerçekleştirebilen
        yöntemleri içeren bir nesnedir. Örneğin, bir dizenin uzunluğu, length() yöntemiyle bulunabilir:

        Örnek
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Txt dizesinin uzunluğu: " + txt.length());

        Daha Fazla string Yöntemi
        Kullanılabilir birçok string yöntemi vardır, örneğin toUpperCase() ve toLowerCase():

            Örnek
        String txt = "Merhaba Dünya";
         System.out.println(txt.toUpperCase()); // "HELLO WORLD" çıktısı
        System.out.println(txt.toLowerCase()); // "merhaba dünya" çıktısı verir

            Bir Dizede Karakter Bulma
        indexOf() yöntemi, belirtilen bir metnin bir dizede (boşluk dahil) ilk geçtiği
         yerin dizinini (konumunu) döndürür:

        Örnek
        String txt = "Lütfen 'bulun' işleminin gerçekleştiği yeri bulun!";
        System.out.println(txt.indexOf("bulun")); // Çıktılar 7

        -Java, konumları sıfırdan sayar.
        0, bir dizedeki ilk konum, 1 ikinci, 2 üçüncü ...

        --Dize Birleştirme
        + operatörü, dizeleri birleştirmek için dizeler arasında kullanılabilir. Buna birleştirme denir:

        Örnek
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(ad + " " + soyad);

        -Baskıda ad ve soyadı arasında bir boşluk oluşturmak için boş bir metin (" ") eklediğimizi unutmayın.

        ---İki dizeyi birleştirmek için concat() yöntemini de kullanabilirsiniz:

        Örnek
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        ----Sayılar ve Dizeler Ekleme
        UYARI!

            Java, hem toplama hem de birleştirme için + operatörünü kullanır.

        Numaralar eklenir. Dizeler birleştirilir.

        İki sayı eklerseniz, sonuç bir sayı olacaktır:

        Örnek
        int x = 10;
        int y = 20;
        int z = x + y; // z 30 olacak (tam sayı/sayı)

        --İki dize eklerseniz, sonuç bir dize bitiştirme olacaktır:

        Örnek
        dizi x = "10";
        dize y = "20";
        z = x + y dizisi; // z 1020 olacak (bir Dize)

        Bir sayı ve bir dize eklerseniz, sonuç bir dize bitiştirme olacaktır:

        Örnek
        dizi x = "10";
        int y = 20;
        z = x + y dizisi; // z 1020 olacak (bir Dize)


        Complete String Reference
        For a complete reference of String methods, go to our Java String Methods Reference.

        The reference contains descriptions and examples of all string methods.


        Tam Dizi Referansı
        Dize yöntemlerinin eksiksiz bir referansı için Java Dize Yöntemleri Referansımıza gidin.

        Başvuru, tüm dize yöntemlerinin açıklamalarını ve örneklerini içerir.

     */
}
