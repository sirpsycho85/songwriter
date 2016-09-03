package org.model;

public class Key {
    private char root;
    private String mode;

    public Key(char root, String mode) {
        this.root = root;
        this.mode = mode;
    }

    public char getRoot() {
        return root;
    }

    public void setRoot(char root) {
        this.root = root;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    @Override
    public String toString() {
        return root + " " + mode;
    }
}
