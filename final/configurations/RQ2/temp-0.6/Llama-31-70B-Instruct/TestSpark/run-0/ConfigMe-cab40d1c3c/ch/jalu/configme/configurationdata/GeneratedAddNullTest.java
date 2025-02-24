package ch.jalu.configme.configurationdata;

public class GeneratedAddNullTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addNullTest() {
        Property<?> property = null;
        propertyListBuilder.add(property);
    }

}