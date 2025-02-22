package ch.jalu.configme.configurationdata;

public class GeneratedAddPathAlreadyExistsTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addPathAlreadyExistsTest() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("testPath");
        propertyListBuilder.add(property);
        assertThrows(ConfigMeException.class, () -> propertyListBuilder.add(property));
    }

}