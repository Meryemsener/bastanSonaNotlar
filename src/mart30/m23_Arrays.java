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
        Diziler, her bir değer için ayrı değişkenler bildirmek yerine birden çok değeri tek bir değişkende depolamak için kullanılır.

        Bir diziyi bildirmek için, değişken türünü köşeli parantezlerle tanımlayın:

        String[] arabalar;
        Şimdi bir dizi dizi tutan bir değişken tanımladık. Buna değer eklemek için bir dizi değişmezi kullanabiliriz - değerleri virgülle ayrılmış bir listeye küme parantezleri içine yerleştirin:

        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        Bir tamsayı dizisi oluşturmak için şunu yazabilirsiniz:

        int[] myNum = {10, 20, 30, 40};
        Bir Dizinin Öğelerine Erişin
        Dizin öğesine, dizin numarasına başvurarak erişirsiniz.

        Bu ifade, arabalardaki ilk öğenin değerine erişir:

        Örnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(arabalar[0]);
        // Volvo çıktıları

        Not: Dizi dizinleri 0 ile başlar: [0] ilk öğedir. [1] ikinci öğedir, vb.

        Dizi Öğesini Değiştir
        Belirli bir öğenin değerini değiştirmek için dizin numarasına bakın:

        Örnek vermek
        arabalar[0] = "Opel";
        Örnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        arabalar[0] = "Opel";
        System.out.println(arabalar[0]);
        // Artık Volvo yerine Opel çıkıyor

        Dizi Uzunluğu
        Bir dizinin kaç elemanı olduğunu bulmak için length özelliğini kullanın:

        Örnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(arabalar.uzunluk);
        // Çıkışlar 4
        Bir Dizide Döngü
        for döngüsüyle dizi öğeleri arasında döngü yapabilir ve döngünün kaç kez çalışması gerektiğini belirtmek için length özelliğini kullanabilirsiniz.

        Aşağıdaki örnek, arabalar dizisindeki tüm öğelerin çıktısını verir:

        Örnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < arabalar.uzunluk; i++) {
          System.out.println(arabalar[i]);
        }

        For-Each ile Bir Dizide Döngü
        Ayrıca, yalnızca dizilerdeki öğeler arasında dolaşmak için kullanılan bir "her biri için" döngüsü vardır:

        Sözdizimi
        for (tür değişkeni: dizi adı) {
          ...
        }
        Aşağıdaki örnek, bir "for-each" döngüsü kullanarak arabalar dizisindeki tüm öğelerin çıktısını verir:

        Örnek vermek
        String[] arabalar = {"Volvo", "BMW", "Ford", "Mazda"};
        for (dize i: arabalar) {
          System.out.println(i);
        }

        Yukarıdaki örnek şu şekilde okunabilir: arabalardaki her String öğesi (i - dizinde olduğu gibi) için, i değerini yazdırın.

        for döngüsü ve for-each döngüsünü karşılaştırırsanız, for-each yönteminin yazılmasının daha kolay olduğunu, bir sayaç gerektirmediğini (uzunluk özelliğini kullanarak) ve daha okunaklı olduğunu göreceksiniz.
        Çok Boyutlu Diziler
        Çok boyutlu bir dizi, bir dizi dizisidir.

        İki boyutlu bir dizi oluşturmak için her diziyi kendi küme parantezleri içine ekleyin:

        Örnek vermek
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers artık öğeleri olarak iki diziye sahip bir dizidir.

        myNumbers dizisinin öğelerine erişmek için iki dizin belirtin: biri dizi için, biri de o dizinin içindeki öğe için. Bu örnek, myNumbers'ın ikinci dizisindeki (1) üçüncü öğeye (2) erişir:

        Örnek vermek
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        int x = myNumbers[1][2];
        System.out.println(x); // Çıktılar 7

        İki boyutlu bir dizinin öğelerini elde etmek için başka bir for döngüsü içinde bir for döngüsü de kullanabiliriz (yine de iki dizini işaret etmemiz gerekiyor):

        Örnek vermek
        genel sınıf Ana {
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
