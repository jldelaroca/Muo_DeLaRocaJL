package ex05_muo_delarocajl;

import java.util.*;

public class Store {
  private final String name;
  private double earnings;
  private final ArrayList<Item> itemList;
  private static final ArrayList<Store> storeList = new ArrayList();

  public Store(String name){
    // Initialize name to parameter and earnings to zero
    this.name = name;
    // Initialize itemList as a new ArrayList
    itemList = new ArrayList();
    // add 'this' store to storeList
    storeList.add(this);
  }

  public String getName(){
    return name;
  }
  public double getEarnings(){
    return earnings;
  }
  public void sellItem(int index){
    // check if index is within the size of the itemList (if not, print statement that there are only x items in the store)
    if(index+1<=itemList.size()) {
        // get Item at index from itemList and add its cost to earnings
        this.earnings += itemList.get(index).getCost();
        // print statement indicating the sale
        System.out.printf("%s has been sold for %.2f\n",itemList.get(index).getName(),itemList.get(index).getCost());
    } else {
        System.out.println("There are only " +itemList.size() + " items in the store\n");
    }
    
  }
  public void sellItem(String name){
    // check if Item with given name is in the itemList (you will need to loop over itemList) (if not, print statement that the store doesn't sell it)
    boolean nameExists = false;
    Item selItem = null;
    for(Item i : itemList) {
        if (i.getName().equals(name)) {
            nameExists = true;
            selItem = i;
            break;
        }
    }
    if(nameExists) {
        // get Item from itemList and add its cost to earnings
        this.earnings += selItem.getCost();
        // print statement indicating the sale
        System.out.printf("%s has been sold for %.2f\n",selItem.getName(),selItem.getCost());
    } else {
        System.out.print("The store does not sell any item named " + name + "\n");
    }
    
  }
  public void sellItem(Item i){
    // check if Item i exists in the store (there is a method that can help with this) (if not, print statement that the store doesn't sell it)
    if(itemList.contains(i)) {
        // get Item i from itemList and add its cost to earnings
        this.earnings += i.getCost();
        // print statement indicating the sale
        System.out.printf("%s has been sold for %.2f\n",i.getName(),i.getCost());
    } else {
        System.out.print("The store does not sell " + i.getName() + "\n");
    }
  }
  public void addItem(Item i){
    // add Item i to store's itemList
    itemList.add(i);
  }
  public void filterType(String type){
    // loop over itemList and print all items with the specified type
    for(Item i : itemList) {
        if(i.getType().equals(type)) {
            System.out.print(i.getName() + " ");
        }
        
    }
    System.out.print("\n");
  }
  public void filterCheap(double maxCost){
    for(Item i : itemList) {
        if(i.getCost() <= maxCost) {
            System.out.print(i.getName() + " ");
        }
        
    }
    System.out.print("\n");
  }
  public void filterExpensive(double minCost){
    // loop over itemList and print all items with a cost higher than or equal to the specified value
    for(Item i : itemList) {
        if(i.getCost() >= minCost) {
            System.out.print(i.getName() + " ");
        }
        
    }
    System.out.print("\n");
  }
  public static void printStats(){
    // loop over storeList and print the name and the earnings'Store.java'
    for (Store i : storeList) {
        System.out.println(i.getName() + " earned a total of " + i.getEarnings());
    }
  }
}
