package ch.jalu.configme.configurationdata;

public class GeneratedTestAddMultipleProperties_SimpleScenario {

    private PropertyListBuilder propertyListBuilder;
    private Map<String, Object> rootNode;

    @Before
    void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAddMultipleProperties_SimpleScenario() throws ConfigMeException {
        propertyListBuilder.add(new Property("testProperty2", "testValue"));
        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(2, properties.size());
        assertEquals("testProperty2", properties.get(0).getValue());
    }

}