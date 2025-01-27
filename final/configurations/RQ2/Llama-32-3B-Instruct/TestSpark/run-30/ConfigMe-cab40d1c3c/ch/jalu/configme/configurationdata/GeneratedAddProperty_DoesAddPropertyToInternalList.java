package ch.jalu.configme.configurationdata;

public class GeneratedAddProperty_DoesAddPropertyToInternalList {

    @Test
    public void addProperty_DoesAddPropertyToInternalList() {
        List<Property> internalList = new ArrayList<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        Property property = new Property("test", "test");
        builder.add(property);
        assertEquals(1, ((PropertyListBuilder) builder).create().size());
    }

}