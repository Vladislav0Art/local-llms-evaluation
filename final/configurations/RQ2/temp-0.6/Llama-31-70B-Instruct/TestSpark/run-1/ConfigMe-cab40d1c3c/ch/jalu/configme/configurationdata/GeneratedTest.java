package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void addNullPropertyTest() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Property cannot be null");

        propertyListBuilder.add(null);
    }

    @Test
    public void addNormalPropertyTest() {
        Property property = mock(Property.class);

        propertyListBuilder.add(property);

        verify(property).setConfigurable(true);
    }

    @Test
    public void createEmptyListTest() {
        List<Property<?>> propertyList = propertyListBuilder.create();

        assertThat(propertyList, notNullValue());
        assertThat(propertyList, empty());
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