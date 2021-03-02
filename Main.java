import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String name;
    String surname;
    int age;
    boolean woman;

//Tworzenie tablicy o nazwie "nameArray"
    String[] nameArray = new String[8];

    System.out.println("Hello world!");

    for (int i = 0; i < 8; i++) {
      System.out.println("Podaj imię i nazwisko osoby nr " + (i + 1) + ": ");
      name = scanner.nextLine();
      
      //zapisuje wartość do tablicy
      nameArray[i] = name;
    }

//wyświetlanie tablicy
    for (int i = 0; i < 8; i++) {
      System.out.println(nameArray[i]);
    }
    
//Zadanie: zebrac wiek i wyświetlić. scanner.nextInt();


  }
  
}