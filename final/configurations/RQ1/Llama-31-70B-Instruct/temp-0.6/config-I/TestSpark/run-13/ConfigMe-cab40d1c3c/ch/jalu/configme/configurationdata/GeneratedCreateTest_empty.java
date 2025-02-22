package ch.jalu.configme.configurationdata;

public class GeneratedCreateTest_empty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setUp() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void createTest_empty() {
        List<Property<?>> result = propertyListBuilder.create();
        assertTrue(result.isEmpty());
    }

}