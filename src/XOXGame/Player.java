package XOXGame;

public class Player {
    private String firstName;
    private String lastName;
    private String sign;

    public Player(String firstName, String lastName, String sign){
        this.firstName = firstName;
        this.lastName = lastName;
        this.sign = sign.toUpperCase();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSign() {
        return sign.toUpperCase();
    }

    public void setSign(String sign) {
        this.sign = sign.toUpperCase();
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
