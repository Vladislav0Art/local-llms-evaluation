package ch.jalu.configme.configurationdata;

import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedGetRootEntriesEmptyTest {

    @Test
    public void getRootEntriesEmptyTest() {
        PropertyListBuilder propertyListBuilder = new PropertyListBuilder();
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertTrue(rootEntries.isEmpty());
    }

}