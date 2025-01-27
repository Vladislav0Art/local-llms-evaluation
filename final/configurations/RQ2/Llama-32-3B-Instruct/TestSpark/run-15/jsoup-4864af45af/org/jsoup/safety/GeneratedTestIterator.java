package org.jsoup.safety;

import org.junit.Test;

import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class GeneratedTestIterator {

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

}