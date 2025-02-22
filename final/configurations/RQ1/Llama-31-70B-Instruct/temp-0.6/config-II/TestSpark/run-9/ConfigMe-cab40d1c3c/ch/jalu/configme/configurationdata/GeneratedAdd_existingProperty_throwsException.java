package ch.jalu.configme.configurationdata;

public class GeneratedAdd_existingProperty_throwsException {

    @Test
    public void add_existingProperty_throwsException() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> property = new Property<>("test.property", String.class);
        listBuilder.add(property);

        listBuilder.add(property);
    }

    private static Map<String, Object> asTypedMap(Object o) {
        return (Map<String, Object>) o;
    }

}