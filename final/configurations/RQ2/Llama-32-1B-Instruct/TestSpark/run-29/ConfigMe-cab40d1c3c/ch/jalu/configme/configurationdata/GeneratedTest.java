package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;
    private Map<String, Object> rootNode;

    @Before
    void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddProperty_SimpleScenario() throws ConfigMeException {
        propertyListBuilder.add(new Property("testProperty", "testValue"));
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
        assertEquals("testProperty", properties.get(0).getValue());
        assertEquals("testValue", properties.get(0).getValue());
    }

    @Test
    public void testAddProperty_SingleEntry_SimpleScenario() throws ConfigMeException {
        propertyListBuilder.add(new Property("testProperty1", "testValue"));
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
        assertEquals("testProperty1", properties.get(0).getValue());
    }

    @Test
    public void testAddMultipleProperties_SimpleScenario() throws ConfigMeException {
        propertyListBuilder.add(new Property("testProperty2", "testValue"));
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(2, properties.size());
        assertEquals("testProperty2", properties.get(0).getValue());
    }

    @Test
    public void testAddMultipleProperties_SingleEntry_SimpleScenario() throws ConfigMeException {
        propertyListBuilder.add(new Property("testProperty1", "testValue"));
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(2, properties.size());
        assertEquals("testProperty1", properties.get(0).getValue());
    }

    @Test
    public void testGetRootEntries_SimpleScenario() throws ConfigMeException {
        rootNode = new LinkedHashMap<>();
        rootNode.put("entry1", "value1");
        propertyListBuilder.add(new Property("testProperty2", "testValue"));
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(2, properties.size());
    }

    @Test
    public void testGetRootEntries_SingleEntry_SimpleScenario() throws ConfigMeException {
        rootNode = new LinkedHashMap<>();
        rootNode.put("entry1", "value1");
        propertyListBuilder.add(new Property("testProperty2", "testValue"));
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
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

    @Test
    public void testGetRootEntriesMap_SimpleScenario() throws ConfigMeException {
        Map<String, Object> rootNode = new LinkedHashMap<>();
        addMultipleProperties(rootNode);
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(10, properties.size());
    }

    @Test
    public void testGetRootEntriesMap_SingleEntry_SimpleScenario() throws ConfigMeException {
        Map<String, Object> rootNode = new LinkedHashMap<>();
        addMultipleProperties(rootNode);
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
    }

}