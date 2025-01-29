package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntries_SingleEntry_SimpleScenario {

    private PropertyListBuilder propertyListBuilder;
    private Map<String, Object> rootNode;

    @Before
    void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testGetRootEntries_SingleEntry_SimpleScenario() throws ConfigMeException {
        rootNode = new LinkedHashMap<>();
        rootNode.put("entry1", "value1");
        propertyListBuilder.add(new Property("testProperty2", "testValue"));
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
    }

}