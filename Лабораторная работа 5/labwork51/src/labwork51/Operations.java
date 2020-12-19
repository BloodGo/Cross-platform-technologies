package labwork51;

import java.sql.*;
import java.util.ArrayList;

public class Operations {

	Connection con;
    ArrayList<Procedure> pro;
    ArrayList<Client> cli;

    public Operations() {
        pro = new ArrayList<>();
        cli = new ArrayList<>();
    }

    private void connection() throws ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/labwork1"+
            "?verifyServerCertificate=false"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC";
        String login = "root";
        String password = "";
        try {
            con = DriverManager.getConnection(url, login, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    private void exportFromTable() throws ClassNotFoundException, SQLException {
        pro.clear();
        cli.clear();
        connection();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM procedura");
            while (rs.next()) {
                Procedure p = new Procedure(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
                pro.add(p);
            }
            rs = stmt.executeQuery("SELECT * FROM clientt");
            while (rs.next()) {
                Client p = new Client(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
                cli.add(p);
            }
            rs.close();
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            con.close();
        }
    }

    public String table1_show() throws SQLException, ClassNotFoundException {
    	exportFromTable();
        String s = "";
        for(Procedure p : pro)
        {
            s += "| id: " + p.id + "\t| Процедура: " + p.name + "\t| Длительность: " + p.time + "\t| Цена:" + p.price + " грн \t|\n";
        }

        return s;
    }

    public String table1_add(Procedure p) throws SQLException {
        try {
        	exportFromTable();
            connection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "Ошибка соединения!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO procedura (id_pro, Pname, Ptime, Pprice) VALUES ("+p.id+",'"+p.name+"', '"+p.time+"', "+p.price+")");
            stmt.close();
            return "Добавление процедуры "+p.name+" произошло успешно!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "Ошибка добавления в таблицу должность!";
        } finally {
           con.close();
        }
    }

    public String table1_delete(int _id) throws SQLException {
        try {
        	exportFromTable();
            connection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "Ошибка соединения!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("DELETE FROM procedura WHERE id_pro = "+_id);
            stmt.close();
            return "Удаление процедуры с id:"+_id+" произошло успешно!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "Ошибка удаления из таблицы процедура!";
        } finally {
            con.close();
        }
    }
    
    public String table2_show() throws SQLException, ClassNotFoundException {
    	exportFromTable();
        String s = "";
        for(Client p : cli)
        {
        	s += "| id: " + p.id + "\t| ФИО: " + p.fio + "\t| Телефон: " + p.tel + "\t| ID Proc:" + p.id_pr + " грн \t|\n";
        }

        return s;
    }

    public String table2_add(Client p) throws SQLException {
        try {
        	exportFromTable();
            connection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "Ошибка соединения!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO clientt (id_cli, Cname, Ctel, id_pr) VALUES ("+p.id+",'"+p.fio+"', '"+p.tel+"', "+p.id_pr+")");
            stmt.close();
            return "Добавление клиента "+p.fio+" произошло успешно!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "Ошибка добавления в таблицу клиент!";
        } finally {
            con.close();
        }
    }
    
    public String table2_delete(int _id) throws SQLException {
        try {
        	exportFromTable();
            connection();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "Ошибка соединения!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("DELETE FROM clientt WHERE id_cli = "+_id);
            stmt.close();
            return "Удаление клиента с id:"+_id+" произошло успешно!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "Ошибка удаления из таблицы клиент!";
        } finally {
            con.close();
        }
    }

}
