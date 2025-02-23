package ch.jalu.configme.configurationdata;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCreate_propertyAdded_listContainsProperty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
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