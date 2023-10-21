import java.util.Date;

public abstract class UserAccount {

  private String username;

  private String password;

  private Date lastLogin;

  private boolean loggedIn;

  public UserAccount(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getUsername() {
    return this.username;
  }

  public String getPassword() {
    return this.password;
  }

  public Date getLastLogin() {
    return this.lastLogin;
  }

  public boolean isLoggedIn() {
    return this.loggedIn;
  }

  public abstract boolean login(String inputUsername, String inputPassword);

  public void logout() {
    this.loggedIn = false;
  }
}