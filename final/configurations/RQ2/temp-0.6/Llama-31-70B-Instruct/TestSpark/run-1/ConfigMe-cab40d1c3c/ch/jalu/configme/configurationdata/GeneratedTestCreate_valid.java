package ch.jalu.configme.configurationdata;

public class GeneratedTestCreate_valid {

    private PropertyListBuilder builder;

    @Before
    public void setUp() {
        builder = new PropertyListBuilder();
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