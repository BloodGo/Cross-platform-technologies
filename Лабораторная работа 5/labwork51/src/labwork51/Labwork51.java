package labwork51;

import java.sql.SQLException;

public class Labwork51 {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Data data = new Data();
        System.out.println(data.showPro());
        System.out.println(data.showCli());
        Procedure dl = new Procedure(9, "ƒепил€ци€ ног", 2, 150 );
        Client so = new Client(9, "—кeба яна ѕетровна","+380966376234", 9);
        System.out.println(data.addToPro(dl));
        System.out.println(data.addToCli(so));
        System.out.println(data.showPro());
        System.out.println(data.showCli());
        System.out.println(data.deleteFromPro(9));
        System.out.println(data.deleteFromCli(9));
        System.out.println(data.showPro());
        System.out.println(data.showCli());
    }

}
