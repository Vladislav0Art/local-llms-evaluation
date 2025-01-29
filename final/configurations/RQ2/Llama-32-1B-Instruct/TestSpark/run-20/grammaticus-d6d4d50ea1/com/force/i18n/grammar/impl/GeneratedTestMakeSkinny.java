package com.force.i18n.grammar.impl;

public class GeneratedTestMakeSkinny {

    @Test
    public void testMakeSkinny() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");

        GrammaticalTermMap<T> mapInstance = new GrammaticalTermMapImpl<>(map);
        GrammaticalTermTermMapImpl<T> termMap = new GrammaticalTermTermMapImpl<>(mapInstance.makeSkinny());
        assertEquals(mapInstance, termMap);
    }

    private void setExpectedValue(GrammaticalTerm term, String expected) {
        // implement test to return correct value
    }
}

class GrammaticalTermTermMapImpl<T> implements GrammaticalTermMap<T>, Serializable {

    public static Map<String, GrammaticalTerm> createMap() {
        return new HashMap<>();
    }

    private GrammaticalTermTermMapImpl(Map<String, String> map) {
        // implementation
    }
}

class GrammaticalTerm {

    public void setExpectedValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) { /* implementation */ }

    @Override
    public int hashCode() { /* implementation */ }

    @Override
    public String toString() { /* implementation */
    }

}