package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntries_ValidMap_ReturnsValidMap {

    @Test
    public void getRootEntries_ValidMap_ReturnsValidMap() {
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        rootEntries.put("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(1, builder.getRootEntries().size());
        assertEquals(rootEntries, builder.getRootEntries());
    }

}