package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedAddAndGetRootEntriesTest {

    @Test
    public void addAndGetRootEntriesTest() {
        Property<String> property = new Property<>("my.path", "test");
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        propertyListBuilder.add(property);

        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertNotNull(rootEntries);
        assertTrue(rootEntries.containsValue(property));
    }

}