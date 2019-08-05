package snackbar;

public class Snack {

  private static int maxId = 0;

  private int id;
  private String name;
  private int quantity;
  private double cost;
  private int vendId;

  public Snack(String name, int quantity, double cost, int vendId) {
    this.name = name;
    this.quantity = quantity;
    this.cost = cost;
    this.vendId = vendId;
    this.id = maxId;
    maxId += 1;
  }

  public void setId (int id) {
    this.id = id;
  }

  public int getId () {
    return this.id;
  }

  public void setName (String name) {
    this.name = name;
  }

  public String getName () {
    return this.name;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public double getCost() {
    return this.cost;
  }

  public void setVendId (int id) {
    this.vendId = id;
  }

  public int getVendId () {
    return this.vendId;
  }

  public int getQuantity(){
    return this.quantity;
  }

  public void restock(int quanitity) {
    this.quantity += quantity;
  }

  public double purchase(int quantity) {
    this.quantity -= quantity;
    return calculateCost(quantity);
  }

  private double calculateCost(int quantity) {
    return this.cost * quantity;
  }

}