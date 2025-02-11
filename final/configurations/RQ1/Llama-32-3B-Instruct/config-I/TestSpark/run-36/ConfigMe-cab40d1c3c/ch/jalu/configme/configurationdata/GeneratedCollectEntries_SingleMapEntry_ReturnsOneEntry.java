package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCollectEntries_SingleMapEntry_ReturnsOneEntry {

    @Test
    public void collectEntries_SingleMapEntry_ReturnsOneEntry() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("key", "value");
        List<Property<?>> result = new ArrayList<>();
        PropertyListBuilder collector = new PropertyListBuilder();
        collector.collectEntries(map, result);
        assertEquals(1, result.size());
    }

}