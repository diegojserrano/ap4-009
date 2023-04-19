import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Paths;
import java.sql.*;

public class Principal {

    public static void main(String[] args) throws SQLException, IOException {

        Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost/Super009", "root", "root");
        Statement st = conn.createStatement();

        ResultSet rs = st.executeQuery("select * from Items");


        Ticket t = new Ticket();

        while(rs.next()) { // Una vuelta por cada fila del conjunto retornado
            long cod = rs.getLong("codigo");
            String nom = rs.getString("nombre");
            double cant = rs.getDouble("cantidad");
            double pu = rs.getDouble("precio");

            Item nuevo = new Item(cod, nom, cant, pu);
            t.agregarItem(nuevo);
        }

        System.out.println(t);
        System.out.println("Productos de mas de $1000: " + t.getMayoresA1000());

        rs.close();
        conn.close();

        ObjectMapper om = new ObjectMapper();
        System.out.println(om.writerWithDefaultPrettyPrinter().writeValueAsString(t));
        om.writerWithDefaultPrettyPrinter().writeValue(Paths.get("ticket.json").toFile(), t);
    }

//    public static void main(String[] args) throws IOException {
//
//        Path archivo = Paths.get("ticket.csv");
//        Scanner lector = new Scanner(archivo);
//
//        lector.useDelimiter("[;\\n\\r]+");
//        Ticket t = new Ticket();
//
//        while(lector.hasNextLong()) { // Una vuelta por cada linea del archivo
//            long cod = lector.nextLong();
//            String nom = lector.next();
//            double cant = lector.nextDouble();
//            double pu = lector.nextDouble();
//
//            Item nuevo = new Item(cod, nom, cant, pu);
//            t.agregarItem(nuevo);
//        }
//
//        System.out.println(t);
//        System.out.println("Productos de mas de $1000: " + t.listadoCaros());
//        lector.close();
//    }
}