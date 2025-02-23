package ch.jalu.configme.configurationdata;

public class GeneratedTestAdd_validProperty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testAdd_validProperty() {
        Property<?> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("testProperty");

        propertyListBuilder.add(mockProperty);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.containsKey("testProperty"));
        assertEquals(mockProperty, rootEntries.get("testProperty"));
    }

}