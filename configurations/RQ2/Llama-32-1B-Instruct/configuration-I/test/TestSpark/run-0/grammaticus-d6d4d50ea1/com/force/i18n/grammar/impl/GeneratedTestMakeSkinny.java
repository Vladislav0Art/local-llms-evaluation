package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.jupiter.api.Test;

public class GeneratedTestMakeSkinny {

    public static void main(String[] args) {
        // ... (test setup and initialization)
    }

    @Test
    public void testMakeSkinny() {
        GrammaticalTermMapImpl<String, String> grammar = new GrammaticalTermMapImpl<>();
        Set<String> keySet = grammar.keySet();
        assertTrue(keySet.contains("key1"));
        assertTrue(keySet.contains("key2"));

        Set<String> skinnyKeySet = grammar.makeSkinny().keySet();
        assertTrue(skinnyKeySet.contains("key1"));
        assertTrue(skinnyKeySet.contains("key2"));

        // Test that adding more keys still doesn't change the set
        Set<String> originalKeySet = new HashSet<>(keySet);
        Set<String> skinnyKeySetAfterAddingMoreKeys = skinnyKeySet;
        grammar.addKey("key3");
        skinnyKeySetAfterAddingMoreKeys = skinnyKeySetAfterAddingMoreKeys;
        assertTrue(originalKeySet.containsAll(skinnyKeySetAfterAddingMoreKeys));
    }

}