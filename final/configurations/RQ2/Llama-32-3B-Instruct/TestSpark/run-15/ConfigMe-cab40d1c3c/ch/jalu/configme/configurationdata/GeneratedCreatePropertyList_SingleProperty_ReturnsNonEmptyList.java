package ch.jalu.configme.configurationdata;

public class GeneratedCreatePropertyList_SingleProperty_ReturnsNonEmptyList {

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
    public void createPropertyList_SingleProperty_ReturnsNonEmptyList() {
        Property property = new Property();
        PropertyListBuilder builder = new PropertyListBuilder();

        List<Property<?>> properties = builder.create();

        assertNotNull(properties);
        assertTrue(properties.size() > 0);
    }

}