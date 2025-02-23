package ch.jalu.configme.configurationdata;

public class GeneratedTestCreate_nonEmpty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
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