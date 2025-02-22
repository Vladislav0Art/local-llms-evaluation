package ch.jalu.configme.configurationdata;

public class GeneratedCreateTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void createTest() {
        Property<String> property = new Property<>("test", String.class);
        propertyListBuilder.add(property);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

}