package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty_duplicate {

    private PropertyListBuilder builder;

    @Before
    public void setUp() {
        builder = new PropertyListBuilder();
    }

    @Test
    public void testAddProperty_duplicate() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        builder.add(property);
        builder.add(property); // Should throw exception
    }

}