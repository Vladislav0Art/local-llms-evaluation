package ch.jalu.configme.configurationdata;

public class GeneratedTestAddMultipleProperties_SingleEntry_SimpleScenario {

    private PropertyListBuilder propertyListBuilder;
    private Map<String, Object> rootNode;

    @Before
    void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddMultipleProperties_SingleEntry_SimpleScenario() throws ConfigMeException {
        propertyListBuilder.add(new Property("testProperty1", "testValue"));
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(2, properties.size());
        assertEquals("testProperty1", properties.get(0).getValue());
    }

}