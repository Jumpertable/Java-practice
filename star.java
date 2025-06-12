import java.util.Scanner;
class star {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int i,j,n;
System.out.print("Enter n: ");
n = scan.nextInt();
for(i=1; i<=n; i++){
for(j=1; j<=n; j++){
if(i==1 || i==n || j==1 || j==n)
System.out.print("*");
else
System.out.print(" ");

}
System.out.println();
}
scan.close();
}
}