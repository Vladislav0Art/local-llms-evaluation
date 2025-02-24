package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedAddTest {

    @Test
    public void addTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>();
        propertyListBuilder.add(property);
        Assert.assertEquals(propertyListBuilder.getRootEntries().get(""), property.getDefaultValue());
    }

}