package ch.jalu.configme.configurationdata;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedAddProperty_propertyAlreadyExists_throwsException {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addProperty_propertyAlreadyExists_throwsException() {
        final Property<?> property = mock(Property.class);
        when(property.getPath()).thenReturn("DataSource.mysql");

        propertyListBuilder.add(property);
        propertyListBuilder.add(property);
    }

}