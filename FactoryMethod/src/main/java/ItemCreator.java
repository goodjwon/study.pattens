public abstract class ItemCreator {

    //This FactoryMethod => TemplateMethod
    public Item create(){

        Item item;

        requestItemInfo();

        item = createItem();

        createItemLog();

        return item;
    }


    abstract protected void requestItemInfo();

    abstract protected void createItemLog();

    abstract protected Item createItem();

}
