import java.util.Scanner;
import java.util.*;

public class Animal {

  // public == available to anyone else
  // static == shared by every object inheriting from this class
  // final == CONST, cannot be changed
  public static final double FAVNUMBER = 1.6180;

  // private can be accessed by other methods in the class
  private String name;
  private int weight;
  private boolean hasOwner = false;
  private byte age;
  private long uniqueID;
  private char favoriteChar;
  private double speed;
  private float height;

  // protected can be access by code in package
  protected static int numberOfAnimals = 0;

  static Scanner userInput = new Scanner(System.in);

  public Animal() {
    numberOfAnimals++;

    int sumOfNumbers = 5 + 1;
    System.out.println("5 + 1 = " + sumOfNumbers);
  }

  public static void main(String[] args) {
    Animal theAnimal = new Animal();
  }

}
