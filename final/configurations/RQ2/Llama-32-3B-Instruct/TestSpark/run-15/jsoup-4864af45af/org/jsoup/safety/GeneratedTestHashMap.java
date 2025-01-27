package org.jsoup.safety;

import org.junit.Test;

import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class GeneratedTestHashMap {

    @Test
    public void testHashMap() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        assert map.size() == 2;
        assert map.get("key1").equals("value1") || map.get("key2").equals("value2");
    }

}