package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

public class GeneratedCollectEntries_NestedMapEntry_ReturnsAllSubentries {

    @Test
    public void collectEntries_NestedMapEntry_ReturnsAllSubentries() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("key", "nestedValue");
        ((Map<String, Object>) map.get("key")).put("subKey", "subValue");
        List<Property<?>> result = new ArrayList<>();
        PropertyListBuilder collector = new PropertyListBuilder();
        collector.collectEntries(map, result);
        assertEquals(2, result.size());
    }

}