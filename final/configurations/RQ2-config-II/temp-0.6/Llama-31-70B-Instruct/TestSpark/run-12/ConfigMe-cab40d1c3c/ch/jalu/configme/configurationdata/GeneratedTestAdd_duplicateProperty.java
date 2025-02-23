package ch.jalu.configme.configurationdata;

public class GeneratedTestAdd_duplicateProperty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAdd_duplicateProperty() {
        Property<?> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("testProperty");

        propertyListBuilder.add(mockProperty);
        propertyListBuilder.add(mockProperty);

        fail("Should have thrown ConfigMeException");
    }

}