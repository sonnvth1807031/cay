package main;
import controller.CreateMenu;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CreateMenu createMenu = new CreateMenu();
        createMenu.menu();
    }
}
