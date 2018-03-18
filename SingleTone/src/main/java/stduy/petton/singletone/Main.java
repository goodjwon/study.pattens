package stduy.petton.singletone;

public class Main {

    public static void main(String[] args) {
        SystemSpeker speker1 = SystemSpeker.getInstance();
        SystemSpeker speker2 = SystemSpeker.getInstance();

        System.out.println(speker1.getVolum());
        System.out.println(speker2.getVolum());

        speker1.setVolum(11);

        System.out.println(speker1.getVolum());
        System.out.println(speker2.getVolum());

    }
}
