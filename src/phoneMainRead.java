import java.io.*;
import java.util.Scanner;
/*앞서 프로그래밍한 phone.txt 파일을 읽어 화면에 출력 하시오.*/
public class phoneMainRead {
    public static void main(String[] args) {

        try(BufferedReader rd = new BufferedReader(new FileReader("phone.txt"))){
            String str;
            while (true){
                str = rd.readLine();
                if(str == null)
                    break;
                System.out.println(str);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
