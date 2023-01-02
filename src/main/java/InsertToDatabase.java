import org.jsoup.select.Evaluator;

import java.sql.*;

public class InsertToDatabase {
    private Post post;

    public InsertToDatabase(Post post) {
        this.post = post;
    }

    public void insertPostToDatabase()  {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/vacancy?autoReconnect=true&useSSL=false",
                    "root", "root");
            String insertQuery = "INSERT INTO vacancy(company_title, date, salary, skills, title, link) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(insertQuery);
            statement.setString(1, post.getVacancyCardCompanyTitle());
            statement.setString(2, post.getVacancyCardDate());
            statement.setString(3, post.getVacancyCardSalary());
            statement.setString(4, post.getVacancyCardSkills());
            statement.setString(5, post.getVacancyCardTitle());
            statement.setString(6, post.getVacancyCardLink());

            statement.executeUpdate();
            connection.close();
        } catch (Exception e) {

        }
    }
}
