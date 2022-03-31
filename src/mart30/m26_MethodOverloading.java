        package mart30;

        public class m26_MethodOverloading {
            /*
            Method Overloading
        With method overloading, multiple methods can have the same name with different parameters:

        Example
        int myMethod(int x)
        float myMethod(float x)
        double myMethod(double x, double y)
        Consider the following example, which has two methods that add numbers of different type:

        Example
        static int plusMethodInt(int x, int y) {
          return x + y;
        }

        static double plusMethodDouble(double x, double y) {
          return x + y;
        }

        public static void main(String[] args) {
          int myNum1 = plusMethodInt(8, 5);
          double myNum2 = plusMethodDouble(4.3, 6.26);
          System.out.println("int: " + myNum1);
          System.out.println("double: " + myNum2);
        }

        Instead of defining two methods that should do the same thing, it is better to overload one.

        In the example below, we overload the plusMethod method to work for both int and double:

        Example
        static int plusMethod(int x, int y) {
          return x + y;
        }

        static double plusMethod(double x, double y) {
          return x + y;
        }

        public static void main(String[] args) {
          int myNum1 = plusMethod(8, 5);
          double myNum2 = plusMethod(4.3, 6.26);
          System.out.println("int: " + myNum1);
          System.out.println("double: " + myNum2);
        }




        Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.






        Yöntem Aşırı Yükleme
        Yöntem aşırı yüklemesi ile birden çok yöntem, farklı parametrelerle aynı ada sahip olabilir:

        Örnek vermek
        int benimYöntem(int x)
        float myMethod(float x)
        double myMethod(çift x, çift y)
        Farklı türde sayılar ekleyen iki yöntemi olan aşağıdaki örneği göz önünde bulundurun:

        Örnek vermek
        statik int plusMethodInt(int x, int y) {
          x + y'yi döndür;
        }

        static double plusMethodDouble(double x, double y) {
          x + y'yi döndür;
        }

        public static void main(String[] args) {
          int myNum1 = plusMethodInt(8, 5);
          double myNum2 = plusMethodDouble(4.3, 6.26);
          System.out.println("int: " + myNum1);
          System.out.println("çift: " + myNum2);
        }

        Aynı şeyi yapması gereken iki yöntem tanımlamak yerine, birini aşırı yüklemek daha iyidir.

        Aşağıdaki örnekte, plusMethod yöntemini hem int hem de double için çalışacak şekilde aşırı yükledik:

        Örnek vermek
        statik int artıYöntem(int x, int y) {
          x + y'yi döndür;
        }

        statik çift artıYöntem(çift x, çift y) {
          x + y'yi döndür;
        }

        public static void main(String[] args) {
          int myNum1 = plusMethod(8, 5);
          double myNum2 = plusMethod(4.3, 6.26);
          System.out.println("int: " + myNum1);
          System.out.println("çift: " + myNum2);
        }




        Not: Parametrelerin sayısı ve/veya türü farklı olduğu sürece, birden çok yöntem aynı ada sahip olabilir.




             */
        }
