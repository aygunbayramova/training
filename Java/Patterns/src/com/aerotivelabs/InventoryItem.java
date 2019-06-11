package com.aerotivelabs;

public class InventoryItem implements IEntity {
    private int id;
    private String name;
    private ItemType itemType;

    private InventoryItem() { }

    public int getId() { return id; }

    private void setId(int id) { this.id = id; }

    public String getName() { return name; }

    private void setName(String name) { this.name = name; }

    public ItemType getItemType() { return itemType; }

    private void setItemType(ItemType itemType) { this.itemType = itemType; }

    @Override
    public String toString() {
        return  getId() + "-" + getName() + "( " + itemType.getDesciption() + ")";
    }

    public static class Builder {
        private InventoryItem instance;

        public Builder() {
            this.instance = new InventoryItem();
        }

        public Builder withId(int id) {
            this.instance.setId(id);
            return this;
        }

        public Builder withName(String name) {
            this.instance.setName(name);
            return this;
        }

        public Builder withItemType(ItemType type) {
            this.instance.setItemType(type);
            return this;
        }

        public InventoryItem build() {
            return instance;
        }
    }
}
