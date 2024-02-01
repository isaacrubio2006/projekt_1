
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("Välkommen till mitt spel");
        int val = getVal();

        while (true) {
            System.out.println("val: " + val);
            if (val == 1 ) {
                //TODO: ANROPA KOD
                System.out.println("Nu har du startat spelet!!!");
                startPlay();
                val = getVal();
                //anropa method
              

            }

            if(val == 2){
                System.out.println("Ditt high score " );

            }

            else if (val == 3){
                break;
            }
            else {
                System.out.println("Du valde fel");
                val = getVal();
            }


        }


    }
    public static void startPlay(){
        
        int playerlife = 100;
        int computerlife = 100;
        int min = 0;
        int max = 50;
        while (playerlife > 0 && computerlife > 0)
        {
            
            
            Scanner tangentbord = new Scanner(System.in);
         System.out.println("1. uppercut\n 2. batman kick\n 3. jab\n");
         int slag = tangentbord.nextInt();
         int power = min + (int)(Math.random() * ((max - min) + 1));
        computerlife= computerlife-power;
        System.out.println("player gjorde så här mycket skada " + power);
        power = min + (int)(Math.random() * ((max - min) + 1));
        playerlife= playerlife -power;
        System.out.println("Så hur mycket skada gjorde datorn " + power);
        System.out.println("Så här mycket liv har motståndaren kvar " + computerlife);
        System.out.println("Så här mycket liv har du kvar " + playerlife);
        }

    }
    public static int getVal()
    {
        Scanner tangentbord = new Scanner(System.in);
        System.out.println("1. starta spel\n 2. Highscore\n 3. Avslutaspel\n" );
        int val = tangentbord.nextInt();
        return  val;

    }

}