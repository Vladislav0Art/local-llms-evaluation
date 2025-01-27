package ch.jalu.configme.configurationdata;

public class GeneratedAddProperty_PropertysIsAddedToTheList {

    private String name;
    private String value;

    public Property(String name, String value) {
        this.name = name;
        this.value = value;
    }

    // getters and setters...

}

public class PropertyListBuilderTest {

    @Test
    public void addProperty_PropertysIsAddedToTheList() {
        Property property1 = new Property("prop1", "value1");
        Property property2 = new Property("prop2", "value2");

        List<Property> properties = new ArrayList<>();
        new PropertyListBuilder().add(property1);
        new PropertyListBuilder().add(property2);

        List<Property> result = new PropertyListBuilder().create(properties);
        assertEquals(2, result.size());
    }

}