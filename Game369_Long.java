public class Game369_Long {
    public static void GAME_369(long start, long end){
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

    public static boolean IS_369(long n){
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
    
    public static void main(String args[]){
        GAME_369(45875400, 45875410);
    }
    
}


