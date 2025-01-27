package ch.jalu.configme.configurationdata;

public class GeneratedTestClearAndAdd {

    private List<Property> properties = new ArrayList<>();

    public void add(Property property) {
        if (property == null || !property.isNew()) {
            throw new IllegalArgumentException("Cannot add null or existing Property to the list");
        }
        properties.add(property);
    }

    public void clear() {
        properties.clear();
    }

    public List<Property> create() {
        return properties;
    }
}

public class Property {
    private String name = "test";
    private String value = "value";

    public boolean isNew() {
        return !name.equals("new1");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

public class PropertyListBuilderTest {

    @Test
    public void testClearAndAdd() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property property1 = new Property();
        Property property2 = new Property();

        builder.add(property1);
        builder.add(property2);

        builder.clear();

        Property newProperty = new Property();
        builder.add(newProperty);

        List<Property> actual = builder.create();
        assertEquals(1, actual.size());
    }

}