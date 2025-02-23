package ch.jalu.configme.configurationdata;

public class GeneratedAddProperty_validProperty_propertyAdded {

    private PropertyListBuilder propertyListBuilder;

    private Property<String> property;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
        property = mock(Property.class);
    }

    @Test
    public void addProperty_validProperty_propertyAdded() {
        when(property.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property);

        List<Property<?>> properties = propertyListBuilder.create();
        assertEquals(1, properties.size());
        assertEquals(property, properties.get(0));
    }

}