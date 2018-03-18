package stduy.petton.singletone;


public class SystemSpeker {

     static private SystemSpeker instance;

     private int volum;

     private SystemSpeker(){
         volum = 5;
     }

     public static SystemSpeker getInstance(){

         if(instance == null) {
             instance =  new SystemSpeker();
             System.out.println("새로생성");
         }else {
             System.out.println("이미생성");
         }


        return instance;
     }

    public int getVolum() {
        return volum;
    }

    public void setVolum(int volum) {
        this.volum = volum;
    }
}
