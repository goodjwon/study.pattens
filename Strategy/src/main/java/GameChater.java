public class GameChater {


    private Weappen weappen;

    public void setWeappen(Weappen weappen) {
        this.weappen = weappen;
    }

    public void attack(){

        if(weappen==null){
            System.out.println("맨손 공격");
        } else {
            weappen.attack();
        }
    }

    public static void main(String[] args) {

        GameChater chater = new GameChater();

        chater.attack();

        chater.setWeappen(new Knife());
        chater.attack();

        chater.setWeappen(new Sword());
        chater.attack();

        chater.setWeappen(new Ax());
        chater.attack();

    }
}
