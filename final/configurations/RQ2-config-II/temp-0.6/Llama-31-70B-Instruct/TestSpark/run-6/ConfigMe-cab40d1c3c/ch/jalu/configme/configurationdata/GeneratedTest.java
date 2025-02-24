package ch.jalu.configme.configurationdata;

public class GeneratedTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addValidPropertyTest() {
        Property property = Mockito.mock(Property.class);
        propertyListBuilder = new PropertyListBuilder();

        propertyListBuilder.add(property);

        Assert.assertEquals(1, propertyListBuilder.create().size());
    }

}