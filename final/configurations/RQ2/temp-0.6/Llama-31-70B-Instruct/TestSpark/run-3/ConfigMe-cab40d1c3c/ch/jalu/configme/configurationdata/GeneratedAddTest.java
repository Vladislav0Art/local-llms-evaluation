package ch.jalu.configme.configurationdata;

public class GeneratedAddTest {

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

}