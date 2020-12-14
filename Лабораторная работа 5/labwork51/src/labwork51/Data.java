package labwork51;

import java.sql.*;
import java.util.ArrayList;

public class Data {

	Connection con;
    ArrayList<Procedure> pro;
    ArrayList<Client> cli;

    public Data() {
        pro = new ArrayList<>();
        cli = new ArrayList<>();
    }

    private void createCon() throws ClassNotFoundException {
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
    private void selectElements() throws ClassNotFoundException, SQLException {
        pro.clear();
        cli.clear();
        createCon();
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

    public String showPro() throws SQLException, ClassNotFoundException {
        selectElements();
        String s = "";
        for(Procedure p : pro)
        {
            s += "| id: " + p.id + "\t| ���������: " + p.name + "\t| ������������: " + p.time + "\t| ����:" + p.price + " ��� \t|\n";
        }

        return s;
    }

    public String showCli() throws SQLException, ClassNotFoundException {
        selectElements();
        String s = "";
        for(Client p : cli)
        {
        	s += "| id: " + p.id + "\t| ���: " + p.fio + "\t| �������: " + p.tel + "\t| ID Proc:" + p.id_pr + " ��� \t|\n";
        }

        return s;
    }

    public String addToPro(Procedure p) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "������ ����������!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO procedura (id_pro, Pname, Ptime, Pprice) VALUES ("+p.id+",'"+p.name+"', '"+p.time+"', "+p.price+")");
            stmt.close();
            return "���������� ��������� "+p.name+" ��������� �������!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "������ ���������� � ������� ���������!";
        } finally {
           con.close();
        }
    }

    public String deleteFromPro(int _id) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "������ ����������!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("DELETE FROM procedura WHERE id_pro = "+_id);
            stmt.close();
            return "�������� ��������� � id:"+_id+" ��������� �������!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "������ �������� �� ������� ���������!";
        } finally {
            con.close();
        }
    }

    public String deleteFromCli(int _id) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "������ ����������!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("DELETE FROM clientt WHERE id_cli = "+_id);
            stmt.close();
            return "�������� ������� � id:"+_id+" ��������� �������!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "������ �������� �� ������� ������!";
        } finally {
            con.close();
        }
    }

    public String addToCli(Client p) throws SQLException {
        try {
            selectElements();
            createCon();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return "������ ����������!";
        }
        try {
            Statement stmt = con.createStatement();
            boolean rs = stmt.execute("INSERT INTO clientt (id_cli, Cname, Ctel, id_pr) VALUES ("+p.id+",'"+p.fio+"', '"+p.tel+"', "+p.id_pr+")");
            stmt.close();
            return "���������� ������� "+p.fio+" ��������� �������!";
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return "������ ���������� � ������� ������!";
        } finally {
            con.close();
        }
    }

}
