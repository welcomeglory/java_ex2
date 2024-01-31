import java.io.*;
public class systeminiMain2 {
    public static void main(String[] args) {
        try (BufferedReader rd = new BufferedReader(new FileReader("system.ini"))) {
            String str;
            int count =1;
            while (true) {
                str = rd.readLine();
                if (str == null)
                    break;
                System.out.println(count++ +"."+str.toUpperCase());

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
