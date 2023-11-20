import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxServiceTest {

    @Test
    public void shouldFindMax() {
        MaxService service = new MaxService();
        int a = 5;
        int b = 6;
        int expected = b;
        int actual = service.max(a, b);
        assertEquals(expected, actual);
    }
}
