package ch.jalu.configme.configurationdata;

public class GeneratedCreateEmptyList {

    @Mock
    private List<Property<?>> properties;

    @InjectMocks
    private PropertyListBuilder propertyListBuilder;

    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void createEmptyList() {
        when(properties).thenReturn(new ArrayList<>());
        Object result = propertyListBuilder.create();
        assertNotNull(result);
        assertTrue((List<?>) result.isEmpty());
    }

}