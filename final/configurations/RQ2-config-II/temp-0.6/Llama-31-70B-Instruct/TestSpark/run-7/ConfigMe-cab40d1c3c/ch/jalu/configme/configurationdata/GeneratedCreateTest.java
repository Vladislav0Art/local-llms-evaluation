package ch.jalu.configme.configurationdata;

import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

public class GeneratedCreateTest {

    @Test
    public void createTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new Property<>();
        propertyListBuilder.add(property);
        List<Property<?>> propertyList = propertyListBuilder.create();
        Assert.assertEquals(propertyList.size(), 1);
        Assert.assertEquals(propertyList.get(0).getDefaultValue(), property.getDefaultValue());
    }

}