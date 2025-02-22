package ch.jalu.configme.configurationdata;

public class GeneratedCreateTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
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