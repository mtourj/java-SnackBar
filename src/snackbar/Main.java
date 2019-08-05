package snackbar;

public class Main {

  public static void main(String[] args){
    Customer jane = new Customer("Jane", 45.25);
    Customer bob = new Customer("Bob", 33.14);

    VendingMachine foodMachine = new VendingMachine("Food");
    VendingMachine drinkMachine = new VendingMachine("Drink");
    VendingMachine officeMachine = new VendingMachine("Office");

    Snack chips = new Snack("Chips", 36, 1.75, foodMachine.getId());
    Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, foodMachine.getId());
    Snack pretzel = new Snack("Pretzel", 30, 2.00, foodMachine.getId());

    Snack soda = new Snack("Soda", 24, 2.50, drinkMachine.getId());
    Snack water = new Snack("Water", 20, 2.75, drinkMachine.getId());

    // Customer 1 buys 3 of snack 4. Print Customer 1 Cash on hand. Print quantity of snack 4.
    jane.spend(soda.purchase(3));
    
    System.out.println(jane.getName() + " has $" + jane.getCash() + " remaining.");
    System.out.println("There are " + soda.getQuantity() + " " + soda.getName() + "(s) left.");

    // Customer 1 buys 1 of snack 3. Print Customer 1 Cash on hand. Print quantity of snack 3.
    jane.spend(pretzel.purchase(1));

    System.out.println(jane.getName() + " has $" + jane.getCash() + " remaining.");
    System.out.println("There are " + pretzel.getQuantity() + " " + pretzel.getName() + "(s) left.");

    // Customer 2 buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.
    bob.spend(soda.purchase(2));

    System.out.println(bob.getName() + " has $" + bob.getCash() + " remaining.");
    System.out.println("There are " + soda.getQuantity() + " " + soda.getName() + "(s) left.");

    // Customer 1 finds $10. Print Customer 1 Cash on Hand.
    jane.addCash(10);

    System.out.println(jane.getName() + " has $" + jane.getCash() + " remaining.");

    // Customer 1 buys 1 of snack 2. Print Customer 1 Cash on Hand. Print quantity of snack 2.
    jane.spend(chocolateBar.purchase(1));

    System.out.println(jane.getName() + " has $" + jane.getCash() + " remaining.");
    System.out.println("There are " + chocolateBar.getQuantity() + " " + chocolateBar.getName() + "(s) left.");

    // Add 12 more items to snack 3. Print quantity of snack 3.
    pretzel.restock(12);
    // Customer 2 buys 3 of snack 3. Print Customer 2 Cash on hand. Print quantity of snack 3.
    bob.spend(pretzel.purchase(3));

    System.out.println(bob.getName() + " has $" + bob.getCash() + " remaining.");
    System.out.println("There are " + pretzel.getQuantity() + " " + pretzel.getName() + "(s) left.");
  }

}