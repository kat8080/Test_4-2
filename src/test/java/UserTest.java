import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    @DisplayName("When login and email to user return correct")
    public void correctLoginEmailTest() {
        User user = new User("Kat", "Kat123@mail.ru");
        String actualResult = user.getLogin() + " " + user.getEmail();
        Assertions.assertEquals("Kat Kat123@mail.ru", actualResult);
    }

    @Test
    @DisplayName("When email is correct")
    public void correctEmailTest() {
        User user = new User("Kat", "Kat123@mail.ru");
        String actualResult = user.getLogin() + " " + user.getEmail();
        Assertions.assertEquals("Kat Kat123@mail.ru", actualResult);
    }

    @Test
    @DisplayName("When not equals login and email")
    public void notEqualsLoginEmailTest() {
        User user = new User("Kat", "Kat123@mail.ru");
        String actualResult = user.getLogin() + " " + user.getEmail();
        Assertions.assertEquals("Kat Kat123@mail.ru", actualResult);
    }

    @Test
    @DisplayName("When the same username and email")
    public void sameEmailTest() {
        String login = "Kat";
        String email = "Kat123@mail.ru";
        Assertions.assertThrows(RuntimeException.class,()-> new User(login,email));
    }
}
