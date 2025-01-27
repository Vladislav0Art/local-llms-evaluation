package com.force.i18n.grammar.impl;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void testGmm() {
        // Create a new HashMap to store the grammatical matrix
        Map<String, GrammaticalMatrix> gmm = new HashMap<>();

        // Add some entries to the map
        gmm.put("test1", new GrammaticalMatrix());
        gmm.put("test2", new GrammaticalMatrix());

        // Now we can use the map like this
    }

}

class GrammaticalMatrix {
    private String value;

    public GrammaticalMatrix() {
        this.value = "";
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}