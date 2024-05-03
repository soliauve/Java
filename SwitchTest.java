public class SwitchTest{

    //declate method that takes an integer for input
    public static void SW_Test(int n){
        switch(n){
            case 1: System.out.print("ONE ");
            case 2: System.out.print("TWO ");
            case 3: System.out.print("THREE "); break;
            case 4: System.out.print("FOUR ");
            case 5: System.out.print("FIVE "); break;
            case 6: System.out.print("SIX ");
            case 7: System.out.print("SEVEN ");
            case 8: System.out.print("EIGHT "); break;
            case 9: System.out.print("NINE ");
            //tried removing the default case and it worked just well. Of course, other did not print though.
            default: System.out.print("OTHER ");
        }
    }
    //main method
    public static void main(String args[]){
        SW_Test(7); SW_Test(5); SW_Test(0);
    }
}