package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetRootEntriesEmptyTest {

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> entries = builder.getRootEntries();
        assertTrue("Created Map should be empty", entries.isEmpty());
    }

}