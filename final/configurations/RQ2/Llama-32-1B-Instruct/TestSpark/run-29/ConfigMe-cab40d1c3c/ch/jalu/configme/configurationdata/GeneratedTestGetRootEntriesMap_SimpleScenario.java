package ch.jalu.configme.configurationdata;

public class GeneratedTestGetRootEntriesMap_SimpleScenario {

    private PropertyListBuilder propertyListBuilder;
    private Map<String, Object> rootNode;

    @Before
    void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testGetRootEntriesMap_SimpleScenario() throws ConfigMeException {
        Map<String, Object> rootNode = new LinkedHashMap<>();
        addMultipleProperties(rootNode);
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(10, properties.size());
    }

}