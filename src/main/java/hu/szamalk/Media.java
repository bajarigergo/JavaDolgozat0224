package hu.szamalk;

import java.util.UUID;

public class Media implements Cloneable {
    private UUID id = new UUID(8,1);
    private int ar;
    private Kategoria kategoria;

    @Override
    public Media clone() {
        try {
            Media clone = (Media) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Media(int ar, Kategoria kategoria) {
        this.ar = ar;
        this.kategoria = kategoria;
    }
}
