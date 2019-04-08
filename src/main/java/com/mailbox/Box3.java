package com.mailbox;

public class Box3 extends MailBox{

    private final float maxLength = 23;
    private final float maxHeight = 13;
    private final float maxWidth = 14;

    @Override
    public boolean validate(float length, float width, float height) {
        return length <= maxLength && width <= maxWidth && height <= maxHeight;
    }

    @Override
    public void printType() {
        System.out.println("Box3");
    }
}

//Box5: 長39.5，寬27.5，高23 (cm)