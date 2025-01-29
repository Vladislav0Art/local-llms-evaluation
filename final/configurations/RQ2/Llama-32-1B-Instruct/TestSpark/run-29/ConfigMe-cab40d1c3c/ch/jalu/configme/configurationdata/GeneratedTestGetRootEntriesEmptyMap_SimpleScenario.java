package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntriesEmptyMap_SimpleScenario {

    private PropertyListBuilder propertyListBuilder;
    private Map<String, Object> rootNode;

    @Before
    void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testGetRootEntriesEmptyMap_SimpleScenario() throws ConfigMeException {
        rootNode = new LinkedHashMap<>();
        addMultipleProperties(rootNode);
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(0, properties.size());
    }

    private void addMultipleProperties(Map<String, Object> rootNode) {
        for (int i = 1; i <= 10; i++) {
            Property property = new Property("testProperty" + i, "testValue");
            rootNode.put("entry" + i, property);
            propertyListBuilder.add(property);
        }
    }

}