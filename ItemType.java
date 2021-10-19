package Exceptionques;

public class ItemType {
private String name;
private String deposit;
private Double costPerDay;

 public ItemType(String name, String deposit, Double costPerDay) {
this.name = name;
this.deposit = deposit;
this.costPerDay = costPerDay;
}

 public String getName() {
return name;
}

 public void setName(String name) {
this.name = name;
}

 public Double getCostPerDay() {
return costPerDay;
}

 public void setCostPerDay(Double costPerDay) {
this.costPerDay = costPerDay;
}
public String getDeposit() {
return deposit;
}

 public void setDeposit(String deposit) {
this.deposit = deposit;
}
public String toString() {
String output = "";
//fill your code here
return output;
}

}
