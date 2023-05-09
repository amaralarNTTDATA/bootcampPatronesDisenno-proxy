public class PersonService implements IPerson {

    private String name;
    private int age;

    public PersonService(String name, int age) {

        this.name = name;
        this.age = age;

    }

    @Override
    public void almorzar() {

        lavarManos();
        System.out.println("ÑAM ÑAM ÑAM");
        levantarMesa();

    }

    public void lavarManos() {

        System.out.println("Manos lavadas");

    }

    public void levantarMesa() {

        System.out.println("La persona se ha levantado de la mesa");

    }

}
