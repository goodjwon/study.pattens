import java.util.Date;

public class HpCreator extends ItemCreator {

    @Override
    protected void requestItemInfo() {
        System.out.println("체력 회복물약의 정보를 가져 온다.");
    }

    @Override
    protected void createItemLog() {
        System.out.println("체력 회복물약을 생성 했습니다."+new Date());

    }

    @Override
    protected Item createItem() {
        return new HpPotion();
    }
}
