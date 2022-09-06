package inheritance;

public class Client {

    public static void main(String[] args) {
        Instructor i = new Instructor();

        i.login();

        User u = new User();
        u.login();

//        u.scheduleClass();

        System.out.println(i.username);
    }
}
