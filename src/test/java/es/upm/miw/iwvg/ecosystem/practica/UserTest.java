package es.upm.miw.iwvg.ecosystem.practica;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "sergio", "cabrero");
    }

    @Test
    void testUserIntStringString(){
        assertEquals(1, user.getNumber());
        assertEquals("Sergio", user.getName());
        assertEquals("Cabrero", user.getFamilyName());
    }

    @Test
    void testFullName(){
        assertEquals("Sergio Cabrero", user.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("S.", user.initials());
    }

}
