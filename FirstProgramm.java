 public class FirstProgramm {
     public static void main(String args[]) {
         calc(21, 3, "+");
         calc(21, 3, "-");
         calc(21, 3, "/");
         calc(21, 3, "*");
         calc(21, 3, "%");
     }
/** Вариант №1
     static void calc(double x, double y, String operation) {
         double result;
       if(operation == "+"){
            result = x + y;
           System.out.println("Результат операции " + operation + " равен: " + result);
        }else if (operation == "-"){
            result = x - y;
            System.out.println("Результат операции " + operation + " равен: " + result);
        }else if (operation == "/"){
            result = x / y;
            System.out.println("Результат операции " + operation + " равен: " + result);
        }else if (operation == "*"){
            result = x * y;
            System.out.println("Результат операции " + operation + " равен: " + result);
        }else {
            System.out.println("Извините, такой операции нет");
        }
**/
/** Вариант №2 через switch
     static void calc(double x, double y, String operation) {
            double result;
           switch (operation) {
             case "+":
                 System.out.println("Результат операции " + operation + " равен: " + (x + y));
                 break;
             case "-":
                 System.out.println("Результат операции " + operation + " равен: " + (x - y));
                 break;
             case "/":
                 System.out.println("Результат операции " + operation + " равен: " + (x / y));
                 break;
             case "*":
                 System.out.println("Результат операции " + operation + " равен: " + (x * y));
                 break;
             default:
                 System.out.println("Извините, такой операции нет");
         }
**/
//Вариант с 1 Sout
static void calc(double x, double y, String operation) {
    double result = 0.0;

    switch (operation) {
        case "+":
            result = x + y;
            break;
        case "-":
            result = x - y;
            break;
        case "*":
            result = x * y;
            break;
        case "/":
            result = x / y;
            break;
        default:
            System.out.println("Извините, такой операции нет");
    }
    if(result != 0.0)
        System.out.println("Результат операции: " + result);
 }
}
