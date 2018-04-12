

import java.util.Scanner;

public class ExceptionTriangle {
    static boolean isTriangle(){
        try {
            Scanner sc = new Scanner(System.in);
            int side1 = sc.nextInt();
            int side2 = sc.nextInt();
            int side3 = sc.nextInt();
            if (side1<=0 || side2<=0 || side3<=0){
                throw new Exception();
            }
            if (side1+side2<=side3 || side1+side3<=side2 || side2+side3<side1){
                throw new Exception();
            }
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isTriangle());
    }
}
