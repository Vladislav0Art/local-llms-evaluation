package ch.jalu.configme.configurationdata;

public class GeneratedTest {

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

    @Test
    public void testAddProperty_duplicate() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        builder.add(property);
        builder.add(property); // Should throw exception
    }

    @Test
    public void testAddProperty_invalidPath() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql.password");

        builder.add(property); // Should throw exception
    }

    @Test
    public void testCreate_valid() {
        Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        builder.add(property);

        List<Property<?>> result = builder.create();
        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

}