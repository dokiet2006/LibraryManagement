package test;

import org.junit.jupiter.api.Test;
import service.AuthService;

public class AuthServiceTest {

    @Test
    void testLoginSuccess() {
        AuthService auth = new AuthService();

        boolean result = auth.login("anhDoMixi", "Khogadetem");
        if (!result) {
            throw new RuntimeException("Expect true but got false");
        }
    }

    @Test
    void testLoginFail() {
        AuthService auth = new AuthService();

        boolean result = auth.login("anhDoMixi", "nananana");
        if (result) {
            throw new RuntimeException("Expect false but got true");
        }
    }
}