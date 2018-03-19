public class LGGramBlueprint extends BluePrint {

    private Computer computer;

    public LGGramBlueprint() {
        this.computer = new Computer("default","default","default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");

    }

    @Override
    public void setRam() {
        computer.setRam("8g");

    }

    @Override
    public void setStorage() {
        computer.setStorage("512 SSD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
