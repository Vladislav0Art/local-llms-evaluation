package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedTest {

    @Test
    public void addTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>();
        propertyListBuilder.add(property);
        Assert.assertEquals(propertyListBuilder.getRootEntries().get(""), property.getDefaultValue());
    }

    @Test
    public void addNullProperty() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = null;
        propertyListBuilder.add(property);
    }

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>();
        propertyListBuilder.add(property);
        List<Property<?>> propertyList = propertyListBuilder.create();
        Assert.assertEquals(propertyList.size(), 1);
        Assert.assertEquals(propertyList.get(0).getDefaultValue(), property.getDefaultValue());
    }

    @Test
    public void getRootEntriesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>();
        propertyListBuilder.add(property);
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        Assert.assertEquals(rootEntries.size(), 1);
        Assert.assertEquals(rootEntries.get(""), property.getDefaultValue());
    }

}