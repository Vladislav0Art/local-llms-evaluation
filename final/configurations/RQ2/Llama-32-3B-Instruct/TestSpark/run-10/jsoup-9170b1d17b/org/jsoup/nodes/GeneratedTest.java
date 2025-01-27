package org.jsoup.nodes;

import java.util.*;

public class GeneratedTest {

    private Map<String, Object> map = new HashMap<>();

    public void put(String key, String value) {
        map.put(key, value);
    }

    public boolean hasKey(String key) {
        return map.containsKey(key);
    }

    public Object get(String key) {
        return map.get(key);
    }

    public List<Attribute> asList() {
        List<Attribute> list = new ArrayList<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            list.add(new Attribute(entry.getKey(), entry.getValue()));
        }
        return list;
    }

    public Map<String, String> dataset() {
        Map<String, String> map = new HashMap<>();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            if (entry.getValue() instanceof String) {
                map.put(entry.getKey(), (String) entry.getValue());
            }
        }
        return map;
    }

    @Override
    public String toString() {
        return map.toString();
    }
}

class Attribute {
    private String key;
    private Object value;

    public Attribute(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    @Override
    public String toString() {
        return key + " - " + value;
    }
}

public class GeneratedTest {
    private Attributes annotations;

    public static void main(String[] args) throws Exception {
        MockitoAnnotations.initMocks(GeneratedTest.class);
    }

    @BeforeEach
    public void setup() {
        annotations = new Attributes();
    }

    @Test
    public void testAttributes() {
        annotations.put("key1", "value1");
        annotations.put("key2", 123);
        annotations.put("key3", true);

        System.out.println(annotations.get("key1"));
        System.out.println(annotations.get("key2"));
        System.out.println(annotations.get("key3"));

        List<Attribute> list = annotations.asList();
        for (Attribute attribute : list) {
            System.out.println(attribute.getKey() + " - " + attribute.getValue());
        }

        Map<String, String> map = annotations.dataset();
        System.out.println(map);

        // TODO: implement parse settings

        ParseSettings settings = new ParseSettings();

        List<Attribute> list2 = Arrays.asList(
                new Attribute("key1", "value1"),
                new Attribute("key2", 123),
                new Attribute("key3", true)
        );
        System.out.println(list2);
    }

}