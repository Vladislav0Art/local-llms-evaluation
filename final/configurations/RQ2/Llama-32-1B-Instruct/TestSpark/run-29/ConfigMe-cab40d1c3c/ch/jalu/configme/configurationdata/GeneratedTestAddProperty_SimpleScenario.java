package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty_SimpleScenario {

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

}