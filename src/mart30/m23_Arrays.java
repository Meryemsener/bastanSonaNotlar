        package mart30;

        public class m23_Arrays {
            /*
            Java Arrays
        Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.

        To declare an array, define the variable type with square brackets:

        String[] cars;
        We have now declared a variable that holds an array of strings. To insert values to it, we can use an array literal - place the values in a comma-separated list, inside curly braces:

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        To create an array of integers, you could write:

        int[] myNum = {10, 20, 30, 40};
        Access the Elements of an Array
        You access an array element by referring to the index number.

        This statement accesses the value of the first element in cars:

        Example
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);
        // Outputs Volvo

        Note: Array indexes start with 0: [0] is the first element. [1] is the second element, etc.

        Change an Array Element
        To change the value of a specific element, refer to the index number:

        Example
        cars[0] = "Opel";
        Example
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
        // Now outputs Opel instead of Volvo

        Array Length
        To find out how many elements an array has, use the length property:

        Example
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);
        // Outputs 4

        Loop Through an Array
        You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.

        The following example outputs all elements in the cars array:

        Example
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
          System.out.println(cars[i]);
        }

        Loop Through an Array with For-Each
        There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:

        Syntax
        for (type variable : arrayname) {
          ...
        }
        The following example outputs all elements in the cars array, using a "for-each" loop:

        Example
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
          System.out.println(i);
        }

        The example above can be read like this: for each String element (called i - as in index) in cars, print out the value of i.

        If you compare the for loop and for-each loop, you will see that the for-each method is easier to write, it does not require a counter (using the length property), and it is more readable.

        Multidimensional Arrays
        A multidimensional array is an array of arrays.

        To create a two-dimensional array, add each array within its own set of curly braces:

        Example
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers is now an array with two arrays as its elements.

        To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array. This example accesses the third element (2) in the second array (1) of myNumbers:

        Example
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Outputs 7

        We can also use a for loop inside another for loop to get the elements of a two-dimensional array (we still have to point to the two indexes):

        Example
        public class Main {
          public static void main(String[] args) {
            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            for (int i = 0; i < myNumbers.length; ++i) {
              for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
              }
            }
          }
        }









        Java Dizileri
        Diziler, her bir de??er i??in ayr?? de??i??kenler bildirmek yerine birden ??ok de??eri tek bir de??i??kende depolamak i??in kullan??l??r.

        Bir diziyi bildirmek i??in, de??i??ken t??r??n?? k????eli parantezlerle tan??mlay??n:

        String[] arabalar;
        ??imdi bir dizi dizi tutan bir de??i??ken tan??mlad??k. Buna de??er eklemek i??in bir dizi de??i??mezi kullanabiliriz - de??erleri virg??lle ayr??lm???? bir listeye k??me parantezleri i??ine yerle??tirin:

        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        Bir tamsay?? dizisi olu??turmak i??in ??unu yazabilirsiniz:

        int[] myNum = {10, 20, 30, 40};
        Bir Dizinin ????elerine Eri??in
        Dizin ????esine, dizin numaras??na ba??vurarak eri??irsiniz.

        Bu ifade, arabalardaki ilk ????enin de??erine eri??ir:

        ??rnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(arabalar[0]);
        // Volvo ????kt??lar??

        Not: Dizi dizinleri 0 ile ba??lar: [0] ilk ????edir. [1] ikinci ????edir, vb.

        Dizi ????esini De??i??tir
        Belirli bir ????enin de??erini de??i??tirmek i??in dizin numaras??na bak??n:

        ??rnek vermek
        arabalar[0] = "Opel";
        ??rnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        arabalar[0] = "Opel";
        System.out.println(arabalar[0]);
        // Art??k Volvo yerine Opel ????k??yor

        Dizi Uzunlu??u
        Bir dizinin ka?? eleman?? oldu??unu bulmak i??in length ??zelli??ini kullan??n:

        ??rnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(arabalar.uzunluk);
        // ????k????lar 4
        Bir Dizide D??ng??
        for d??ng??s??yle dizi ????eleri aras??nda d??ng?? yapabilir ve d??ng??n??n ka?? kez ??al????mas?? gerekti??ini belirtmek i??in length ??zelli??ini kullanabilirsiniz.

        A??a????daki ??rnek, arabalar dizisindeki t??m ????elerin ????kt??s??n?? verir:

        ??rnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < arabalar.uzunluk; i++) {
          System.out.println(arabalar[i]);
        }

        For-Each ile Bir Dizide D??ng??
        Ayr??ca, yaln??zca dizilerdeki ????eler aras??nda dola??mak i??in kullan??lan bir "her biri i??in" d??ng??s?? vard??r:

        S??zdizimi
        for (t??r de??i??keni: dizi ad??) {
          ...
        }
        A??a????daki ??rnek, bir "for-each" d??ng??s?? kullanarak arabalar dizisindeki t??m ????elerin ????kt??s??n?? verir:

        ??rnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        for (dize i: arabalar) {
          System.out.println(i);
        }

        Yukar??daki ??rnek ??u ??ekilde okunabilir: arabalardaki her String ????esi (i - dizinde oldu??u gibi) i??in, i de??erini yazd??r??n.

        for d??ng??s?? ve for-each d??ng??s??n?? kar????la??t??r??rsan??z, for-each y??nteminin yaz??lmas??n??n daha kolay oldu??unu, bir saya?? gerektirmedi??ini (uzunluk ??zelli??ini kullanarak) ve daha okunakl?? oldu??unu g??receksiniz.
        ??ok Boyutlu Diziler
        ??ok boyutlu bir dizi, bir dizi dizisidir.

        ??ki boyutlu bir dizi olu??turmak i??in her diziyi kendi k??me parantezleri i??ine ekleyin:

        ??rnek vermek
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers art??k ????eleri olarak iki diziye sahip bir dizidir.

        myNumbers dizisinin ????elerine eri??mek i??in iki dizin belirtin: biri dizi i??in, biri de o dizinin i??indeki ????e i??in. Bu ??rnek, myNumbers'??n ikinci dizisindeki (1) ??????nc?? ????eye (2) eri??ir:

        ??rnek vermek
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // ????kt??lar 7

        ??ki boyutlu bir dizinin ????elerini elde etmek i??in ba??ka bir for d??ng??s?? i??inde bir for d??ng??s?? de kullanabiliriz (yine de iki dizini i??aret etmemiz gerekiyor):

        ??rnek vermek
        genel s??n??f Ana {
          public static void main(String[] args) {
            int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
            for (int i = 0; i < myNumbers.length; ++i) {
              for(int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
              }
            }
          }
        }


             */
        }
