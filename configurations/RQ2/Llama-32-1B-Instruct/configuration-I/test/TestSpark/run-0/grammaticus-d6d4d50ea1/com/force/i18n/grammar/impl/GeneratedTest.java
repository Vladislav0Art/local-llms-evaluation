package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.jupiter.api.Test;

public class GeneratedTest {

    public static void main(String[] args) {
        // ... (test setup and initialization)
    }

    @Test
    public void testEquals() {
        GrammaticalTermMapImpl<String, String> grammar = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String, String> otherGrammar = new GrammaticalTermMapImpl<>();
        assertEquals(grammar, otherGrammar);
    }

    @Test
    public void testHashCode() {
        GrammaticalTermMapImpl<String, String> grammar1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String, String> grammar2 = new GrammaticalTermMapImpl<>();
        assertEquals(0, grammar1.hashCode());
        assertEquals(0, grammar2.hashCode());
    }

    @Test
    public void testIsSkinny() {
        GrammaticalTermMapImpl<String, String> skinnyGrammar = new GrammaticalTermMapImpl<>();
        assertTrue(skinnyGrammar.isSkinny());

        GrammaticalTermMapImpl<String, String> skinnyGrammarNotSkinny = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertFalse(skinnyGrammarNotSkinny.isSkinny());
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

    @Test
    public void testWriteJson() {
        GrammaticalTermMapImpl<String, String> grammar = new GrammaticalTermMapImpl<>();
        Set<Map.Entry<String, String>> entrySet1 = new HashSet<>();
        entrySet1.add(new AbstractMap.SimpleEntry<>("key1", "value1"));
        Set<Map.Entry<String, String>> entrySet2 = new HashSet<>(entrySet1);
        entrySet2.add(new AbstractMap.SimpleEntry<>("key2", "value2"));

        Map<String, Object> map = new HashMap<>();
        map.put("keys", entrySet2);
        grammar.writeJson(System.out, null, I18nDictionary.INSTANCE, map);
    }

}