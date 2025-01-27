package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedTestAddOneProperty_NoException {

    @Test
    public void testAddOneProperty_NoException() throws ConfigMeException {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntriesBefore = builder.getRootEntries();
        Property property = new Property("property", "value");
        builder.add(property);
        Map<String, Object> rootEntriesAfter = builder.getRootEntries();
        assertEquals(rootEntriesBefore.size() + 1, rootEntriesAfter.size());
        assertTrue(rootEntriesAfter.containsKey("property"));
    }

}