import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @BeforeAll
    void unaSolaVez(){

    }

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {

    }

// TDD:  test driven development

    @Test
    void prueba1() {
        Item i = new Item(1112,"asdf", 3, 4.5);
        assertEquals(13.5, i.getSubtotal());
    }

    @Test
    void prueba2() {
        Item i = new Item(1112,"asdf", -1, 24);
        assertEquals(0, i.getSubtotal());
    }



}