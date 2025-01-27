package com.force.i18n.grammar.impl;

public class GeneratedTestGrammaticalTermMapImplValues {

    private Map<String, Object> map;

    public GrammaticalTermMapImpl() {
        this.map = new HashMap<>();
    }

    public void put(String key, Object value) {
        map.put(key, value);
    }

    public Set<Map.Entry<String, Object>> entrySet() {
        return map.entrySet();
    }

    public Collection<Object> values() {
        return map.values();
    }
}

public class GrammaticalTermMapImplTest {

    @Test
    public void testGrammaticalTermMapImplValues() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        Map<String, Object> map1 = new HashMap<>();
        map.put("key1", "value1");
        Collection<Object> values = map.values();
        assertEquals(2L, (long) values.size());
    }

}