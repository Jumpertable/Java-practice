import java.util.Scanner;
class star {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int i,j,k,n,m;
System.out.print("Enter n: ");
n = scan.nextInt();
for(i=1; i<=n; i+=2)
{ for(j=1; j<=(n-i); j++)
{ System.out.print(" ");
}
for(k=1; k<=i; k++)
{ System.out.print("*");
}
for(m=1; m<=i; m++)
{ System.out.print("*");
}
for(j=1; j<=2*(n-i); j++)
{ System.out.print(" ");
}
for(k=1; k<=i; k++)
{
    System.out.print("*");
}
for(m=1; m<=i; m++)
{ System.out.print("*");
}
System.out.println();
}
for(i=1; i<=n; i++)
{ for(j=1; j<=2*(i-1); j++)
{ System.out.print(" ");
}
for(k=1; k<=4*(n-i+1); k++)
{
    System.out.print("*");
}
System.out.println();
}
scan.close();
}
}