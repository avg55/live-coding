package ag.code.ujic;

/**
 * Write immutable class Pet
 * 2 fields: String name, boolean hungry
 * <p>
 * pet objects may change hungry: true <-> false
 * <p>
 * Additional: write Builder.
 * Pet object is created with methods of(String name), hungry(boolean isHungry)
 */

public final class Pet {

    private final String name;
    private final boolean isHungry;

    public Pet(String name, boolean isHungry) {
        this.name = name;
        this.isHungry = isHungry;
    }

    public Pet hungry(boolean isHungry) {
        return new Pet(this.name, isHungry);
    }

    public String getName() {
        return name;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public static Builder of(String name) {
        return new Builder(name);
    }

    public static class Builder {
        private final String name;
        private boolean isHungry;

        private Builder(String name) {
            this.name = name;
        }

        public Builder hungry(boolean isHungry) {
            this.isHungry = isHungry;
            return this;
        }

        public Pet build() {
            return new Pet(name, isHungry);
        }
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", isHungry=" + isHungry +
                '}';
    }
}

class PetDemo {

    public static void main(String[] args) {

        Pet hungryCat = new Pet("CAT", true);
        Pet fullCat = hungryCat.hungry(false);

        System.out.println(hungryCat == fullCat);


        Pet hungryDog = Pet.of("DOG")
                .hungry(true)
                .build();
        Pet fullDog = hungryDog.hungry(false);
        System.out.println(hungryDog);
        System.out.println(fullDog);
    }

}