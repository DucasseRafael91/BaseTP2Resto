package baseTP2Resto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class PlatDao implements Dao<Plat> {

    private static final String URL = "jdbc:mariadb://localhost:3322/resto";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "6jBUDOSBl4CSx28RRtc1";

    @Override
    public void create(Plat plat) {

    }

    @Override
    public void update(Plat plat) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Plat findById(int id) {
        // À implémenter plus tard
        return null;
    }

    @Override
    public ArrayList<Plat> findAll() {

        ArrayList<Plat> plats = new ArrayList<>();

        String sql = "SELECT * FROM t_plats";

        try (Connection connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                int idPlat = resultSet.getInt(1);
                String nomPlat = resultSet.getString(2);
                String brand = resultSet.getString(3);
                double price = resultSet.getDouble(4);

                plats.add(new Plat(nomPlat, null));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return plats;
    }

}
