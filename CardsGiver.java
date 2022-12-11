import javax.security.auth.login.AccountExpiredException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class CardsGiver {
    public static void main(String[] args) {
        giveMeSomeCards();

    }

    //First level: Дан массив, содержащий все возможные номиналы игральных карт: 6, 7, …, Король, Туз.
    //Дан массив, содержащий все возможные масти игральных карт: "Пик", "Треф", "Бубен", "Червей".
    //Пользователь вводит количество карт, которое ему нужно выдать.
    //Программа случайным образом выбирает из массивов значения номиналов и мастей и выводит требуемое количество карт на экран.

    static void giveMeSomeCards(){
        String[] cardsNumber = {"6","7","8","9","10","Валет","Дама","Король","Туз"};
        String[] cardsType = {"Пик", "Треф", "Бубен", "Червей"};

        Random random = new Random();

        Scanner in = new Scanner(System.in);
        System.out.println("Сколлько карт вы хотите взять");
        int cardsAmount = in.nextInt();

        String cardsArtikel = "";

        for (int i = 1; i <= cardsAmount; i++) {
            cardsArtikel = cardsNumber[random.nextInt(0,cardsNumber.length)] + " " + cardsType[random.nextInt(0,cardsType.length)];
            System.out.println("Номер карты " + i + ": " + cardsArtikel);

        }


    }

   /* static void arrayGiver() {
        Random random = new Random();


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your array lenght:");
        int arrayLenght = scanner.nextInt();

        int[] hausNumbers = new int[arrayLenght];
        for (int i = 0; i < arrayLenght; i++) {
            int mix2 = random.nextInt(0,100);
            System.out.println("hausNumbers [" + i + "]=" + mix2);
            hausNumbers[i] = mix2;


        }
        System.out.println(Arrays.toString(hausNumbers));

        int max = hausNumbers[0];
        for (int i = 0; i < hausNumbers.length ; i++) {
            if (hausNumbers[i] > max) max = hausNumbers[i];
        }

        System.out.println(max);

    }
*/


}
