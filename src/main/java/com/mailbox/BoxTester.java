package com.mailbox;

import java.util.ArrayList;
import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        boolean hasMatchBoxes = false;
        ArrayList<MailBox> boxes = initAllTypeOfBoxes();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter object's length");
        float length = scanner.nextFloat();
        System.out.println("Please enter object's width");
        float width = scanner.nextFloat();
        System.out.println("Please enter object's height");
        float height = scanner.nextFloat();

        for (MailBox box : boxes) {
            if (box.validate(length, width, height)) {
                box.printType();
                hasMatchBoxes = true;
            }
        }

        if (!hasMatchBoxes) {
            System.out.println("Sorry, we don't have any proper box for you!");
        }
    }

    private static ArrayList<MailBox> initAllTypeOfBoxes() {
        ArrayList<MailBox> boxes = new ArrayList<>();
        MailBox box3 = new Box3();
        MailBox box5 = new Box5();
        boxes.add(box3);
        boxes.add(box5);
        return boxes;
    }
}
