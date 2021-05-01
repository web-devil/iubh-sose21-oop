import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int taxRate = 7;
        int tipRate = 15;

        Scanner scannerObject = new Scanner(System.in);
        ReceiptPrinter printerObject = new ReceiptPrinter(taxRate, tipRate, scannerObject);
        
        Boolean run = true;
        while (run) {
            printerObject.runReceipt();

            System.out.println("Möchtest du beenden? [1 = abort / 2 = continue]");
            int abort = scannerObject.nextInt();
            if (abort < 2) {
                run = false;
            }
        }
    }
}
