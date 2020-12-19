package labwork51;

import java.sql.SQLException;

public class Labwork51 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Operations operation = new Operations();
        System.out.println(operation.table1_show());
        System.out.println(operation.table2_show());
        //ƒемонстраци€ работы вставки 
        Procedure dl = new Procedure(9, "ƒепил€ци€ ног", 2, 150 );
        Client so = new Client(9, "—кeба яна ѕетровна","+380966376234", 9);
        System.out.println(operation.table1_add(dl));
        System.out.println(operation.table2_add(so));
        System.out.println(operation.table1_show());
        System.out.println(operation.table2_show());
        //ƒемонстраци€ работы удалени€ 
        System.out.println(operation.table1_delete(9));
        System.out.println(operation.table2_delete(9));
        System.out.println(operation.table1_show());
        System.out.println(operation.table2_show());
    }

}
