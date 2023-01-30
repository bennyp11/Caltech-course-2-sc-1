import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Batch> batches = new ArrayList<>();

    while (true) {
      System.out.println("Enter batch time (or type 'q' to quit): ");
      String batchTime = sc.nextLine();
      if (batchTime.equals("q")) {
        break;
      }

      Batch batch = new Batch(batchTime);
      batches.add(batch);

      while (true) {
        System.out.println("Enter participant's first name (or type 'q' to go back): ");
        String firstName = sc.nextLine();
        if (firstName.equals("q")) {
          break;
        }

        System.out.println("Enter participant's last name: ");
        String lastName = sc.nextLine();

        System.out.println("Enter participant's email: ");
        String email = sc.nextLine();

        System.out.println("Enter participant's number of classes: ");
        int classes = sc.nextInt();
        sc.nextLine();

        Participant participant = new Participant(firstName, lastName, email, classes);
        batch.addParticipant(participant);
      }
    }

    sc.close();

    for (Batch b : batches) {
      System.out.println("Batch time: " + b.getTime());
      System.out.println("Participants: ");
      for (Participant p : b.getParticipants()) {
        System.out.println("\t" + p.getFirstName() + " " + p.getLastName() + " (" + p.getEmail() + "), classes: " + p.getClasses());
      }
    }
  }
}