package ch.jalu.configme.configurationdata;

public class GeneratedTestAddWithExistingPath {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void testAddWithExistingPath() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");
        propertyListBuilder.add(property);
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property));
    }

}