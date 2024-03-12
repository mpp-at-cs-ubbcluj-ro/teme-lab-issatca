package ro.mpp2024;

public interface Identifiable<Tid> {
    Tid getID();
    void setID(Tid id);
}