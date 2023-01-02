import com.mysql.fabric.jdbc.FabricMySQLDriver;
import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {     //       https://career.habr.com/vacancies/java_developer


        System.out.print("Введите ссылку: ");
        Scanner scanner = new Scanner(System.in);
        Scrapper scrapper = new Scrapper(scanner.nextLine());
        scrapper.searchVacancy();

    }
}
