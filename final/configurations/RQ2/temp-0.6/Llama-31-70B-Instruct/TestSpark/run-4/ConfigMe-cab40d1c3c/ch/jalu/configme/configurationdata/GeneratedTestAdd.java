package ch.jalu.configme.configurationdata;

public class GeneratedTestAdd {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void testAdd() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");
        propertyListBuilder.add(property);
        assertTrue(propertyListBuilder.getRootEntries().containsKey("test"));
    }

}