import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        System.out.println("1-Compress without specific task\n2-Compress with specific task\n3-Decompress");
        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        if (option == 1) {
            //Compression without specific size.
            System.out.println("Enter the data: ");
            String input = in.next();
            Compress obj = new Compress();
            ArrayList<String> tags = obj.compression(input);
            for (String i : tags) {
                System.out.println(i);
            }
        }
        else if (option == 2) {
            //Compression with specific size.
            System.out.println("Enter the data: ");
            String input = in.next();
            System.out.println("Enter the specific size: ");
            int size = in.nextInt();
            System.out.println("Enter the Look ahead size: ");
            int look = in.nextInt();
            ModifiedCompress obj = new ModifiedCompress();
            ArrayList<String> tags = obj.modifiedCompression(input,size,look);
            for (String i : tags) {
                System.out.println(i);
            }
        }
        else if (option == 3) {
            //Decompression
            System.out.println("Enter the number of tags: ");
            int num = in.nextInt();
            String ans = "";
            for (int i = 0; i < num; i++) {
                System.out.println("Enter the pos: ");
                int position  = in.nextInt();
                System.out.println("Enter the len: ");
                int length = in.nextInt();
                System.out.println("Enter the symbol: ");
                String symbol = in.next();
                int sz = ans.length()-position;
                ans = ans + ans.substring(sz,sz+length) + symbol;
            }
            System.out.println(ans);
        }
    }
}
