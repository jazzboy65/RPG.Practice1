package generics;

public class AuthUserData {
    private String token;
    private String phoneNumber;

    public AuthUserData(String token, String phoneNumber) {
        this.token = token;
        this.phoneNumber = phoneNumber;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
