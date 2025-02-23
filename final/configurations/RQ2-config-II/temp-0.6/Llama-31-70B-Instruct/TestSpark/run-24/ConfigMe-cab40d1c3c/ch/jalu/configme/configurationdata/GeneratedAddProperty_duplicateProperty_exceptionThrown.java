package ch.jalu.configme.configurationdata;

public class GeneratedAddProperty_duplicateProperty_exceptionThrown {

    private PropertyListBuilder propertyListBuilder;

    private Property<String> property;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
        property = mock(Property.class);
    }

    @Test
    public void addProperty_duplicateProperty_exceptionThrown() {
        when(property.getPath()).thenReturn("DataSource.mysql");
        propertyListBuilder.add(property);

        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property));
    }

}