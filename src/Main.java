import java.util.List;
import java.util.Scanner;

import static java.util.Arrays.asList;

public class Main {

  private static final List<UserAccount> USERS = asList(
      new AdminUser("admin1", "P@ssw0rd"),
      new AdminUser("admin2", "Password123"),
      new StaffUser("S001", "p@ssw0rd.100S"),
      new StaffUser("S002", "Password200")
  );

  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    Main main = new Main();
    try {
      main.begin();
    }
    catch (Exception ex) {
      input.close();
    }
  }

  public void begin() {
    String userInput;
    String username;
    String password;
    do {
      System.out.print("Type 'I' to login or type 'O' to logout, then press 'Enter' key: ");
      userInput = input.next("[IOio]+");
      if (userInput.equalsIgnoreCase("I")) {
        System.out.print("Type your username then press 'Enter' key: ");
        username = input.next();
        System.out.print("Type your password then press 'Enter' key: ");
        password = input.next();
        UserAccount userAccount = lookupUser(username);
        // TODO Perform the rest of the operations.
      }
    }
    while (userInput != null);
  }

  public UserAccount lookupUser(String username) {
    for (int index = 0; index < USERS.size(); index++) {
      UserAccount ua = USERS.get(index);
      if (ua instanceof AdminUser && ua.getUsername().equalsIgnoreCase(username)) {
        return ua;
      }
      else if (ua instanceof StaffUser && ua.getUsername().equals(username)) {
        return ua;
      }
    }
    return null;
  }
}
