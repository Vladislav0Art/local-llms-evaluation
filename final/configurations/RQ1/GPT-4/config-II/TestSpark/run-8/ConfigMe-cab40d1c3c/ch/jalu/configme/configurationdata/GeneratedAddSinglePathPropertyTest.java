package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedAddSinglePathPropertyTest {

    @Test
    public void addSinglePathPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<Integer> property = new TestableProperty<>("sample.property");
        propertyListBuilder.add(property);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        Assert.assertEquals(1, rootEntries.size());
        Assert.assertTrue(rootEntries.containsKey("sample"));
    }

}