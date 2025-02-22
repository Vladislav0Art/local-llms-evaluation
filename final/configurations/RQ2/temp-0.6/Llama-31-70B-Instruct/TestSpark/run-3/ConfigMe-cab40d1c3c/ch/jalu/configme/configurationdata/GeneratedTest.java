package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addTest() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("testPath");
        propertyListBuilder.add(property);
        assertEquals(1, propertyListBuilder.getRootEntries().size());
    }

    @Test
    public void addPathAlreadyExistsTest() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("testPath");
        propertyListBuilder.add(property);
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property));
    }

    @Test
    public void createTest() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("testPath");
        propertyListBuilder.add(property);
        List<Property<?>> result = propertyListBuilder.create();
        assertEquals(1, result.size());
    }

}