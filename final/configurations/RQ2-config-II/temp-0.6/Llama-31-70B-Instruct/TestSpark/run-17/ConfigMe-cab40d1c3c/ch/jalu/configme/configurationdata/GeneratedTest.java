package ch.jalu.configme.configurationdata;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_propertyAdded_propertyFoundInMap() {
        final Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        propertyListBuilder.add(property);

        assertTrue(propertyListBuilder.getRootEntries().containsKey("DataSource.mysql"));
    }

    @Test
    public void addProperty_propertyAlreadyExists_throwsException() {
        final Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

    @Test
    public void create_noPropertiesAdded_emptyListReturned() {
        assertTrue(propertyListBuilder.create().isEmpty());
    }

    @Test
    public void create_propertyAdded_listContainsProperty() {
        final Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        propertyListBuilder.add(property);
        List<Property<?>> result = propertyListBuilder.create();

        assertEquals(1, result.size());
        assertEquals(property, result.get(0));
    }

}