package lr1;
/**
 * this class demonstrate first java application
 * @author Rusin Danilo Oleksandrovich 535st2
 * @version 1.1.2
 * @since 2020-17-09
 */
public class Lr1 {
     /**
     * This method shows main information about me.
     * @param args the command line arguments,unsued.
     */
    public static void main(String[] args) {
        System.out.println("Group  : 535st2");
        System.out.println("Student  : Rusin Danilo Oleksandrovich");
        System.out.println("Variant  : 10");
        String[] Full_name = {
                "********          ************          ***********    \n",
                "**********        *************        *************   \n",
                "**       **       **         ***       **         **   \n",
                "**       **       **          ***      **         **   \n",
                "**********        **           ***     **         **   \n",
                "********          **           ***     **         **   \n",
                "**  ***           **          ***      **         **   \n",
                "**    ***         **         ***       **         **   \n",
                "**      ***       *************        *************   \n",
                "**        ***     ************          ***********    \n"
        };
        for (String item :Full_name) {
            System.out.print(item);
        }
    }
}
