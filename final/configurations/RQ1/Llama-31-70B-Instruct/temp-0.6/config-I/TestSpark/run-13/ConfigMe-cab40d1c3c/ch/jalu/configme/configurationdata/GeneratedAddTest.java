package ch.jalu.configme.configurationdata;

public class GeneratedAddTest {

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

}