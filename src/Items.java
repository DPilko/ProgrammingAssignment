public class Items {

    //Creating instance variables for Items
    private String itemName;
    private int itemDamage;
    private String itemDescription;
    private int healingAmount;


    //Using a Constructor so these parameters must be passed though and set to the instance variables above.
    public Items(String itemName, int itemDamage, String itemDescription, int healingAmount) {
        this.itemName = itemName;
        this.itemDamage = itemDamage;
        this.itemDescription = itemDescription;
        this.healingAmount = healingAmount;

    }

    //Using getVariableName to return specific values of an Item when called.
    public String getItemName() {
        return itemName;
    }
    public int getItemDamage() {
        return itemDamage;
    }
    public String getItemDescription() {
        return itemDescription;
    }
    public int getHealingAmount() {
        return healingAmount;
    }

}
