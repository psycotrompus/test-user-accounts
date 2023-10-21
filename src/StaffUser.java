public class StaffUser extends UserAccount {
  
  public StaffUser(String username, String password) {
    super(username, password);
  }

  @Override
  public boolean login(String inputUsername, String inputPassword) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'login'");
  }
}