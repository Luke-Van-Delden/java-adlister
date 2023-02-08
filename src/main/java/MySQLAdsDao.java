import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        }
        catch (SQLException e) {
            throw new RuntimeException("Error connecting to database.", e);
        }


    }


    @Override
    public List<Ad> all() {
        String selectAll = "SELECT * FROM ads";

        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectAll);

            List<Ad> ads = new ArrayList<>();

            while (rs.next()){
                ads.add(
                        new Ad(
                                rs.getInt("id"),
                                rs.getInt("user_id"),
                                rs.getString("title"),
                                rs.getString("description")
                        ));
            }
            return ads;
        }
        catch (SQLException e) {
            throw new RuntimeException("Error receiving all errors.",e);
        }
    }

    @Override
    public Long insert(Ad ad) {
        String insert = "INSERT INTO ads (user_id, title, description) VALUES (" + ad.getUserId() +", '" + ad.getTitle() + "', '" + ad.getDescription() + "')";


        try {
            Config config = new Config();
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );

            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insert, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stmt.getGeneratedKeys();
            if (rs.next()){
                System.out.println("Successfully inserted at id: " + rs.getLong(1));
            }
            return rs.getLong(1);
        }
        catch (SQLException e) {
            throw new RuntimeException("Error receiving all errors.",e);
        }
    }
}
