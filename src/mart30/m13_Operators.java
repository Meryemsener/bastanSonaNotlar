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





        ----Java Operat??rleri
        Operat??rler, de??i??kenler ve de??erler ??zerinde i??lem yapmak i??in kullan??l??r.

        A??a????daki ??rnekte, iki de??eri bir araya getirmek i??in + operat??r??n?? kullan??yoruz:

        ??rnek
        int x = 100 + 50;

        + operat??r?? genellikle yukar??daki ??rnekte oldu??u gibi iki de??eri bir araya getirmek
        i??in kullan??lsa da, bir de??i??ken ile bir de??eri veya bir de??i??ken ile ba??ka bir
        de??i??keni birlikte eklemek i??in de kullan??labilir:

        ??rnek
        int toplam1 = 100 + 50; // 150 (100 + 50)
        int toplam2 = toplam1 + 250; // 400 (150 + 250)
        int toplam3 = toplam2 + toplam2; // 800 (400 + 400)

        Java, operat??rleri a??a????daki gruplara ay??r??r:

        Aritmetik operat??rler
        atama operat??rleri
        kar????la??t??rma operat??rleri
        Mant??ksal operat??rler
        bitsel operat??rler
        Aritmetik operat??rler
        Aritmetik operat??rler, yayg??n matematiksel i??lemleri ger??ekle??tirmek i??in kullan??l??r.

        Operat??r Ad?? A????klama ??rnek Deneyin
        + Toplama ??ki de??eri x + y toplar
        - ????karma Bir de??eri di??er x - y'den ????kar??r
        * ??arpma ??ki de??eri x * y ile ??arpar
        / B??lme Bir de??eri di??erine b??ler x / y
        % Mod??l B??lmede kalan x % y'yi verir
        ++ Art???? Bir de??i??kenin de??erini 1 ++x art??r??r
        -- Azaltma Bir de??i??kenin de??erini 1 azalt??r --x

        ---Java Atama Operat??rleri
        De??i??kenlere de??er atamak i??in atama operat??rleri kullan??l??r.

        A??a????daki ??rnekte, x adl?? bir de??i??kene 10 de??erini atamak i??in atama operat??r??n?? (=) kullan??yoruz:

        ??rnek
        int x = 10;

        Toplama atama operat??r?? (+=), bir de??i??kene bir de??er ekler:

            Ornek
        int x = 10;
        x += 5;

        T??m atama operat??rlerinin listesi:

        Operat??r ??rne??i Deneyin
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

            Java Kar????la??t??rma Operat??rleri
        Kar????la??t??rma operat??rleri iki de??eri kar????la??t??rmak i??in kullan??l??r:

            Operat??r Ad?? ??rne??i Deneyin
        == x'e e??ittir == y
        != x'e e??it de??il != y
        > x > y'den b??y??k
        < x'ten k??????k < y
        >= x'ten b??y??k veya e??ittir >= y
        <= x'ten k??????k veya ona e??it <= y

            ---Java Mant??ksal Operat??rleri
        Mant??ksal operat??rler, de??i??kenler veya de??erler aras??ndaki mant?????? belirlemek i??in kullan??l??r:

            --Operat??r Ad?? A????klama ??rnek Deneyin
        && Mant??ksal ve her iki ifade de do??ruysa do??ru d??nd??r??r x < 5 && x < 10
        || Mant??ksal veya ??fadelerden biri do??ruysa do??ru d??nd??r??r x < 5 || x < 4
        ! Mant??ksal de??il Sonucu tersine ??evirir, sonu?? do??ruysa false d??nd??r??r !(x < 5 && x < 10)
     */
}
