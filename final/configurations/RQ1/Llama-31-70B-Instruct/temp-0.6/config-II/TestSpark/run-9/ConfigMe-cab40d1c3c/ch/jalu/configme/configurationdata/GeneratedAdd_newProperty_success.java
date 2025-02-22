package ch.jalu.configme.configurationdata;

public class GeneratedAdd_newProperty_success {

    @Test
    public void add_newProperty_success() {
        PropertyListBuilder listBuilder = new PropertyListBuilder();
        Property<String> property = new Property<>("test.property", String.class);

        listBuilder.add(property);

        Map<String, Object> rootEntries = listBuilder.getRootEntries();
        assertEquals(1, rootEntries.size());
        Map<String, Object> childMap = asTypedMap(rootEntries.get("test"));
        assertEquals(1, childMap.size());
        assertEquals(property, childMap.get("property"));
    }

}