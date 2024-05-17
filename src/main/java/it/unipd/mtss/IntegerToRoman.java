////////////////////////////////////////////////////////////////////
// STEFANO SPERANZA 2075518
// ALBERTO MAGGION 2085370
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class IntegerToRoman{
    private static String resto500(int number){
        String ret = "";
        if(number >= 900){
            ret+="CM";
        }
        else{
            ret+="D"+"C".repeat((number-500)/100);
        }
        return ret;
    }
    private static String resto100(int number){
        String ret = "";
        if(number >= 400){
            ret+="CD";
        }
        else{
            ret+="C".repeat(number/100);
        }
        return ret;
    }
    private static String resto50(int number){
        String ret = "";
        if(number >= 90){
            ret+="XC";
        }
        else{
            ret+="L"+"X".repeat((number-50)/10);
        }
        return ret;
    }
    private static String resto10(int number){
        String ret = "";
        if(number >= 40){
            ret+="XL";
        }
        else{
            ret+="X".repeat(number/10);
        }
        return ret;
    }
    private static String resto5(int number){
        String ret = "";
        if(number == 9){
            ret+="IX";
        }
        else{
            ret+="V"+"I".repeat(number - 5);
        }
        return ret;
    }
    private static String resto(int number){
        String ret = "";
        if(number == 4){
            ret+="IV";
        }
        else{
            ret+="I".repeat(number);
        }
        return ret;
    }
    public static String convert(int number){
        StringBuilder ret = new StringBuilder();
        while (number > 0) {
            if(number == 1000){
                ret.append("M");
                number -= 1000;
            }
            else if(number >= 500){
                ret.append(resto500(number));
                number -= number/100*100;
            }
            else if(number >= 100){
                ret.append(resto100(number));
                number -= number/100*100;
            }
            else if(number >= 50){
                ret.append(resto50(number));
                number -= number/10*10;
            }
            else if(number >=10){
                ret.append(resto10(number));
                number -= number/10*10;
            }
            else if(number >=5){
                ret.append(resto5(number));
                number -= number;
            }
            else{
                ret.append(resto(number));
                number-=number;
            }
        }
        return ret.toString();
    }
}
