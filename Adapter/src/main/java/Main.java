public class Main {

    //기존에 제공하는 함수가 있을 경우 해당 기능을 손대지 않고 사용하되 약간의 변형이 필요한 경우.
    public static void main(String[] args) {
        Adapter adapter = new AdapterImpl();

        System.out.println(adapter.twice(100f));
        System.out.println(adapter.halfOf(100f));
    }
}
