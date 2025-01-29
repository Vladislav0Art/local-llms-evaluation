package ch.jalu.configme.configurationdata;

public class GeneratedTestLinkedHashMap {

    @Test
    public void testLinkedHashMap() {
        TestLinkedHashMap linkedMap = new TestLinkedHashMap();
        linkedMap.linkedMap.put("key1", "value1");
        assertEquals("value1", linkedMap.linkedMap.get("key1"));
    }
}

class TestPublicClass {
    public String publicMethod() {
        return "hello";
    }
}

class TestMap {
    private Map<String, Object> map = new HashMap<>();

    public void mapPut(String key, Object value) {
        map.put(key, value);
    }

    public Object mapGet(String key) {
        return map.get(key);
    }
}

class TestLinkedHashMap {
    private LinkedHashMap<String, Object> linkedMap = new LinkedHashMap<>();

    public void linkedMapPut(String key, Object value) {
        linkedMap.put(key, value);
    }

    public Object linkedMapGet(String key) {
        return linkedMap.get(key);
    }

}