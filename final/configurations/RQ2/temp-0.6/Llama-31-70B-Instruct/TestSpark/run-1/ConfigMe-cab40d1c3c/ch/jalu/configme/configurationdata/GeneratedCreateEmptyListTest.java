package ch.jalu.configme.configurationdata;

public class GeneratedCreateEmptyListTest {

    private PropertyListBuilder propertyListBuilder;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void createEmptyListTest() {
        List<Property<?>> propertyList = propertyListBuilder.create();

        assertThat(propertyList, notNullValue());
        assertThat(propertyList, empty());
    }

}