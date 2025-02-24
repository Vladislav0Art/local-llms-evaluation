package ch.jalu.configme.configurationdata;

public class GeneratedCreateTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void createTest() throws Exception {
        List<Property<?>> propertyList = propertyListBuilder.create();

        assertNotNull(propertyList);
        assertTrue(propertyList instanceof ArrayList);
    }

}