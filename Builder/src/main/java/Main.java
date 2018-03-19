public class Main {


    /**
     * Factory : new 를 사용 하지 않고 생성을 팩터리에 위임한다. ㅈ
     * @param args
     */
    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();

        factory.setBluePrint(new LGGramBlueprint());

        factory.make();

        Computer computer = factory.getComputer();

        //Computer computer = new Computer("i7", "16g", "256 SSD");

        System.out.println(computer.toString());

    }
}
