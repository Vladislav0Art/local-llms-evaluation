package ch.jalu.configme.configurationdata;

public class GeneratedCreateListWithOnePropertyTest {

    private PropertyListBuilder propertyListBuilder;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void createListWithOnePropertyTest() {
        Property property = mock(Property.class);
        propertyListBuilder.add(property);

        List<Property<?>> propertyList = propertyListBuilder.create();

        assertThat(propertyList, notNullValue());
        assertThat(propertyList.size(), is(1));
        assertThat(propertyList.get(0), equalTo(property));
    }

}