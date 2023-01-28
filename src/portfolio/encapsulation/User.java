package portfolio.encapsulation;

public class User {
    // Private fields
    private String userName;
    private String password;

    //Parameterzied constructor to create a new users
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void login(String userName, String password) {
        //Check if the username and password match
        if (this.userName.toLowerCase().equals(userName.toLowerCase()) && this.password.equals(password)) {
            // .toLowrcase converts all the characters to lowercase & .equals checks if two strings match

            System.out.println("Access Granted for the username: "+this.userName +" and password: "+this.password);
        }
        else System.out.println("Invalid Credentials!"); //Else invalid credentials
    }
}
class Main {

    public static void main(String[] args) {
        User kodeeshwari = new User("Kodeeshwari","12345"); //Creates a new user and stores the password and username

        kodeeshwari.login("Kodeeshwari","12345"); //Grants access because credentials are valid

        kodeeshwari.login("Kodeeshwari", "3456"); //Does not grant access because the credentials are invalid

        //kodeeshwari.password = "3456"; //Fields of User class cannot be accessed now

    }

}
