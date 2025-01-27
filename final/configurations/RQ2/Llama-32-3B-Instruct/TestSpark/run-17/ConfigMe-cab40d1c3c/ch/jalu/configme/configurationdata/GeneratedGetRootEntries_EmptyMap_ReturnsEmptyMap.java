package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GeneratedGetRootEntries_EmptyMap_ReturnsEmptyMap {

    @Test
    public void getRootEntries_EmptyMap_ReturnsEmptyMap() {
        Map<String, Object> rootEntries = new LinkedHashMap<>();
        PropertyListBuilder builder = new PropertyListBuilder();
        assertEquals(0, builder.getRootEntries().size());
    }

}