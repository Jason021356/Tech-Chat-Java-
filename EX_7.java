import java.util.Scanner;

public class EX_7 {
    public static void main(String[] args) {
        System.out.println("歡迎進入正方形周長計算程式!");
        System.out.println("請輸入正方形的邊長(資料型別為Double):");
        double squaresidelength;
        Scanner sc = new Scanner(System.in);
        squaresidelength = sc.nextDouble();
        sc.close();
        squaresidelength *= 4;
        System.out.println("此正方形周長為:"+squaresidelength);
    }
}
