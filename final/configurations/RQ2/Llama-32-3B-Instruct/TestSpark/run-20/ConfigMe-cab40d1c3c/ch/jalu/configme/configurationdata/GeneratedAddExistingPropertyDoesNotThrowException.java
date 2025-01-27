package ch.jalu.configme.configurationdata;

public class GeneratedAddExistingPropertyDoesNotThrowException {

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

}