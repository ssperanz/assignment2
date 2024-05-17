////////////////////////////////////////////////////////////////////
// STEFANO SPERANZA 2075518
// ALBERTO MAGGION 2085370
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

import java.util.HashMap;

public class shareMap {

    public static HashMap<Character, String[]> convertitore = null;
    static {
        HashMap<Character, String[]> mappa = new HashMap<Character, String[]>();
        
        mappa.put('I', new String[] {
            "  _____ ",
            " |_   _|",
            "   | |  ",
            "   | |  ",
            "  _| |_ ",
            " |_____|"
        });
        mappa.put('V', new String[] {
            " __      __",
            " \\ \\    / /",
            "  \\ \\  / / ",
            "   \\ \\/ /  ",
            "    \\  /   ",
            "     \\/    "
        });
        mappa.put('X', new String[] {
            " __   __",
            " \\ \\ / /",
            "  \\ V / ",
            "   > <  ",
            "  / . \\ ",
            " /_/ \\_\\"
        });
        mappa.put('L', new String[] {
            "  _      ",
            " | |     ",
            " | |     ",
            " | |     ",
            " | |____ ",
            " |______|"
        });
        mappa.put('C', new String[] {
            "   _____ ",
            "  / ____|",
            " | |     ",
            " | |     ",
            " | |____ ",
            "  \\_____|"
        });
        mappa.put('D', new String[] {
            "  _____  ",
            " |  __ \\ ",
            " | |  | |",
            " | |  | |",
            " | |__| |",
            " |_____/ "
        });
        mappa.put('M', new String[] {
            "  __  __ ",
            " |  \\/  |",
            " | \\  / |",
            " | |\\/| |",
            " | |  | |",
            " |_|  |_|" 
        });
        convertitore = mappa;
    }
    
}