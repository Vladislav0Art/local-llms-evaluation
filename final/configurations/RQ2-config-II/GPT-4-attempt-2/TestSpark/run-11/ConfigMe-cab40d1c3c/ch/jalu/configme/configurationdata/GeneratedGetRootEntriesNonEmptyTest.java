package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.*;

public class GeneratedGetRootEntriesNonEmptyTest {

    @Test
    public void getRootEntriesNonEmptyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        builder.add(new Property<>("property", "default"));
        Map<String, Object> rootEntries = builder.getRootEntries();
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.containsKey("property"));
        assertEquals("default", rootEntries.get("property"));
    }

}