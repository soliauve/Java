public class Game369{

    //declare method that checks every iteration of the given range for numbers ending in 3,6,9.
    public static boolean IS_369(long n){
    
        boolean result = false; //initialize a boolean variable to false.

        if(n % 10 == 3 || n % 10 == 6 || n % 10 == 9){
            result = true;
        }
        else{
            long k = n / 10; //moves the decimal point one place to the left. Hence the last digit gets truncated and the digit to the left of the orginal number becomes the new last digit.
            if(k % 10 == 3 || k % 10 == 6 || k % 10 == 9){ //checks if the new last digit is either 3,6,9.
                result = true;
            }
            else{
                result = false;
            }
        }
        return result;
    }
    //create an instance of a method that checks whether the number is 3,6,9 so it claps.
    public static void GAME_369(long start, long end){
        for(long i = start; i <= end; i++){
            if(IS_369(i)){
                System.out.print("CLAP ");
            }
            else{
                System.out.print(i + " "); //othwerise it just outputs the number.
            }
        }
    }
    //declare main method
    public static void main(String args[]){
        GAME_369(45,55);
    }
}