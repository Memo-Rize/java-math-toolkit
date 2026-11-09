package mathtoolkit;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class StatsTest {

    @Test
    public void testMean() throws MathToolkitException {
        List<Double> values = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(2.5, Stats.mean(values), 0.001);
    }

    @Test
    public void testMedianOdd() throws MathToolkitException {
        List<Double> values = Arrays.asList(3.0, 1.0, 2.0);
        assertEquals(2.0, Stats.median(values), 0.001);
    }

    @Test
    public void testMedianEven() throws MathToolkitException {
        List<Double> values = Arrays.asList(1.0, 2.0, 3.0, 4.0);
        assertEquals(2.5, Stats.median(values), 0.001);
    }

    @Test
    public void testMax() throws MathToolkitException {
        List<Double> values = Arrays.asList(3.0, 9.0, 5.0);
        assertEquals(9.0, Stats.max(values), 0.001);
    }

    @Test
    public void testMin() throws MathToolkitException {
        List<Double> values = Arrays.asList(3.0, 9.0, 5.0);
        assertEquals(3.0, Stats.min(values), 0.001);
    }

    @Test
    public void testEmptyThrows() {
        List<Double> empty = Arrays.asList();
        assertThrows(MathToolkitException.class, new org.junit.jupiter.api.function.Executable() {
            public void execute() throws MathToolkitException {
                Stats.mean(empty);
            }
        });
    }

    @Test
    public void testRangeContains() {
        Range<Integer> r = new Range<>(1, 10);
        assertTrue(r.contains(5));
        assertFalse(r.contains(11));
    }

    @Test
    public void testRangeInvalidThrows() {
        assertThrows(IllegalArgumentException.class, new org.junit.jupiter.api.function.Executable() {
            public void execute() {
                new Range<>(10, 1);
            }
        });
    }
}