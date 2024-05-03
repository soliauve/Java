public class ClapGame {

    //declare main method
    public static void main(String args[]){
        for(int i = 45; i <= 55; i++){ //numbers 45 to 55 됨.

            if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9){ //if no. ends in 3,6,9 print clap
                System.out.print("CLAP(1)");
            } 
            else{ 
                int k = i / 10; //divide number by ten
                if (k % 10 == 3 || k % 10 == 6 || k % 10 == 9){ //이해해 못함.
                    System.out.print("CLAP(2)");
                }
                else{
                    System.out.print(i + " ");
                }
            }
        System.out.println(); //Prints new line for every iteration of the for loop.
        }
    }
}
