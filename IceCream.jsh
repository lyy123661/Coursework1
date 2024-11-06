import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
String studentId = "32803933";
int vanillaPrice = Integer.parseInt(studentId.substring(6, 8));
int chocolatePrice = Integer.parseInt(studentId.substring(4, 6));
int strawberryPrice = Integer.parseInt(studentId.substring(2, 4));
int conePrice = 100;
System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");
String flavour = scanner.nextLine();
int pricePerScoop = 0;
if (flavour.equals("v")) {
    pricePerScoop = vanillaPrice;
} else if (flavour.equals("c")) {
    pricePerScoop = chocolatePrice;
} else if (flavour.equals("s")) {
    pricePerScoop = strawberryPrice;
} else {
    System.out.println("We don't have that flavour.");
}
System.out.print("How many scoops would you like? ");
int numberOfScoops = scanner.nextInt();
if (numberOfScoops < 1) {
    System.out.println("We don't sell just a cone.");
} else if (numberOfScoops > 3) {
    System.out.println("That's too many scoops to fit in a cone.");
} else {
    int totalCostInPence = conePrice + pricePerScoop * numberOfScoops;
    int pounds = totalCostInPence / 100;
    int pence = totalCostInPence % 100;
    System.out.printf("That will be %d.%02d please.\n", pounds, pence);
}