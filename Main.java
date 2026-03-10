import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ResultDAO dao = new ResultDAO();

        int choice;

        do {

            System.out.println("\n1 Add Student");
            System.out.println("2 Add Marks");
            System.out.println("3 Generate Result");
            System.out.println("4 Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    dao.addStudent(id, name);

                    break;

                case 2:

                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();

                    System.out.print("Subject 1: ");
                    int s1 = sc.nextInt();

                    System.out.print("Subject 2: ");
                    int s2 = sc.nextInt();

                    System.out.print("Subject 3: ");
                    int s3 = sc.nextInt();

                    dao.addMarks(sid, s1, s2, s3);

                    break;

                case 3:

                    dao.generateResult();

                    break;
            }

        } while (choice != 4);
    }
}