package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestCreateMap {

    private String term;

    public GrammaticalTerm(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }
}

public class MapUtil {

    public static <K, V> Map<K, V> createMap() {
        return new HashMap<>();
    }

    public static void printMap(Map<String, GrammaticalTerm> map) {
        for (Map.Entry<String, GrammaticalTerm> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue().getTerm());
        }
    }
}

public class TClass {

    private String term;

    public TClass(String term) {
        this.term = term;
    }

    public String getTerm() {
        return term;
    }
}

import org.junit.Test;
import static org.junit.Assert .*;

public class TestClass {

    @Test
    public void testCreateMap() {
        Map<String, GrammaticalTerm> map = MapUtil.createMap();
        assertNotNull(map);
    }

}