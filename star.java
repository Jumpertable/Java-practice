import java.util.Scanner;
class star {
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
int i,j,k,n,m,l;
System.out.print("Enter n: ");
n = scan.nextInt();

for(i=1; i<=n; i++)
{
    for (l = 0; l <= n; l++) {
        if (i == 1 || i == n || l == 1 || l == n)
            System.out.print("");
    }
    System.out.println();
    for(i=1; i<=n; i++)
{
    for (l = 0; l <= n; l++) {
        if (i == 1 || i == n || l == 1 || l == n)
            System.out.print( "  -- ");
        else
            System.out.print(" ");
    }
}
    System.out.println();

        
    for(i=1; i<=n; i++)
{
    for (m = 0; m <= n; m++) {
        if (i == 1 || i == n || m == 1 || m == n)
            System.out.print( " *-- ");
        else
            System.out.print(" ");
    }
}
    System.out.println();



for(i=1; i<=n; i++)
{
    for (m = 0; m <= n; m++) {
        if (i == 1 || i == n || m == 1 || m == n)
            System.out.print( " ----");
        else
            System.out.print(" ");
    }
}
    System.out.println();

for(i=1; i<=n; i++)
{
    for (j = 0; j <= n; j++) {
        if (i == 1 || i == n || j == 1 || j == n)
            System.out.print("   0 ");
        else
            System.out.print(" ");
    }
}

System.out.println();


for(k=1; k<=n; k++)
{
    for (l = 0; l <= n; l++) {
        if (k == 1 || k == n || l == 1 || l == n)
            System.out.print("  -|-");
        else
            System.out.print(" ");

    }
}
System.out.println();


for(k=1; k<=n; k++)
{
    for (l = 0;l <= n; l++) {
        if (k == 1 || k == n || l == 1 ||l == n)
            System.out.print(" _/\\_");
        else
            System.out.print(" ");

    }
}


System.out.println();
}
scan.close();
}
}