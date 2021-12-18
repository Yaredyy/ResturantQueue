import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        PriorityLine line = new PriorityLine();

        int choice = 0;
        int position=500;

        while (choice != -1) {

            String name;
            int priority;

            System.out.println("Options: ");
            System.out.println("1: Add a customer.");
            System.out.println("2: Add a customer with a priority.");
            System.out.println("3: Available priority spots.");
            System.out.println("4: Next patient in line.");
            System.out.println("5: Removing a customer.");
            System.out.println("6: Patients in line.");

            System.out.print("Please enter your choice (-1 to exit): ");
            choice = Integer.parseInt(input.nextLine());

            switch (choice) {


                case 1:
                    System.out.print("Please enter the name of the patient: ");
                    name = input.nextLine();
                    line.add(position,name);
                    position++;

                    break;


                case 2:
                    System.out.print("Please enter the name of the patient: ");
                    name = input.nextLine();
                    System.out.print("Please enter the priority of the patient: ");
                    priority = Integer.parseInt(input.nextLine());
                    line.add(priority, name);

                    break;


                case 3:

                    System.out.println("Available priority spots are: " + line.availablePriorities());

                    break;


                case 4:

                    System.out.println("The next patient in line is: " + line.extractMin());

                    break;


                case 5:

                    System.out.print("Please enter the name of the patient: ");
                    name = input.nextLine();
                    line.remove(name);

                    break;


                case 6:

                    System.out.println("The patients in line are: " + line.toString());

                    break;

            }

        }

    }


}
