package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedAddMultiplePropertiesTest {

    @Test
    public void addMultiplePropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property1 = new Property<>("TestKey1", "TestValue1");
        Property<?> property2 = new Property<>("TestKey2", "TestValue2");

        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);

        List<Property<?>> propertyList = propertyListBuilder.create();
        assertEquals(2, propertyList.size());
        assertTrue(propertyList.contains(property1));
        assertTrue(propertyList.contains(property2));
    }

}