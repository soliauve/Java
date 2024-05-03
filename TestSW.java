public class TestSW {
    
    //declare method called SwitchTest.
    public static void SwitchTest(int n){
        String str_V = "";
        switch(n){
            case 0: str_V = "ZERO "; break; //답
            case 1: str_V = "ONE ";
            case 2: str_V = "TWO "; break; //답
            case 3: str_V = "THREE "; break;
            case 4: str_V = "FOUR ";
            case 5: str_V = "FIVE "; break;
            case 6: str_V = "SIX "; break; //답
            case 7: str_V = "SEVEN ";
            case 8: str_V = "EIGHT "; break;
            case 9: str_V = "NINE ";
            default: str_V = "OTHER ";
        }
        System.out.println(str_V);
    }
    public static void main(String args[]){
        SwitchTest(2); SwitchTest(6); SwitchTest(0);
    }
}
