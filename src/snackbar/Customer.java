package snackbar;

public class Customer {

  private static int maxId = 0;

  private int id;
  private String name;
  private double cash;

  public Customer(String name, double cash){
    this.name = name;
    this.cash = cash;
    this.id = maxId;
    maxId += 1;
  }

  public void addCash(double amount) {
    this.cash += amount;
  }

  public void spend(double amount) {
    this.cash -= amount;
  }

  public String getName () {
    return this.name;
  }

  public void setName(String name){
    this.name = name;
  }

  public double getCash (){
    return this.cash;
  }
}