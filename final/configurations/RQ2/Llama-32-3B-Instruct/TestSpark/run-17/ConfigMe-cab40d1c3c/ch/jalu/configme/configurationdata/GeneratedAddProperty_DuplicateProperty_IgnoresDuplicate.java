package ch.jalu.configme.configurationdata;

public class GeneratedAddProperty_DuplicateProperty_IgnoresDuplicate {

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
    public void addProperty_DuplicateProperty_IgnoresDuplicate() {
        List<Property> propertyList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property("test"));
        builder.add(new Property("test"));
        assertEquals(1, builder.create().size());
    }

}