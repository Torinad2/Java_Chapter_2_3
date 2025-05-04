/**************************************************************************************************
 * Assignment: Personal Information                                                               *
 *                                                                                                *
 * Write a program that displays the following information, each on a separate line:              *
 * • Your name                                                                                    *
 * • Your address, with city, state, and ZIP                                                      *
 * • Your telephone number                                                                        *
 * • Your college major                                                                           *
 * Although these items should be displayed on separate output lines, use only a single println   *
 * statement in your program.                                                                     *
 **************************************************************************************************/

public class PersonalInformation {
    public static void main(String[] args) {

        /* ********************************************
         * Display personal information using \n      *
         **********************************************/
        System.out.println("Nikita Baiborodov\n"
                + "188 Richards Ave, Norwalk, CT 06854\n"
                + "(203) 857-7000\n"
                + "Computer Science: Software Development");

        /* *********************************************
         * Display developer credit                    *
         ***********************************************/
        System.out.println("\nDeveloped by: Nikita Baiborodov");

        /* ********************************************
         * Exit the program                           *
         **********************************************/
        System.exit(0);
    }
}

