package ch.jalu.configme.configurationdata;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import ch.jalu.configme.configurationdata.PropertyListBuilder;
import ch.jalu.configme.exception.ConfigMeException;
import ch.jalu.configme.properties.Property;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class GeneratedTestGetRootEntriesWithExistingEntries {

    PropertyListBuilder propertyListBuilder = new PropertyListBuilder();

    @Test
    public void testGetRootEntriesWithExistingEntries() {
        propertyListBuilder.add(Mockito.mock(Property.class));
        Map<String, Object> rootEntries = propertyListBuilder.getRootEntries();
        assertNotNull(rootEntries);
        assertTrue(rootEntries instanceof LinkedHashMap);
        assertEquals(1, rootEntries.size());
    }

}