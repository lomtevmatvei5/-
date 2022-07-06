import org.junit.jupiter.api.Test;
import ru.ac.uniyar.mf.lomtev.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void addition(){
        String actual = Main.calculate("1", "+", "1");
        assertEquals("2", actual);
    }

    @Test
    void multiplication(){
        String actual = Main.calculate("1", "*", "1");
        assertEquals("1", actual);
    }

    @Test
    void minus(){
        String actual = Main.calculate("2", "-", "1");
        assertEquals("1", actual);
    }




}