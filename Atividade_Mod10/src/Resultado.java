/**
 * @author Danfreitz
 */

public class Resultado {

        public static void main(String args[]) {
            Notas();
            Resultado();
        }

        public static void Resultado() {
            System.out.println("**** Resultado ****");
            int num1 = 8;
            int num2 = 8;
            int num3 = 8;
            int num4 = 8;

            int num5 = (8 + 8 + 8 + 8)/4;
            int result = num5;

            if (result > 1 && result < 4) {
                System.out.println("Reprovado");
            }
            else if (result > 5 && result < 7) {
                System.out.println("Recuperacao");
            }
            else if (result > 7 && result < 10) {
                System.out.println("Aprovado");
            }
        }

        private static void Notas() {
            System.out.println("**** Notas ****");

            int num1 = 8;
            int num2 = 8;
            int num3 = 8;
            int num4 = 8;

            System.out.println(num1);
            System.out.println(num2);
            System.out.println(num3);
            System.out.println(num4);}
    }

