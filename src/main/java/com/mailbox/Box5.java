package com.mailbox;

public class Box5 extends MailBox{

    private final float maxLength = 39.5f;
    private final float maxHeight = 23f;
    private final float maxWidth = 27.5f;

    @Override
    public boolean validate(float length, float width, float height) {
        return length <= maxLength && width <= maxWidth && height <= maxHeight;
    }

    @Override
    public void printType() {
        System.out.println("Box5");
    }
}
