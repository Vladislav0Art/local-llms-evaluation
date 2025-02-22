package ch.jalu.configme.configurationdata;

public class GeneratedTestCreate {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void testCreate() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");
        propertyListBuilder.add(property);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

}