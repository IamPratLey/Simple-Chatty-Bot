import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        
        //The first number must be between the second and the third one or between the third and the second one.
        
       // boolean x1 = (n1 >= n2) || (n3 >= n2);
       // boolean x2 = (n2>=n3) && (n2<=n3);
       // boolean betweenNumber = (n1 >=n2 =<n3) || (n2>=n3) && (n2<=n3);
       
       boolean x = (n1 >= n2 && n1 >= n3) || (n1 >= n3 && n1 >= n2);
        System.out.println(x);
    }
}
