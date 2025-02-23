package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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

    @Test
    public void testAdd_duplicateProperty() {
        Property<?> mockProperty = mock(Property.class);
        when(mockProperty.getPath()).thenReturn("testProperty");

        propertyListBuilder.add(mockProperty);
        propertyListBuilder.add(mockProperty);

        fail("Should have thrown ConfigMeException");
    }

    @Test
    public void testCreate_empty() {
        List<Property<?>> result = propertyListBuilder.create();

        assertTrue(result.isEmpty());
    }

    @Test
    public void testCreate_nonEmpty() {
        Property<?> mockProperty1 = mock(Property.class);
        when(mockProperty1.getPath()).thenReturn("testProperty1");
        propertyListBuilder.add(mockProperty1);

        Property<?> mockProperty2 = mock(Property.class);
        when(mockProperty2.getPath()).thenReturn("testProperty2");
        propertyListBuilder.add(mockProperty2);

        List<Property<?>> result = propertyListBuilder.create();

        assertEquals(2, result.size());
        assertEquals(mockProperty1, result.get(0));
        assertEquals(mockProperty2, result.get(1));
    }

}