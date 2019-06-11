package com.aerotivelabs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static List<MenuItem> appMenu;
    private static BufferedReader consoleReader;
    private static List<Personel> personelList;
    private static List<Deparment> deparmentList;
    private static List<InventoryItem> inventoryItemList;

    private static DataManager<Personel> personelDataManager;
    private static DataManager<Deparment> deparmentDataManager;
    private static DataManager<InventoryItem> inventoryItemDataManager;
    private static boolean isExited;

    public static void main(String[] args) throws IOException {

        consoleReader = new BufferedReader(new InputStreamReader(System.in));

        personelList = new ArrayList<>();
        deparmentList = new ArrayList<>();
        inventoryItemList = new ArrayList<>();

        personelDataManager = new DataManager<>(personelList, consoleReader);
        deparmentDataManager = new DataManager<>(deparmentList, consoleReader);
        inventoryItemDataManager = new DataManager<>(inventoryItemList, consoleReader);


        GenerateApplicationData();

        appMenu = new ArrayList<>();
        GenerateMenuData();

//        for(MenuItem m:appMenu)
//        {
//            System.out.println(m);
//        }

//        appMenu.sort(Comparator.comparingInt(MenuItem::getDisplayOrder));
//        appMenu.forEach(System.out::println);
        do {
            GenerateMenu(-1);
        } while (!isExited);
    }

    private static void GenerateMenu(int ParentId) throws IOException {
        appMenu.stream()
                .filter(menuItem -> menuItem.getParentId() == ParentId)
                .sorted(Comparator.comparingInt(MenuItem::getDisplayOrder))
                .forEach(System.out::println);

        System.out.println(String.format("%d ) %s", 0, ParentId == -1 ? "Exit" : "Back"));
        System.out.print(String.format("%s", "Choose:"));
        int selectedMenu = Integer.parseInt(consoleReader.readLine());
        if (selectedMenu == 0 && ParentId == -1) {
            isExited = true;
        } else {
            if (selectedMenu == 0) return;
            else if (selectedMenu != 0 && ParentId != -1) {
                appMenu.stream()
                        .filter(item -> item.getId() == selectedMenu)
                        .findFirst()
                        .ifPresent(menuItem -> {
                            if (menuItem.getAction() != null) {
                                ((List<?>) menuItem.getAction().get()).forEach(System.out::println);
                            }
                        });
            }
            GenerateMenu(selectedMenu);
        }
    }

    private static void GenerateApplicationData() {
        //PERSONEL

        personelList.add(new Personel.Builder()
                .withId(1)
                .withFirstName("Mehmet Gani")
                .withLastName("Tombalak")
                .withTitle("Dev")
                .withDepartment(1, "Software").build());

        personelList.add(new Personel.Builder()
                .withId(2)
                .withFirstName("Olgu")
                .withLastName("Ay")
                .withTitle("Dev")
                .withDepartment(2, "DSS").build());

        //INVENTORY

        inventoryItemList.add(new InventoryItem.Builder()
                .withId(1)
                .withName("Pen")
                .withItemType(ItemType.Stationery).build());

        inventoryItemList.add(new InventoryItem.Builder()
                .withId(2)
                .withName("Ball Pen")
                .withItemType(ItemType.Stationery).build());

        inventoryItemList.add(new InventoryItem.Builder()
                .withId(3)
                .withName("Scanner")
                .withItemType(ItemType.OfficeElectronics).build());

        inventoryItemList.add(new InventoryItem.Builder()
                .withId(4)
                .withName("Fax")
                .withItemType(ItemType.OfficeElectronics).build());

        inventoryItemList.add(new InventoryItem.Builder()
                .withId(5)
                .withName("Phone")
                .withItemType(ItemType.Electronics).build());

        inventoryItemList.add(new InventoryItem.Builder()
                .withId(6)
                .withName("Water Pump")
                .withItemType(ItemType.Electronics).build());

        //DEPARTMENT

        deparmentList.add(new Deparment.Builder()
                .withId(1)
                .withName("Software").build());

        deparmentList.add(new Deparment.Builder()
                .withId(1)
                .withName("DSS").build());


    }

    private static void GenerateMenuData() {
        appMenu.add(new MenuItem.Builder()
                .withId(1)
                .withName("Personel")
                .withParentId(-1)
                .withDisplayOrder(0)
                .build());
        appMenu.add(new MenuItem.Builder()
                .withId(11)
                .withName("List")
                .withParentId(1)
                .withDisplayOrder(0)
                .withAction(personelDataManager.findAll())
                .build());
        appMenu.add(new MenuItem.Builder()
                .withId(12)
                .withName("Search By Id")
                .withParentId(1)
                .withDisplayOrder(1)
                .withAction(personelDataManager.findById())
                .build());
        appMenu.add(new MenuItem.Builder()
                .withId(13)
                .withName("Search By Keyword")
                .withParentId(1)
                .withDisplayOrder(2)
                .withAction(personelDataManager.findyByKeyword())
                .build());
        appMenu.add(new MenuItem.Builder()
                .withId(2)
                .withName("Inventory")
                .withParentId(-1)
                .withDisplayOrder(1)
                .build());

        appMenu.add(new MenuItem.Builder()
                .withId(21)
                .withName("List")
                .withParentId(2)
                .withDisplayOrder(0)
                .withAction(inventoryItemDataManager.findAll())
                .build());
        appMenu.add(new MenuItem.Builder()
                .withId(22)
                .withName("Search By Id")
                .withParentId(2)
                .withDisplayOrder(1)
                .withAction(inventoryItemDataManager.findById())
                .build());
        appMenu.add(new MenuItem.Builder()
                .withId(23)
                .withName("Search By Keyword")
                .withParentId(2)
                .withDisplayOrder(2)
                .withAction(inventoryItemDataManager.findyByKeyword())
                .build());

        appMenu.add(new MenuItem.Builder()
                .withId(3)
                .withName("Deparments")
                .withParentId(-1)
                .withDisplayOrder(2)
                .build());

        appMenu.add(new MenuItem.Builder()
                .withId(31)
                .withName("List")
                .withParentId(3)
                .withDisplayOrder(0)
                .withAction(deparmentDataManager.findAll())
                .build());
        appMenu.add(new MenuItem.Builder()
                .withId(32)
                .withName("Search By Id")
                .withParentId(3)
                .withDisplayOrder(1)
                .withAction(deparmentDataManager.findById())
                .build());
        appMenu.add(new MenuItem.Builder()
                .withId(33)
                .withName("Search By Keyword")
                .withParentId(3)
                .withDisplayOrder(2)
                .withAction(deparmentDataManager.findyByKeyword())
                .build());
    }
}
