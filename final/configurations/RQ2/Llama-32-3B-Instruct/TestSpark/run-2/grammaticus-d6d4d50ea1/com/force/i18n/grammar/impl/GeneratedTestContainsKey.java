package com.force.i18n.grammar.impl;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTestContainsKey {

    private final String term;

    public GrammaticalTerm(String term) {
        this.term = term;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrammaticalTerm that = (GrammaticalTerm) o;
        return Objects.equals(term, that.term);
    }

    @Override
    public int hashCode() {
        return term.hashCode();
    }
}

public class GrammaticalTermMapImpl {
    private final Map<String, GrammaticalTerm> map;

    public GrammaticalTermMapImpl() {
        this.map = new HashMap<>();
    }

    public void put(String key, GrammaticalTerm value) {
        if (value == null) {
            throw new NullPointerException("Value cannot be null");
        }
        map.put(key, value);
    }

    public GrammaticalTerm get(String key) {
        return map.get(key);
    }

    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    public void remove(String key) {
        map.remove(key);
    }
}

public class GrammaticalTermMapTest {
    private final GrammaticalTermMapImpl grammaticalTermMap;

    @Before
    public void setUp() {
        this.grammaticalTermMap = new GrammaticalTermMapImpl();
    }

    @Test
    public void testContainsKey() {
        String key = "test";
        GrammaticalTerm term = new GrammaticalTerm(key);
        grammaticalTermMap.put(key, term);

        assertTrue(grammaticalTermMap.containsKey(key));
    }

}