package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class GeneratedAddPropertyTest {

    @Test
    public void addPropertyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Property<?> property = new PropertyStub("test.value");

        propertyListBuilder.add(property);

        Map<String, Object> entries = propertyListBuilder.getRootEntries();
        assertTrue(entries.containsKey("test"));

        Object rootEntry = entries.get("test");
        assertTrue(rootEntry instanceof Map);

        Map<String, Object> innerEntries = (Map<String, Object>) rootEntry;
        assertTrue(innerEntries.containsKey("value"));
    }

}