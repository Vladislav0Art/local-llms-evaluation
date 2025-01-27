package ch.jalu.configme.configurationdata;

public class GeneratedCreateNonEmptyListWithMultipleProperties {

    @Mock
    private List<Property<?>> properties;

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    public void setup() {
        MockitoAnnotations.initMocks(this);
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