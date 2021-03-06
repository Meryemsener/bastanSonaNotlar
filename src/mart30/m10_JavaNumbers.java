package mart30;

public class m10_JavaNumbers {
    /*
      ---- Numbers
        Primitive number types are divided into two groups:
        Integer types stores whole numbers, positive or negative (such as 123 or -456),
        without decimals. Valid types are byte, short, int and long. Which type you should use,
        depends on the numeric value.

        Floating point types represents numbers with a fractional part, containing one or more decimals.
         There are two types: float and double.

        Even though there are many numeric types in Java, the most used for numbers are int
        (for whole numbers) and double (for floating point numbers). However, we will describe
        them all as you continue to read.

      -- Integer Types
        Byte
        The byte data type can store whole numbers from -128 to 127.
        This can be used instead of int or other integer types to save memory when
         you are certain that the value will be within -128 and 127:

        Example
         byte myNum = 100;
         System.out.println(myNum);

        --Short
        The short data type can store whole numbers from -32768 to 32767:

        Example
            short myNum = 5000;
            System.out.println(myNum);

        ---Int
        The int data type can store whole numbers from -2147483648 to 2147483647.
        In general, and in our tutorial, the int data type is the preferred data type when
        we create variables with a numeric value.

        Example
        int myNum = 100000;
            System.out.println(myNum);

        --Long
        The long data type can store whole numbers from -9223372036854775808 to 9223372036854775807.
        This is used when int is not large enough to store the value. Note that you should end the
        value with an "L":

        Example
        long myNum = 15000000000L;
            System.out.println(myNum);

        ----Floating Point Types
        You should use a floating point type whenever you need a number with a decimal,
        such as 9.99 or 3.14515.

        --Float
        The float data type can store fractional numbers from 3.4e???038 to 3.4e+038.
         Note that you should end the value with an "f":

        Example
        float myNum = 5.75f;
        System.out.println(myNum);

        ---Double
        The double data type can store fractional numbers from 1.7e???308 to 1.7e+308.
        Note that you should end the value with a "d":

        Example
        double myNum = 19.99d;
        System.out.println(myNum);

        ---Use float or double?---
         The precision of a floating point value indicates how many digits the value
         can have after the decimal point. The precision of float is only six or seven
         decimal digits, while double variables have a precision of about 15 digits.
          Therefore it is safer to use double for most calculations.

        ---Scientific Numbers
        A floating point number can also be a scientific number with an "e" to indicate the power of 10:

        Example
        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);


           -----Boolean Types
            A boolean data type is declared with the boolean keyword and can only take
            the values true or false:

            Example
             boolean isJavaFun = true;
            boolean isFishTasty = false;
            System.out.println(isJavaFun);     // Outputs true
            System.out.println(isFishTasty);   // Outputs false

           Boolean values are mostly used for conditional testing, which you will learn more about in
            a later chapter.

        ---Characters
            The char data type is used to store a single character.
            The character must be surrounded by single quotes, like 'A' or 'c':

          Example
          char myGrade = 'B';
         System.out.println(myGrade);

        ---Alternatively, if you are familiar with ASCII values, you can use those to display certain characters:

          Example
         char myVar1 = 65, myVar2 = 66, myVar3 = 67;
         System.out.println(myVar1);
         System.out.println(myVar2);
         System.out.println(myVar3);

        Tip: A list of all ASCII values can be found in our ASCII Table Reference.

         Strings
         The String data type is used to store a sequence of characters (text).
         String values must be surrounded by double quotes:

        Example
        String greeting = "Hello World";
        System.out.println(greeting);

        The String type is so much used and integrated in Java, that some call it "the special ninth type".

       A String in Java is actually a non-primitive data type,  because it refers to an object.
       The String object has  methods that are used to perform certain operations on strings.
       Don't worry if you don't understand the term "object" just yet.
        We will learn more about strings and objects in a later chapter.




            ---Say??lar
        ??lkel say?? t??rleri iki gruba ayr??l??r:
        Tamsay?? t??rleri, pozitif veya negatif (123 veya -456 gibi) tam say??lar?? ondal??k olmadan saklar.
        Ge??erli t??rler bayt, k??sa, int ve uzundur. Hangi t??r?? kullanman??z gerekti??i, say??sal de??ere ba??l??d??r.
        Kayan nokta t??rleri, bir veya daha fazla ondal??k basamak i??eren kesirli k??sm?? olan say??lar??
        temsil eder. ??ki tip vard??r: float ve double. Java'da bir??ok say??sal t??r olmas??na ra??men,
        say??lar i??in en ??ok kullan??lanlar int (tam say??lar i??in) ve double (kayan noktal?? say??lar i??in)'dir.
        Ancak siz okumaya devam ederken biz hepsini anlataca????z.

       Tamsay?? T??rleri
      --- Bayt
       Bayt veri t??r??, -128 ile 127 aras??ndaki tam say??lar?? saklayabilir.
       De??erin -128 ve 127 aras??nda olaca????ndan emin oldu??unuzda bellekten tasarruf etmek i??in bu,
       int veya di??er tamsay?? t??rleri yerine kullan??labilir:

      ??rnek
      bayt myNum = 100;
       System.out.println(myNum);

     --- short
     short data type, -32768 ile 32767 aras??ndaki tam say??lar?? saklayabilir:

      ??rnek
       short myNum = 5000;
       System.out.println(myNum);

      --- int
       int veri t??r??, -2147483648 ile 2147483647 aras??ndaki tam say??lar?? saklayabilir.
       Genel olarak ve ????reticimizde, say??sal bir de??ere sahip de??i??kenler olu??turdu??umuzda
       int veri t??r?? tercih edilen veri t??r??d??r.

     ??rnek
     int myNum = 100000;
     System.out.println(myNum);

      --- long
      long veri t??r??, -9223372036854775808 ile 9223372036854775807 aras??ndaki tam say??lar?? saklayabilir.
      Bu, int de??eri depolayacak kadar b??y??k olmad??????nda kullan??l??r.
      De??eri bir "L" ile bitirmeniz gerekti??ini unutmay??n:

      ??rnek
     uzun myNum = 15000000000L;
     System.out.println(myNum);

        ---floating Nokta T??rleri
     9.99 veya 3.14515 gibi ondal??k basamakl?? bir say??ya ihtiyac??n??z oldu??unda kayan nokta t??r?? kullanmal??s??n??z.

       --float
      Float veri t??r??, 3.4e-038 ile 3.4e+038 aras??ndaki kesirli say??lar?? saklayabilir. De??eri bir "f" ile sonland??rman??z gerekti??ini unutmay??n:

       ??rnek
       float myNum = 5.75f;
        System.out.println(myNum);

        --double
       Double veri t??r??, 1,7e???308 ila 1,7e+308 aras??ndaki kesirli say??lar?? saklayabilir.
       De??eri bir "d" ile sonland??rman??z gerekti??ini unutmay??n:

         ??rnek
      double  myNum = 19.99d;
      System.out.println(myNum);

     ----Float m?? yoksa ??ift mi kullan??yorsunuz?

      float de??erinin kesinli??i, de??erin ondal??k noktadan sonra ka?? basama??a
       sahip olabilece??ini g??sterir. Float'??n kesinli??i yaln??zca alt?? veya yedi ondal??k basamak iken,
       ??ift de??i??kenlerin kesinli??i yakla????k 15 basamakt??r. Bu nedenle ??o??u hesaplama i??in double
       kullanmak daha g??venlidir.

     ---Bilimsel Say??lar
      Bir kayan noktal?? say??, 10'un g??c??n?? belirtmek i??in "e" ile g??sterilen bilimsel bir say?? da olabilir:

       Example
       float f1 = 35e3f;
       double d1 = 12E4d;
      System.out.println(f1);
      System.out.println(d1);

      ---Boolean T??rleri
       Boolean veri t??r??, boolean anahtar s??zc??????yle bildirilir ve yaln??zca true veya false de??erlerini alabilir:

       ??rnek
       boolean isJavaFun = true;
       boolean isFishTasty = yanl????;
       System.out.println(isJavaFun); // ????kt??lar do??ru
       System.out.println(isFishTasty); // yanl???? ????kt?? verir

      Boolean de??erleri, daha sonraki bir b??l??mde daha fazlas??n?? ????renece??iniz ko??ullu
      testler i??in ??o??unlukla kullan??l??r.

       ---Character
      Char veri t??r??, tek bir karakter depolamak i??in kullan??l??r. Karakter, 'A' veya 'c'
      gibi tek t??rnak i??ine al??nmal??d??r:

      ??rnek
      char myGrade = 'B';
      System.out.println(myGrade);

        Alternatif olarak, ASCII de??erlerine a??ina iseniz, belirli karakterleri g??r??nt??lemek
        i??in bunlar?? kullanabilirsiniz:

        ??rnek
        karakter myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        ??pucu: T??m ASCII de??erlerinin bir listesi ASCII Tablo Referans??m??zda bulunabilir.

        Strings
        String veri t??r??, bir dizi karakter (metin) depolamak i??in kullan??l??r.
        Dize de??erleri ??ift t??rnak i??ine al??nmal??d??r:

       ??rnek
        String selamlama = "Merhaba D??nya";
        System.out.println(tebrik);

        Dize t??r??, Java'da o kadar ??ok kullan??l??r ve entegre edilir ki, baz??lar??
        buna ""the special ninth type"/??zel dokuzuncu t??r" der.

            Java'daki bir String, bir nesneye at??fta bulundu??undan,
            asl??nda ilkel olmayan bir veri t??r??d??r. String nesnesi, dizeler ??zerinde belirli i??lemleri
            ger??ekle??tirmek i??in kullan??lan y??ntemlere sahiptir. Hen??z "nesne" terimini
            anlamad??ysan??z endi??elenmeyin. Daha sonraki bir b??l??mde diziler ve nesneler
            hakk??nda daha fazla ??ey ????renece??iz.

     */
}
