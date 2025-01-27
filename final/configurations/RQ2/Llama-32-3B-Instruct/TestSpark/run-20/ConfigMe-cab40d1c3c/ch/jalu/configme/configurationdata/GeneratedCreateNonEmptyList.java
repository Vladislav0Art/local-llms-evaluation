package ch.jalu.configme.configurationdata;

public class GeneratedCreateNonEmptyList {

    @Mock
    private List<Property<?>> properties;

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    public void setup() {
        MockitoAnnotations.initMocks(this);
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

}