package ch.jalu.configme.configurationdata;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = Mockito.mock(Property.class);
        propertyListBuilder.add(property);
        Assert.assertTrue(propertyListBuilder.getRootEntries().containsKey(property.getPath()));
    }

}