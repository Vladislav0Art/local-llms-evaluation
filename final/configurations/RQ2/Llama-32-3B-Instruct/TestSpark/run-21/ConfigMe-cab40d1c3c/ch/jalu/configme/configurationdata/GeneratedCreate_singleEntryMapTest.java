package ch.jalu.configme.configurationdata;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class GeneratedCreate_singleEntryMapTest {

    @Test
    public void create_singleEntryMapTest() {
        Map<String, Object> map = new LinkedHashMap<>();
        map.put("test", "value");
        PropertyListBuilder builder = new PropertyListBuilder();
        List<Property<?>> result = builder.create(map);
        assertEquals(1, result.size());
        assertEquals("value", result.get(0).getValue("test"));
    }

}