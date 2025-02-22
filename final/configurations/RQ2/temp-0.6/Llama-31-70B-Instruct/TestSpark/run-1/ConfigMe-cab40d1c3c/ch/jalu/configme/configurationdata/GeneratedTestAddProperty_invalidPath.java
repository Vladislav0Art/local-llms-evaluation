package ch.jalu.configme.configurationdata;

public class GeneratedTestAddProperty_invalidPath {

    private PropertyListBuilder builder;

    @Before
    public void setUp() {
        builder = new PropertyListBuilder();
    }

    @Test
    public void testAddProperty_invalidPath() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql.password");

        builder.add(property); // Should throw exception
    }

}