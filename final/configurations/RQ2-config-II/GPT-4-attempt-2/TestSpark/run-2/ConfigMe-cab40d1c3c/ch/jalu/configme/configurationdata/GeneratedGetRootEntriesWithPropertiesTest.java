package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetRootEntriesWithPropertiesTest {

    @Test
    public void getRootEntriesWithPropertiesTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property1 = new Property<>("TestKey1", "TestValue1");
        Property<?> property2 = new Property<>("TestKey2", "TestValue2");

        propertyListBuilder.add(property1);
        propertyListBuilder.add(property2);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertEquals(2, rootEntries.size());
        assertTrue(rootEntries.containsKey("TestKey1"));
        assertTrue(rootEntries.containsKey("TestKey2"));
        assertEquals("TestValue1", rootEntries.get("TestKey1"));
        assertEquals("TestValue2", rootEntries.get("TestKey2"));
    }

}