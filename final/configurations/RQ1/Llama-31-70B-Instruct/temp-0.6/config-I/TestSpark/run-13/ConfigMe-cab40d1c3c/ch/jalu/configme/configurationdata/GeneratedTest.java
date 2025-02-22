package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addTest() {
        Property<String> property = new Property<>("test", String.class);
        propertyListBuilder.add(property);
        assertTrue(propertyListBuilder.getRootEntries().containsKey("test"));
    }

    @Test
    public void addTest_propertyAlreadyExists() {
        Property<String> property = new Property<>("test", String.class);
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void createTest() {
        Property<String> property = new Property<>("test", String.class);
        propertyListBuilder.add(property);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

    @Test
    public void createTest_empty() {
        List<Property<?>> result = propertyListBuilder.create();
        assertTrue(result.isEmpty());
    }

}