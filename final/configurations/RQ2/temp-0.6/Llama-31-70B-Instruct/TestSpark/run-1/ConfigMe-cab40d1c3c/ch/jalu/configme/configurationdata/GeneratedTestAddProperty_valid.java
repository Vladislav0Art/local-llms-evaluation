package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty_valid {

    private PropertyListBuilder builder;

    @Before
    public void setUp() {
        builder = new PropertyListBuilder();
    }

    @Test
    public void testAddProperty_valid() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        builder.add(property);

        assertTrue(builder.getRootEntries().containsKey("DataSource"));
    }

}