import java.net.SocketOption;
import java.util.Scanner;

public class hw{

    public static void main(String[] args){
        int inputscore;
        Scanner hw = new Scanner(System.in);
        inputscore = hw.nextInt();//輸入成績
        char result = score(inputscore);//呼叫static method
        System.out.println(result);//回傳階級
    }

    static char score(int number){

        char result;
        int level = number/10;
        if (number < 0 || number > 100){//超過0~100提示
            System.out.println("input 0~100");
            System.exit(0);//強制結束程式
        }

        switch(level){

            case 10:
                result = 'A';//100分
                break;

            case 9:
                result = 'A';//90以上間距
                break;

            case 8:
                result = 'B';//80以上間距
                break;

            case 7:
                result = 'C';//70以上間距
                break;

            case 6:
                result = 'D';//60以上間距
                break;

            default:
                result = 'F';//0~59間距
                break;
        }

        return result;//回傳階級
    }
}