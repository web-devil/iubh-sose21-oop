import java.util.Scanner;

public class ReceiptPrinter {
    private int taxRate;
    private int tipRate;
    private Scanner inputScanner;

    public ReceiptPrinter(int taxRate, int tipRate, Scanner scanner) {
        this.taxRate = taxRate;
        this.tipRate = tipRate;
        this.inputScanner = scanner;
    }

    public void runReceipt() {
        System.out.println("Was kostet das Essen?");
        float mealCost = this.inputScanner.nextFloat();
        System.out.println("=====");
        System.out.println("Subtotal: " + mealCost);
        System.out.println("Tax: " + this.calculateTax(mealCost));
        System.out.println("Tip: " + this.calculateTip(mealCost));
        System.out.println("-----");
        System.out.println("TOTAL: " + this.calculateTotal(mealCost));
        System.out.println();
    }

    private float calculateTax(float mealCost) {
        float tax = mealCost * this.taxRate / 100;
        return tax;
    }

    private float calculateTip(float mealCost) {
        return mealCost * this.tipRate / 100;
    }

    private float calculateTotal(float mealCost) {
        return mealCost + this.calculateTax(mealCost) + this.calculateTip(mealCost);
    }
}
