package it.unipd.mtss;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ITRNotNullTest {
    @Test
    public void testNotNullTest() {
        assertNotNull(IntegerToRoman.convert(1));
    }
}
