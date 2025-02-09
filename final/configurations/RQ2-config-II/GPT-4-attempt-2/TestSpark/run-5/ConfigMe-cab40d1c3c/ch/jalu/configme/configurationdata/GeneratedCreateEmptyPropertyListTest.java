package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class GeneratedCreateEmptyPropertyListTest {

    @Test
    public void createEmptyPropertyListTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

        List<Property<?>> propertyList = propertyListBuilder.create();

        Assert.assertEquals(0, propertyList.size());
    }

}