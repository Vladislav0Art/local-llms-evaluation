package org.jsoup.safety;

import org.junit.Test;

import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void testSet() {
        Set<String> set = new java.util.HashSet<>();
        set.add("1");
        set.add("2");
        assert set.size() == 2;
    }

    @Test
    public void testIterator() {
        Iterator<String> iterator = new java.util.HashMap<String, String>() {{
            put("1", "value1");
            put("2", "value2");
        }}.values().iterator();
        while (iterator.hasNext()) {
            assert iterator.next().equals("value1") || iterator.next().equals("value2");
        }
    }

    @Test
    public void testHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assert map.size() == 2;
        assert map.get("key1").equals("value1") || map.get("key2").equals("value2");
    }

}