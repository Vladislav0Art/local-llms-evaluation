package ch.jalu.configme.configurationdata;

public class GeneratedAddValidPropertyTest {

    private PropertyListBuilder propertyListBuilder;

    @Test
    public void addValidPropertyTest() {
        Property property = Mockito.mock(Property.class);
        propertyListBuilder = new PropertyListBuilder();

        propertyListBuilder.add(property);

        Assert.assertEquals(1, propertyListBuilder.create().size());
    }

}