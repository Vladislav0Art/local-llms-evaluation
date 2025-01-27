package ch.jalu.configme.configurationdata;

public class GeneratedCreatePropertyList_MultipleProperties_ReturnsNonEmptyList {

    private String name;
    private Object value;

    public Property() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}

public class PropertyListBuilderTest {

    @Test
    public void createPropertyList_MultipleProperties_ReturnsNonEmptyList() {
        Property property1 = new Property();
        Property property2 = new Property();
        PropertyListBuilder builder = new PropertyListBuilder();

        List<Property<?>> properties = builder.create();

        assertNotNull(properties);
        assertTrue(properties.size() > 0);
    }

}