import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Bill rent = new Bill("Rent", 1500.00, "09-15-2026");
    rent.displayBill();

    Bill phoneBill = new Bill("Phone", 60.00, "09-23-2026");
    phoneBill.displayBill();

    Bill carInsurance = new Bill("Car Insurance", 257.12, "09-08-2026");
    carInsurance.displayBill();

    Bill creditCard = new Bill("Amex", 65.00, "09-17-2026");
    creditCard.displayBill();

    Bill carNote = new Bill("Car Note", 315.47, "09-01-2026");
    carNote.displayBill();
}
