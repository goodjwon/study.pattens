import com.goodjwon.dp.AbstractConnectHelper;
import com.goodjwon.dp.DefaultGameConnecHelper;

public class Main {

    public static void main(String[] args) {

        AbstractConnectHelper helper = new DefaultGameConnecHelper();
        helper.requestConnection("child|password");
    }
}
