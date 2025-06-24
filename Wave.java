public class Wave {
    public static void main(String[] args) {
        int i, j;
        int row = 5;
        int col = 1;

        //star on top
        for (i = 1; i <= row - 4; i++) {
            //space
            for (int h = 1; h <= row; h++) {
                System.out.print("   ");
            }
            //star
            for (j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        //Flag
        for (i = 1; i <= row; i++) {
            //big space
            for (int h = 1; h <= row; h++) {
                System.out.print("   ");
            }
            //pole
            for (j = 1; j <= col; j++) {
                System.out.print("|");
            }
            //the flag
            if (i < row) {
                for (int o = 1; o <= i; o++) {
                    System.out.print("\\");
                }
            }
            //person
            switch (i) {
                //hat
                case 1:
                    System.out.print("     --");
                    break;
                case 2:
                    System.out.print("   *--");
                    break;
                case 3:
                    System.out.print("  ----");
                    break;
                //face
                case 4:
                    System.out.print("   0");
                    break;
                //body
                case 5:
                    System.out.print("      -|-");
                    break;
            }         
            System.out.println();
        }


        int row1 = 3;
        int col1 = 18;
        
        //body
        for (i = 1; i <= row1; i++) {
            //space
            for (int n = -3; n <= i; n++) {
                System.out.print(" ");
            }
            //\\\\\\\\
            for (int n = -6; n <= i; n++) {
                System.out.print("*");
            }
            //\\|
            for (int g = -2; g <= row1 - i; g++) {
                System.out.print("*");
            }
            //\|
            for (int k = -1; k <= row1 - i; k++) {
                System.out.print("*");
            }
            // ////////
            for (int n = -5; n <= row1 - i; n++) {
                System.out.print("*");
            }
            //little bow and anchor
            switch (i) {
                case 1:
                    System.out.print("====+");
                    break;
                case 2:
                    System.out.print("===|");
                    break;
                case 3:
                    System.out.print("   (o)");
                    break;
            }
            
            System.out.println();
        }

        //sea
for (i = 1; i <= row1; i++) {
            for (j = 1; j <= col1; j++) {
                System.out.print("/~");
            }
            System.out.println();
        }
    }
}
