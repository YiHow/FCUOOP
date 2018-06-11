package fcu.iecs.oop.password;

public class PasswordEncorder {
  /**
  * Change the password.
  * @param password the input string    
  * @return changed password
  */
  public String encode(String password) {
    password = password.replace('a', '4');
    password = password.replace('A', '4');
    password = password.replace('e', '3');
    password = password.replace('E', '3');
    password = password.replace('i', '1');
    password = password.replace('I', '1');
    password = password.replace('o', '0');
    password = password.replace('O', '0');
    password = password.replace('t', '7');
    password = password.replace('T', '7');

    return password;
  }
}
