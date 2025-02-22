package ch.jalu.configme.configurationdata;

public class GeneratedAddTest_propertyAlreadyExists {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addTest_propertyAlreadyExists() {
        Property<String> property = new Property<>("test", String.class);
        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}