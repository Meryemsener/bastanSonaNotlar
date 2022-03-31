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
        The float data type can store fractional numbers from 3.4e−038 to 3.4e+038.
         Note that you should end the value with an "f":

        Example
        float myNum = 5.75f;
        System.out.println(myNum);

        ---Double
        The double data type can store fractional numbers from 1.7e−308 to 1.7e+308.
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




            ---Sayılar
        İlkel sayı türleri iki gruba ayrılır:
        Tamsayı türleri, pozitif veya negatif (123 veya -456 gibi) tam sayıları ondalık olmadan saklar.
        Geçerli türler bayt, kısa, int ve uzundur. Hangi türü kullanmanız gerektiği, sayısal değere bağlıdır.
        Kayan nokta türleri, bir veya daha fazla ondalık basamak içeren kesirli kısmı olan sayıları
        temsil eder. İki tip vardır: float ve double. Java'da birçok sayısal tür olmasına rağmen,
        sayılar için en çok kullanılanlar int (tam sayılar için) ve double (kayan noktalı sayılar için)'dir.
        Ancak siz okumaya devam ederken biz hepsini anlatacağız.

       Tamsayı Türleri
      --- Bayt
       Bayt veri türü, -128 ile 127 arasındaki tam sayıları saklayabilir.
       Değerin -128 ve 127 arasında olacağından emin olduğunuzda bellekten tasarruf etmek için bu,
       int veya diğer tamsayı türleri yerine kullanılabilir:

      Örnek
      bayt myNum = 100;
       System.out.println(myNum);

     --- short
     short data type, -32768 ile 32767 arasındaki tam sayıları saklayabilir:

      Örnek
       short myNum = 5000;
       System.out.println(myNum);

      --- int
       int veri türü, -2147483648 ile 2147483647 arasındaki tam sayıları saklayabilir.
       Genel olarak ve öğreticimizde, sayısal bir değere sahip değişkenler oluşturduğumuzda
       int veri türü tercih edilen veri türüdür.

     Örnek
     int myNum = 100000;
     System.out.println(myNum);

      --- long
      long veri türü, -9223372036854775808 ile 9223372036854775807 arasındaki tam sayıları saklayabilir.
      Bu, int değeri depolayacak kadar büyük olmadığında kullanılır.
      Değeri bir "L" ile bitirmeniz gerektiğini unutmayın:

      Örnek
     uzun myNum = 15000000000L;
     System.out.println(myNum);

        ---floating Nokta Türleri
     9.99 veya 3.14515 gibi ondalık basamaklı bir sayıya ihtiyacınız olduğunda kayan nokta türü kullanmalısınız.

       --float
      Float veri türü, 3.4e-038 ile 3.4e+038 arasındaki kesirli sayıları saklayabilir. Değeri bir "f" ile sonlandırmanız gerektiğini unutmayın:

       Örnek
       float myNum = 5.75f;
        System.out.println(myNum);

        --double
       Double veri türü, 1,7e−308 ila 1,7e+308 arasındaki kesirli sayıları saklayabilir.
       Değeri bir "d" ile sonlandırmanız gerektiğini unutmayın:

         Örnek
      double  myNum = 19.99d;
      System.out.println(myNum);

     ----Float mı yoksa çift mi kullanıyorsunuz?

      float değerinin kesinliği, değerin ondalık noktadan sonra kaç basamağa
       sahip olabileceğini gösterir. Float'ın kesinliği yalnızca altı veya yedi ondalık basamak iken,
       çift değişkenlerin kesinliği yaklaşık 15 basamaktır. Bu nedenle çoğu hesaplama için double
       kullanmak daha güvenlidir.

     ---Bilimsel Sayılar
      Bir kayan noktalı sayı, 10'un gücünü belirtmek için "e" ile gösterilen bilimsel bir sayı da olabilir:

       Example
       float f1 = 35e3f;
       double d1 = 12E4d;
      System.out.println(f1);
      System.out.println(d1);

      ---Boolean Türleri
       Boolean veri türü, boolean anahtar sözcüğüyle bildirilir ve yalnızca true veya false değerlerini alabilir:

       Örnek
       boolean isJavaFun = true;
       boolean isFishTasty = yanlış;
       System.out.println(isJavaFun); // çıktılar doğru
       System.out.println(isFishTasty); // yanlış çıktı verir

      Boolean değerleri, daha sonraki bir bölümde daha fazlasını öğreneceğiniz koşullu
      testler için çoğunlukla kullanılır.

       ---Character
      Char veri türü, tek bir karakter depolamak için kullanılır. Karakter, 'A' veya 'c'
      gibi tek tırnak içine alınmalıdır:

      Örnek
      char myGrade = 'B';
      System.out.println(myGrade);

        Alternatif olarak, ASCII değerlerine aşina iseniz, belirli karakterleri görüntülemek
        için bunları kullanabilirsiniz:

        Örnek
        karakter myVar1 = 65, myVar2 = 66, myVar3 = 67;
        System.out.println(myVar1);
        System.out.println(myVar2);
        System.out.println(myVar3);

        İpucu: Tüm ASCII değerlerinin bir listesi ASCII Tablo Referansımızda bulunabilir.

        Strings
        String veri türü, bir dizi karakter (metin) depolamak için kullanılır.
        Dize değerleri çift tırnak içine alınmalıdır:

       Örnek
        String selamlama = "Merhaba Dünya";
        System.out.println(tebrik);

        Dize türü, Java'da o kadar çok kullanılır ve entegre edilir ki, bazıları
        buna ""the special ninth type"/özel dokuzuncu tür" der.

            Java'daki bir String, bir nesneye atıfta bulunduğundan,
            aslında ilkel olmayan bir veri türüdür. String nesnesi, dizeler üzerinde belirli işlemleri
            gerçekleştirmek için kullanılan yöntemlere sahiptir. Henüz "nesne" terimini
            anlamadıysanız endişelenmeyin. Daha sonraki bir bölümde diziler ve nesneler
            hakkında daha fazla şey öğreneceğiz.

     */
}
