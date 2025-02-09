package org.jsoup.safety;

import org.jsoup.Jsoup;

import java.util.*;

public class GeneratedTest {

    @Test
    public void testEmptySafelist() {
        Safelist safelist = new Safelist();
        assertTrue(safelist.isEmpty());
    }

    @Test
    public void testContainsKey() {
        Attributes attributes = new Attributes();
        Set<String> key = new HashSet<>();
        key.add("attribute");
        assertTrue(attributes.containsKey(key));
    }
}

class Safelist {
    private List<Attribute> safelist;

    public Safelist() {
        this.safelist = new ArrayList<>();
    }

    public boolean isEmpty() {
        return safelist.isEmpty();
    }

    public Map<String, Set<String>> getEnforcedAttributes(String tag) {
        Map<String, Set<String>> result = new HashMap<>();
        result.put(tag, new HashSet<>());
        return result;
    }
}

class Attribute {
}

public class Attributes {
    private List<String> attributes;

    public Attributes() {
        this.attributes = new ArrayList<>();
    }

    public boolean containsKey(String key) {
        return attributes.contains(key);
    }

}