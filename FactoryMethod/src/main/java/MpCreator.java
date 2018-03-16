import java.util.Date;

public class MpCreator extends ItemCreator {

    @Override
    protected void requestItemInfo() {
        System.out.println("마나 물약의 정보를 가져 온다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("마나물약을 생성 했습니다."+new Date());

    }

    @Override
    protected Item createItem() {
        return new MpPotion();
    }
}
