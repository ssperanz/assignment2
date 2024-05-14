////////////////////////////////////////////////////////////////////
// STEFANO SPERANZA 2075518
// ALBERTO MAGGION 2085370
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber){
        
        String toPrint = "";

        for(int i=0; i<6; i++){
            for(char c: romanNumber.toCharArray()){
                toPrint += shareMap.convertitore.get(c)[i];
            }
            toPrint += "\n";
        }
        return toPrint;
    }
}