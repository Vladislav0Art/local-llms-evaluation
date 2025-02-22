package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void testAdd() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");
        propertyListBuilder.add(property);
        assertTrue(propertyListBuilder.getRootEntries().containsKey("test"));
    }

    @Test
    public void testAddWithExistingPath() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");
        propertyListBuilder.add(property);
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property));
    }

    @Test
    public void testCreate() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("test");
        propertyListBuilder.add(property);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

    @Test
    public void testCreateWithEmptyList() {
        List<Property<?>> result = propertyListBuilder.create();
        assertTrue(result.isEmpty());
    }

}