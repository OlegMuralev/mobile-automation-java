package data;

public enum UserEmails {
    SOMETHING("something@new.com"),
    TEST("test@domain.com");

    private final String email;
    UserEmails(String email) { this.email = email; }
    public String getEmail() { return email; }
}