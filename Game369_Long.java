public class Game369_Long {
    
    public static void GAME_369(long start, long end){ //method printing whether to "CLAP" or not according to the result of the boolean variable IS_369().
        for(long i = start; i <= end; i++){
            if(IS_369(i)){
                System.out.print("CLAP");
            }
            else{
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static boolean IS_369(long n){ //method checking whether the iteration has 3,6,9 (in which case it'll return TRUE)
        boolean result = false;
        long t = n;
        do{
            if(t % 10 == 3 || t % 10 == 6 || t % 10 == 9){
                result = true; break;
            }
            t = t/10;
        }while(t > 10);
        return result;
    }
    
    public static void main(String args[]){ //main method calling GAME_369
        GAME_369(45875400, 45875410);
    }
    
}

//legend: -> = calls
//main function -> GAME_369 -> IS_369
//Questions: The order of the declaration of a method doesn't matter? Generally, no. (source: chatgpt)


