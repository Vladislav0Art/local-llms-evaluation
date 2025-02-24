package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addTest() {
        Property<?> property = mock(Property.class);
        propertyListBuilder.add(property);
    }

    @Test
    public void addNullTest() {
        Property<?> property = null;
        propertyListBuilder.add(property);
    }

}