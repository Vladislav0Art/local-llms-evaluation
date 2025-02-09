package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetRootEntriesNonEmptyTest {

    @Test
    public void getRootEntriesNonEmptyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Property<Object> property1 = new Property<Object>("mockPath", 890);
        builder.add(property1);
        Map<String, Object> entries = builder.getRootEntries();
        assertEquals("Map should have one entry", 1, entries.size());
        assertTrue("Map should contain the property's path", entries.containsKey(property1.getPath()));
    }

}