package it.unipd.mtss;

import static org.junit.Assert.*;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import java.util.Collection;
import java.util.Arrays;

@RunWith(Parameterized.class)
public class RomanPrinterTest {
	private String input, expectedOutput;

	public RomanPrinterTest(String input, String output){
		this.input = input;
		this.expectedOutput = output;
	}

	@Parameters
	public static Collection<String[]> testConditions(){
		String[][] expectedOutput = {
			{"1",toAsciiArt("I")},
			{"4",toAsciiArt("IV")},
			{"5",toAsciiArt("V")},
			{"8",toAsciiArt("VIII")},
			{"9",toAsciiArt("IX")},
			{"10",toAsciiArt("X")},
			{"19",toAsciiArt("XIX")},
			{"44",toAsciiArt("XLIV")},
			{"50",toAsciiArt("L")},
			{"89",toAsciiArt("LXXXIX")},
			{"100",toAsciiArt("C")},
			{"132",toAsciiArt("CXXXII")},
			{"278",toAsciiArt("CCLXXVIII")},
			{"500",toAsciiArt("D")},
			{"888",toAsciiArt("DCCCLXXXVIII")},
			{"949",toAsciiArt("CMXLIX")},
			{"1000",toAsciiArt("M")},
		};
		return Arrays.asList(expectedOutput);
	}

	@Test
	public void testPrintAsciiArtInput() {
		assertEquals(expectedOutput, RomanPrinter.print(Integer.parseInt(input)));
	}	

	private static String toAsciiArt(String toConvert) {
		String toPrint = "";

        for(int i = 0; i<6; i++){
            for(char c: toConvert.toCharArray()){
                toPrint += shareMap.convertitore.get(c)[i];
                
            }
            toPrint += "\n";
        }
        return toPrint;
	}

}

