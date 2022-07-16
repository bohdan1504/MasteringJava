import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> countries = new HashMap<String, String>();

        //add a key and value
        countries.put("USA", "Washington DC");
        countries.put("India", "New Delhi");
        countries.put("Ukraine", "Kyiv");
        countries.put("China", "Beijing");

        countries.remove("USA");
        System.out.println(countries.get("Ukraine"));
        countries.clear();

        countries.replace("USA", "Detroit");
        System.out.println(countries.containsKey("England"));
        System.out.println(countries.containsValue("Beijing"));

        for (String i : countries.keySet()){
            System.out.print(i + "\t = ");
            System.out.println(countries.get(i));
        }



    }

}