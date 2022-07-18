import java.io.Serial;
import java.io.Serializable;

public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1;

    String name;
    transient String password; // isn't passed to serializer

    public void sayHello(){
        System.out.println("Hello "+name);
    }
}
