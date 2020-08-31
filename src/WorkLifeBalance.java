import java.util.Scanner;

public class WorkLifeBalance {

    public static void main(String[] args) {

        System.out.println("Whats the time? (0-23h)");

        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();

        if (time == 12){
            System.out.println("Mahlzeit!");
        }else if (time >= 8 && time <= 16){
            System.out.println("Hacklzeit!");
        }else {
            System.out.println("Freizeit!");
        }

    }

}

