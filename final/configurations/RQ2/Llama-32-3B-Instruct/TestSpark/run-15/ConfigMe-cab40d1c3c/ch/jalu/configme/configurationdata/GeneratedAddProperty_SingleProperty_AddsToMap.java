package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedAddProperty_SingleProperty_AddsToMap {

    @Test
    public void addProperty_SingleProperty_AddsToMap() {
        Property property = new Property();
        PropertyListBuilder builder = new PropertyListBuilder();
        Map<String, Object> rootEntries = builder.getRootEntries();

        builder.add(property);

        assertNotNull(rootEntries);
        assertEquals(1, rootEntries.size());
        assertTrue(rootEntries.containsKey(property.getName()));
    }

}