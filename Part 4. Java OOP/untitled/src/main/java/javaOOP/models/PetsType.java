package javaOOP.models;

public enum PetsType {
    CAT("cat"),
    DOG("dog"),
    HAMSTER("hamster");

    private final String val;

    PetsType(String val){
        this.val = val;
    }

    public String getPetsType() {
        return val;
    }
}
