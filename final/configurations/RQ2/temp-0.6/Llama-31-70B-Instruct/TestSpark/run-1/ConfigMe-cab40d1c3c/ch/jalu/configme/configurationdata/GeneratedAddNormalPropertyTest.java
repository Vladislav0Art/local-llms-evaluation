package ch.jalu.configme.configurationdata;

public class GeneratedAddNormalPropertyTest {

    private PropertyListBuilder propertyListBuilder;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addNormalPropertyTest() {
        Property property = mock(Property.class);

        propertyListBuilder.add(property);

        verify(property).setConfigurable(true);
    }

}