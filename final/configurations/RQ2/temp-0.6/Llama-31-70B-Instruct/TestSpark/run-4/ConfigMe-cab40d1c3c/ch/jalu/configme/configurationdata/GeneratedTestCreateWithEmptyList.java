package ch.jalu.configme.configurationdata;

public class GeneratedTestCreateWithEmptyList {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void testCreateWithEmptyList() {
        List<Property<?>> result = propertyListBuilder.create();
        assertTrue(result.isEmpty());
    }

}