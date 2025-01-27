package ch.jalu.configme.configurationdata;

public class GeneratedCreatePropertyList_WithoutProperties_ReturnsEmptyList {

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
    public void createPropertyList_WithoutProperties_ReturnsEmptyList() {
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> properties = builder.create();

        assertFalse(properties.isEmpty());
        assertEquals(0, properties.size());
    }
}

public class PropertyListBuilder {

    public List<Property<?>> create() {
        return new ArrayList<>();
    }

}