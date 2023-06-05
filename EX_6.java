import java.util.Scanner;

public class EX_6 {
    public static void main(String[] args){
        int squarearea;
        Scanner sc = new Scanner(System.in);
        System.out.println("歡迎進入正方型計算程式!");
        System.out.println("請輸入一個正方形邊長(資料型別為Int):");
        squarearea = sc.nextInt();
        sc.close();
        squarearea *= squarearea;
        System.out.println("此正方形面積是:" + squarearea);
    }
}
