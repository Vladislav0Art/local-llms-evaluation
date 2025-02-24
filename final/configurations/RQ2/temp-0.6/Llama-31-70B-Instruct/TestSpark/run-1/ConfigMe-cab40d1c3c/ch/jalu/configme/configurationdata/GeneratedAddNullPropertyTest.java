package ch.jalu.configme.configurationdata;

public class GeneratedAddNullPropertyTest {

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

}