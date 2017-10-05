import java.util.Scanner;

public class SomeClassGrass {
    Exception e;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int readIn = 0,readIn2 = 0,readIn3 = 0;

            try{
                System.out.println("\nType a whole number: ");
                readIn = scanner.nextInt();
                System.out.println("\nNow do it again: ");
                readIn2 = scanner.nextInt();
                System.out.println("\nOne more time: ");
                readIn3 = scanner.nextInt();
            } catch (Exception whoops){
                exceptionOutsies(whoops);
            } finally{
                System.out.println("\nYou made it!");
            }
        }


    private static void exceptionOutsies(Exception lol){
        String err = lol.toString();
        System.out.println("\nHey look, an error: " + err + ".");
    }

}
