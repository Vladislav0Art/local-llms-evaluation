package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_MultipleProperties_AddsToMap {

    @Test
    public void addProperty_MultipleProperties_AddsToMap() {
        Property property1 = new Property();
        Property property2 = new Property();
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();

        builder.add(property1);
        builder.add(property2);

        assertNotNull(rootEntries);
        assertEquals(2, rootEntries.size());
        assertTrue(rootEntries.containsKey(property1.getName()));
        assertTrue(rootEntries.containsKey(property2.getName()));
    }

}