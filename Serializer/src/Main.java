import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        User user = new User();

        user.name = "Bro Code";
        user.password = "Password123";

        FileOutputStream fileOut = new FileOutputStream("Serializer/src/UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();

        System.out.println("object info saved! :)");

        long serialVersionUID = ObjectStreamClass.lookup(user.getClass()).getSerialVersionUID();
        System.out.println(serialVersionUID);
    }
}
