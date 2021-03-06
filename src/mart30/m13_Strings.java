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
        Dizeler metin depolamak i??in kullan??l??r.

        Bir String de??i??keni, ??ift t??rnak i??ine al??nm???? bir karakter koleksiyonu i??erir:

        ??rnek
        String t??r??nde bir de??i??ken olu??turun ve ona bir de??er atay??n:

        String greeting = "Merhaba";

            ---String uzunlu??u
        Java'da bir String, asl??nda, stringler ??zerinde belirli i??lemleri ger??ekle??tirebilen
        y??ntemleri i??eren bir nesnedir. ??rne??in, bir dizenin uzunlu??u, length() y??ntemiyle bulunabilir:

        ??rnek
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Txt dizesinin uzunlu??u: " + txt.length());

        Daha Fazla string Y??ntemi
        Kullan??labilir bir??ok string y??ntemi vard??r, ??rne??in toUpperCase() ve toLowerCase():

            ??rnek
        String txt = "Merhaba D??nya";
         System.out.println(txt.toUpperCase()); // "HELLO WORLD" ????kt??s??
        System.out.println(txt.toLowerCase()); // "merhaba d??nya" ????kt??s?? verir

            Bir Dizede Karakter Bulma
        indexOf() y??ntemi, belirtilen bir metnin bir dizede (bo??luk dahil) ilk ge??ti??i
         yerin dizinini (konumunu) d??nd??r??r:

        ??rnek
        String txt = "L??tfen 'bulun' i??leminin ger??ekle??ti??i yeri bulun!";
        System.out.println(txt.indexOf("bulun")); // ????kt??lar 7

        -Java, konumlar?? s??f??rdan sayar.
        0, bir dizedeki ilk konum, 1 ikinci, 2 ??????nc?? ...

        --Dize Birle??tirme
        + operat??r??, dizeleri birle??tirmek i??in dizeler aras??nda kullan??labilir. Buna birle??tirme denir:

        ??rnek
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(ad + " " + soyad);

        -Bask??da ad ve soyad?? aras??nda bir bo??luk olu??turmak i??in bo?? bir metin (" ") ekledi??imizi unutmay??n.

        ---??ki dizeyi birle??tirmek i??in concat() y??ntemini de kullanabilirsiniz:

        ??rnek
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));

        ----Say??lar ve Dizeler Ekleme
        UYARI!

            Java, hem toplama hem de birle??tirme i??in + operat??r??n?? kullan??r.

        Numaralar eklenir. Dizeler birle??tirilir.

        ??ki say?? eklerseniz, sonu?? bir say?? olacakt??r:

        ??rnek
        int x = 10;
        int y = 20;
        int z = x + y; // z 30 olacak (tam say??/say??)

        --??ki dize eklerseniz, sonu?? bir dize biti??tirme olacakt??r:

        ??rnek
        dizi x = "10";
        dize y = "20";
        z = x + y dizisi; // z 1020 olacak (bir Dize)

        Bir say?? ve bir dize eklerseniz, sonu?? bir dize biti??tirme olacakt??r:

        ??rnek
        dizi x = "10";
        int y = 20;
        z = x + y dizisi; // z 1020 olacak (bir Dize)


        Complete String Reference
        For a complete reference of String methods, go to our Java String Methods Reference.

        The reference contains descriptions and examples of all string methods.


        Tam Dizi Referans??
        Dize y??ntemlerinin eksiksiz bir referans?? i??in Java Dize Y??ntemleri Referans??m??za gidin.

        Ba??vuru, t??m dize y??ntemlerinin a????klamalar??n?? ve ??rneklerini i??erir.

     */
}
