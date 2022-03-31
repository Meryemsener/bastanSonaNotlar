package mart30;

public class m13_Operators {
    /*
        ------ Java Operators
       Operators are used to perform operations on variables and values.

      In the example below, we use the + operator to add together two values:

    Example
    int x = 100 + 50;

     Although the + operator is often used to add together two values,
     like in the example above, it can also be used to add together a variable and a value, or a variable and another variable:

            Example
        int sum1 = 100 + 50;        // 150 (100 + 50)
        int sum2 = sum1 + 250;      // 400 (150 + 250)
        int sum3 = sum2 + sum2;     // 800 (400 + 400)

        Java divides the operators into the following groups:

        Arithmetic operators
        Assignment operators
        Comparison operators
        Logical operators
        Bitwise operators
        Arithmetic Operators
        Arithmetic operators are used to perform common mathematical operations.

            Operator	Name	Description	Example	Try it
        +	Addition	Adds together two values	x + y
        -	Subtraction	Subtracts one value from another	x - y
        *	Multiplication	Multiplies two values	x * y
        /	Division	Divides one value by another	x / y
        %	Modulus	Returns the division remainder	x % y
        ++	Increment	Increases the value of a variable by 1	++x
        --	Decrement	Decreases the value of a variable by 1	--x

          -----Java Assignment Operators
        Assignment operators are used to assign values to variables.

        In the example below, we use the assignment operator (=) to assign the value 10 to
         a variable called x:

        Example
        int x = 10;

        The addition assignment operator (+=) adds a value to a variable:

        Example
        int x = 10;
        x += 5;

       A list of all assignment operators:

        Operator	Example	Same As	Try it
        =	x = 5	x = 5
        +=	x += 3	x = x + 3
        -=	x -= 3	x = x - 3
        *=	x *= 3	x = x * 3
        /=	x /= 3	x = x / 3
        %=	x %= 3	x = x % 3
        &=	x &= 3	x = x & 3
        |=	x |= 3	x = x | 3
        ^=	x ^= 3	x = x ^ 3
        >>=	x >>= 3	x = x >> 3
        <<=	x <<= 3	x = x << 3
        Java Comparison Operators
        Comparison operators are used to compare two values:

        Operator	Name	Example	Try it
        ==	Equal to	x == y
        !=	Not equal	x != y
        >	Greater than	x > y
        <	Less than	x < y
        >=	Greater than or equal to	x >= y
        <=	Less than or equal to	x <= y

        Java Logical Operators
        Logical operators are used to determine the logic between variables or values:

        Operator	Name	Description	Example	Try it
        && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
        || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
        !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)





        ----Java Operatörleri
        Operatörler, değişkenler ve değerler üzerinde işlem yapmak için kullanılır.

        Aşağıdaki örnekte, iki değeri bir araya getirmek için + operatörünü kullanıyoruz:

        Örnek
        int x = 100 + 50;

        + operatörü genellikle yukarıdaki örnekte olduğu gibi iki değeri bir araya getirmek
        için kullanılsa da, bir değişken ile bir değeri veya bir değişken ile başka bir
        değişkeni birlikte eklemek için de kullanılabilir:

        Örnek
        int toplam1 = 100 + 50; // 150 (100 + 50)
        int toplam2 = toplam1 + 250; // 400 (150 + 250)
        int toplam3 = toplam2 + toplam2; // 800 (400 + 400)

        Java, operatörleri aşağıdaki gruplara ayırır:

        Aritmetik operatörler
        atama operatörleri
        karşılaştırma operatörleri
        Mantıksal operatörler
        bitsel operatörler
        Aritmetik operatörler
        Aritmetik operatörler, yaygın matematiksel işlemleri gerçekleştirmek için kullanılır.

        Operatör Adı Açıklama Örnek Deneyin
        + Toplama İki değeri x + y toplar
        - Çıkarma Bir değeri diğer x - y'den çıkarır
        * Çarpma İki değeri x * y ile çarpar
        / Bölme Bir değeri diğerine böler x / y
        % Modül Bölmede kalan x % y'yi verir
        ++ Artış Bir değişkenin değerini 1 ++x artırır
        -- Azaltma Bir değişkenin değerini 1 azaltır --x

        ---Java Atama Operatörleri
        Değişkenlere değer atamak için atama operatörleri kullanılır.

        Aşağıdaki örnekte, x adlı bir değişkene 10 değerini atamak için atama operatörünü (=) kullanıyoruz:

        Örnek
        int x = 10;

        Toplama atama operatörü (+=), bir değişkene bir değer ekler:

            Ornek
        int x = 10;
        x += 5;

        Tüm atama operatörlerinin listesi:

        Operatör Örneği Deneyin
        = x = 5 x = 5
        += x += 3 x = x + 3
        -= x -= 3 x = x - 3
        *= x *= 3 x = x * 3
        /= x /= 3 x = x / 3
        %= x %= 3 x = x % 3
        &= x &= 3 x = x & 3
        |= x |= 3 x = x | 3
        ^= x ^= 3 x = x ^ 3
        >>= x >>= 3 x = x >> 3
        <<= x <<= 3 x = x << 3

            Java Karşılaştırma Operatörleri
        Karşılaştırma operatörleri iki değeri karşılaştırmak için kullanılır:

            Operatör Adı Örneği Deneyin
        == x'e eşittir == y
        != x'e eşit değil != y
        > x > y'den büyük
        < x'ten küçük < y
        >= x'ten büyük veya eşittir >= y
        <= x'ten küçük veya ona eşit <= y

            ---Java Mantıksal Operatörleri
        Mantıksal operatörler, değişkenler veya değerler arasındaki mantığı belirlemek için kullanılır:

            --Operatör Adı Açıklama Örnek Deneyin
        && Mantıksal ve her iki ifade de doğruysa doğru döndürür x < 5 && x < 10
        || Mantıksal veya İfadelerden biri doğruysa doğru döndürür x < 5 || x < 4
        ! Mantıksal değil Sonucu tersine çevirir, sonuç doğruysa false döndürür !(x < 5 && x < 10)
     */
}
