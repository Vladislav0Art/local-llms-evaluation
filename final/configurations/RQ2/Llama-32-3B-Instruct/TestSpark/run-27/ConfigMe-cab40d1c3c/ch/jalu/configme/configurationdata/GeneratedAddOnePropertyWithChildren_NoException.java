package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GeneratedAddOnePropertyWithChildren_NoException {

    @Test
    public void addOnePropertyWithChildren_NoException() throws ConfigMeException {
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntriesBefore = builder.getRootEntries();
        Property property = new Property("property", "value");
        List<Property> children = new ArrayList<>();
        children.add(new Property("child1", "value1"));
        children.add(new Property("child2", "value2"));
        property.setChildren(children);
        builder.add(property);
        Map<String, Object> rootEntriesAfter = builder.getRootEntries();
        assertEquals(rootEntriesBefore.size() + 1, rootEntriesAfter.size());
        assertTrue(rootEntriesAfter.containsKey("property"));
    }

}