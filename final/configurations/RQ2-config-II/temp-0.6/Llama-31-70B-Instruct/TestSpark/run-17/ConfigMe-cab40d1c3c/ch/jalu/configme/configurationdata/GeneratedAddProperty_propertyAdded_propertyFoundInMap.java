package ch.jalu.configme.configurationdata;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty_propertyAdded_propertyFoundInMap {

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

}