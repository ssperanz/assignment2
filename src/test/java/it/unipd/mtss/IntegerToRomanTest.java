package it.unipd.mtss;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class IntegerToRomanTest {
    private String input, expOutput;

    public IntegerToRomanTest(String input, String expOutput) {
        this.input = input;
        this.expOutput = expOutput;
    }

    @Parameters
    public static Collection<String[]> testconditions() {
        String[][] expOutput = {
                {"1", "I"},
                {"4","IV"},
                {"6","VI"},
                {"9","IX"},
                {"14","XIV"},
                {"20","XX"},
                {"44","XLIV"},
                {"60","LX"},
                {"90","XC"},
                {"140","CXL"},
                {"200","CC"},
                {"444","CDXLIV"},
                {"550","DL"},
                {"600","DC"},
                {"900","CM"},
                {"973","CMLXXIII"},
                {"1000","M"}
        };

        return Arrays.asList(expOutput);
    }
    @Test
    public void testExpectedconversion() {
        assertEquals(expOutput, IntegerToRoman.convert(Integer.parseInt(input)));
    }
}