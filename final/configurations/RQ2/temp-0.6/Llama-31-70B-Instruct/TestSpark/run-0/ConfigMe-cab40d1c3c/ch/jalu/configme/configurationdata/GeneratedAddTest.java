package ch.jalu.configme.configurationdata;

public class GeneratedAddTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addTest() {
        Property<?> property = mock(Property.class);
        propertyListBuilder.add(property);
    }

}