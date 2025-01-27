package ch.jalu.configme.configurationdata;

public class GeneratedAddProperty_EmptyList_ReturnsNewList {

    private String value;

    public Property(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Property property = (Property) o;
        return value.equals(property.value);
    }
}

public class ConfigMeException extends Exception {
}

class PropertyListBuilderTest {

    @Test
    public void addProperty_EmptyList_ReturnsNewList() {
        List<Property> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Property p1 = new Property("test");
        Property p2 = new Property("test");
        builder.add(p1);
        builder.add(p2);
        assertEquals(1, builder.create().size());
    }

}