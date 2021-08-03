// CS210 Summer 2021 MidtermExam Question 10 correction
// Mariia Iureva
// determineTriangle determines whether a triangle with sides s1, s2, s3
// is equilateral, isosceles or scalene


public class determineTriangle {
    public static void main(String[] args) {
        System.out.println(printTriangleType(5, 7, 7));
        System.out.println(printTriangleType(1, 1, 7));
        System.out.println(printTriangleType(5, 7, 8));
        System.out.println(printTriangleType(7, 7, 7));
        System.out.println(printTriangleType(1, 2, 18));
    }
    
    public static String printTriangleType(int s1, int s2, int s3){
        //check if triangle
        String notATriangle = "Not a triangle";
        String scalene = "scalene";
        String equilateral = "equilateral";
        String isosceles = "isosceles";
        if ((s1>s2+s3)||(s2>s1+s3)||(s3>s1+s2)){
            return  notATriangle;
        }
        //check is equilateral, isosceles or scalene
        if ((s1==s2)&&(s2==s3)){
            return equilateral;
        } else if ((s1==s2)||(s2==s3)||(s3==s1)){
            return isosceles;
        } else {
            return scalene;
        }
    }
    
}
