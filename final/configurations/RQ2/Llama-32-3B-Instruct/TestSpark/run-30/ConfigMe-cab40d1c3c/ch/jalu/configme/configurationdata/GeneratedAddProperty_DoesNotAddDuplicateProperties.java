package ch.jalu.configme.configurationdata;

public class GeneratedAddProperty_DoesNotAddDuplicateProperties {

    @Test
    public void addProperty_DoesNotAddDuplicateProperties() {
        List<Property> internalList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Property property1 = new Property("test", "test");
        Property property2 = new Property("test", "test");
        builder.add(property1);
        assertEquals(1, ((PropertyListBuilder) builder).create().size());
    }

}