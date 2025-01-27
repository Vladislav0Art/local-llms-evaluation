package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    @Mock
    private List<Property<?>> properties;

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void addExistingPropertyDoesNotThrowException() {
        when(properties).thenReturn(new ArrayList<>());
        try {
            propertyListBuilder.add(new Property<>());
            assertEquals(0, properties.size());
        } catch (ConfigMeException e) {
            fail("Expected no exception");
        }
    }

    @Test
    public void addNullPropertyThrowsException() {
        when(properties).thenReturn(new ArrayList<>());
        try {
            propertyListBuilder.add(null);
            fail("Expected ConfigMeException");
        } catch (ConfigMeException e) {
            assertEquals(ConfigMeException.class, e.getClass());
        }
    }

    @Test
    public void createEmptyList() {
        when(properties).thenReturn(new ArrayList<>());
        Object result = propertyListBuilder.create();
        assertNotNull(result);
        assertTrue((List<?>) result.isEmpty());
    }

    @Test
    public void createNonEmptyList() {
        List<Property<?>> expectedProperties = new ArrayList<>();
        expectedProperties.add(new Property<>());
        when(properties).thenReturn(expectedProperties);
        Object result = propertyListBuilder.create();
        assertNotNull(result);
        assertFalse(((List<?>) result).isEmpty());
    }

    @Test
    public void createNonEmptyListWithMultipleProperties() {
        List<Property<?>> expectedProperties = new ArrayList<>();
        expectedProperties.add(new Property<>());
        expectedProperties.add(new Property<>());
        when(properties).thenReturn(expectedProperties);
        Object result = propertyListBuilder.create();
        assertNotNull(result);
        assertFalse(((List<?>) result).isEmpty());
    }

}