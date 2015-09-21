
public class romanNumerals{
    static int position = 0;
    static int regularNumber;
    static int valOfNum;
    static int valOfNextNum;
    static String str;

    public romanNumerals(){
    }

    static int converter(String str){
        while (position < str.length()){
            valOfNum = translate(str.charAt(position));
            if (position != str.length() - 1){
             valOfNextNum = translate(str.charAt(position + 1));
            } else {
                regularNumber += translate(str.charAt(position));
                break;
            }
            if (valOfNum < valOfNextNum){
                regularNumber += (valOfNextNum - valOfNum);
                position += 2;
            } else {
                regularNumber += valOfNum;
                position += 1;
            }
        }
        return regularNumber;
    }
    
    static void variableReset(){
        position = 0;
        regularNumber = 0;
        valOfNum = 0;
        valOfNextNum = 0;
        str = "";
    }
    static int translate(char str){
        switch(str){
            case 'I': return 1;
            case 'V': return 5;
  

          case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
        }
        return 0;
    }
    
    public static void main(String[] args){
        romanNumerals rN = new romanNumerals();
        System.out.println("Result of Roman Numeral Conversion is " + rN.converter("I"));
        rN.variableReset();
        System.out.println("Result of Roman Numeral Conversion is " + rN.converter("IV"));
        rN.variableReset();
        System.out.println("Result of Roman Numeral Conversion is " + rN.converter("LXIII"));
        

        rN.variableReset();
        System.out.println("Result of Roman Numeral Conversion is " + rN.converter("LXIV"));
        rN.variableReset();
        

        System.out.println("Result of Roman Numeral Conversion is " + rN.converter("DCCXLV"));
        rN.variableReset();
        System.out.println("Result of Roman 

        Numeral Conversion is " + rN.converter("MCMLXXIII"));
        rN.variableReset();
        System.out.println("Result of Roman Numeral Conversion is " + 

        rN.converter("MMMDXCIII"));
        rN.variableReset();
    }
}
