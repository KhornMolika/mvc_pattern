package view;

import controller.UserController;
import model.User;

import java.util.Scanner;

public class View {

    private static final UserController userController = new UserController();

    public static void UI(){
        while (true){
            System.out.println("=====| Menu |=======");
            System.out.println("1.Show all user");
            System.out.println("2.Add new user");
            System.out.println("3.Remove user");
            System.out.println("4.Update user");
            System.out.println("0. Exit");
            System.out.println("=====================");
            System.out.print("Option: ");
            int op = new Scanner(System.in).nextInt();
            switch(op){
                case 1->{
                    System.out.println("=====| Get All Users |=====");
                    userController.getAllUsers().forEach(System.out::println);
                }
                case 2->{
                    System.out.println("=====| Add New User |=====");
                    int id = userController.getAllUsers().size() + 1;
                    System.out.print("Enter Name: ");
                    String name = new Scanner(System.in).nextLine();
                    System.out.print("Enter Email: ");
                    String email = new Scanner(System.in).nextLine();
                    userController.addNewUser(new User(id, name, email));
                }
                case 3->{
                    System.out.println("=====| Remove User |=====");
                    System.out.print("Enter ID to remove user: ");
                    int id = new Scanner(System.in).nextInt();
                    userController.deleteUser(id);
                }
                case 4-> {}
                case 0->System.exit(0);
            }
        }
    }

}
