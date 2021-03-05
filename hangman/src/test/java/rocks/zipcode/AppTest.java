package rocks.zipcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void testApp() {
        assertEquals(1, 1);
    }

    @Test
    void testPlayerWon() {
        Message gameEndMessage = new Message();
        assertEquals("*** *** ***", gameEndMessage.playerWon());
        assertNotEquals("yesssss", gameEndMessage.playerWon());
    }

    @Test
    void testPlayerLost() {
        Message gameEndMessage = new Message();
        assertEquals(":-( :-( :-(", gameEndMessage.playerLost());
        assertNotEquals("*** *** ***", gameEndMessage.playerLost());
    }


}
