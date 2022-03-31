package mart30;

public class m12_TypeCasting {
    /*
     ---  Java Type Casting
       Type casting is when you assign a value of one primitive data type to another type.

      In Java, there are two types of casting:

     ----Widening Casting (automatically) -
     converting a smaller type to a larger type size
       byte -> short -> char -> int -> long -> float -> double

    -----Narrowing Casting (manually) -
    converting a larger type to a smaller size type
      double -> float -> long -> int -> char -> short -> byte

      ----Widening Casting
       Widening casting is done automatically when passing a smaller size type to a larger size type:

      Example
      public class Main {
      public static void main(String[] args) {
      int myInt = 9;
      double myDouble = myInt; // Automatic casting: int to double

    System.out.println(myInt);      // Outputs 9
    System.out.println(myDouble);   // Outputs 9.0

     ----Narrowing Casting
      Narrowing casting must be done manually by placing the type in parentheses in front of the value:

      Example
      public class Main {
     public static void main(String[] args) {
     double myDouble = 9.78d;
      int myInt = (int) myDouble; // Manual casting: double to int

      System.out.println(myDouble);   // Outputs 9.78
      System.out.println(myInt);      // Outputs 9




          ----Java Type Casting
        Bir ilkel veri tipinin değerini başka bir tipe atadığınız zamandır.

      Java'da iki tür casting vardır:

      -----Genişletme casting (otomatik olarak) -
      daha küçük bir türü daha büyük bir yazı boyutuna dönüştürmek
      bayt -> kısa -> char -> int -> uzun -> kayan nokta -> çift

     -------Daraltma casting (manuel) -
      daha büyük bir türü daha küçük boyutlu bir türe dönüştürme
      double -> float -> long -> int -> char -> short -> byte

      ----Genişletme casting
      Genişletme dökümü, daha küçük boyutlu bir tür daha büyük boyutlu bir
       türe geçerken otomatik olarak yapılır:

      Örnek
      public class Main {
      public static void main(String[] args) {
      int myInt = 9;
      double myDouble = myInt; // Otomatik döküm: int to double

      System.out.println(myInt); // Çıktılar 9
      System.out.println(myDouble); // Çıktılar 9.0

    ----- Daraltma Döküm
     Daraltma dökümü, değerin önüne parantez içinde tip yerleştirilerek manuel olarak yapılmalıdır:

      Örnek
     public class Main {
     public static void main(String[] args) {
     double  myDouble = 9.78d;
      int myInt = (int) myDouble; // Manuel casting: int'ye çift

     System.out.println(myDouble); // Çıktılar 9.78
    System.out.println(myInt); // Çıktılar 9

     */
}
