package ExpressTest;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static Gson gson = new Gson();
    public static Scanner in = new Scanner(System.in);
    public static Client client = new Client(
            null,
            null,
             null
    );
    public static void main(String[] args) throws IOException{
        Input();
        gson.toJson(client, new FileWriter("cvg.json"));
    }
    public static void Input(){
        String sex1;
        System.out.print("Фамилия*: ");
        client.setSurname(in.nextLine());
        System.out.print("Имя*: ");
        client.setName(in.nextLine());
        System.out.println("Пол: ");
        sex1 = in.nextLine();
        if (sex1.equals("М")) {
            client.setSex(false);
        } else if (sex1.equals("Ж")) {
            client.setSex(true);
        }
    }
}
