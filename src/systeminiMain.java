import java.io.*;

public class systeminiMain {
    public static void main(String[] args) {
        String low = "ssdfggjnlsdknflksdfm";
        String low2 = "woeiruoeiruo";

        try(BufferedWriter bw = new BufferedWriter(new FileWriter("system.ini"))){
           bw.write(low, 0, low.length());
           bw.newLine();
           bw.write(low2, 0, low2.length());

        }
        catch(IOException e){
            e.printStackTrace();
        }
        try(BufferedReader rd = new BufferedReader(new FileReader("system.ini"))){
            String str;
            while (true){
                str = rd.readLine();
                if(str == null)
                    break;
                System.out.println(str.toUpperCase());
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }

    }
}
