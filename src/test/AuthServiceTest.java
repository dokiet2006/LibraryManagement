package test;

import org.junit.jupiter.api.Test;
import service.AuthService;

import static org.junit.jupiter.api.Assertions.*;

public class AuthServiceTest {

    @Test
    void testLoginSuccess() {
        AuthService auth = new AuthService();

        assertTrue(
                auth.login("anhDoMixi", "Khogadetem")
        );
    }

    @Test
    void testLoginFail() {
        AuthService auth = new AuthService();

        assertFalse(
                auth.login("anhDomixi", "nananana")
        );
    }
}