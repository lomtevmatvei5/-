import org.junit.jupiter.api.Test;
import ru.ac.uniyar.mf.lomtev.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    void addition(){
        String actual = Main.calculate(1,"1", "+", "1");
        assertEquals("2", actual);
    }

    @Test
    void multiplication(){
        String actual = Main.calculate(1,"1", "*", "1");
        assertEquals("1", actual);
    }

    @Test
    void minus(){
        String actual = Main.calculate(1,"2", "-", "1");
        assertEquals("1", actual);
    }

    @Test
    void div(){
        String actual = Main.calculate(1,"6", "/", "2");
        assertEquals("3", actual);
    }

    @Test
    void addition1(){
        String actual = Main.calculate(2,"1/2", "+", "1/2");
        assertEquals("1", actual);
    }

    @Test
    void multiplication1(){
        String actual = Main.calculate(2,"1/2", "*", "1/2");
        assertEquals("1/4", actual);
    }

    @Test
    void minus1(){
        String actual = Main.calculate(2,"1/2", "-", "1/2");
        assertEquals("0", actual);
    }

    @Test
    void div1(){
        String actual = Main.calculate(2,"1/2", "/", "1/2");
        assertEquals("1", actual);
    }




}