package ch.jalu.configme.configurationdata;

public class GeneratedTestCreate_empty {

    private PropertyListBuilder propertyListBuilder;

    @Before
    public void setup() {
        propertyListBuilder = new PropertyListBuilder();
    }

    @Test
    public void testCreate_empty() {
        List<Property<?>> result = propertyListBuilder.create();

        assertTrue(result.isEmpty());
    }

}