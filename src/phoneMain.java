import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*1. Scanner로 입력받은 이름과 전화번호를
한 줄에 한 사람씩 c:\Temp\phone.txt파일에 저장하라.
\“그만”을 입력하면 프로그램을 종료한다.*/
public class phoneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("phone.txt"))){
            System.out.println("이름과 전화번호를 입력하시오.");
            while(true) {
                String info = sc.nextLine();
                if(info.equals("그만"))
                    break;
                bw.write(info, 0, info.length());
                bw.newLine();
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
