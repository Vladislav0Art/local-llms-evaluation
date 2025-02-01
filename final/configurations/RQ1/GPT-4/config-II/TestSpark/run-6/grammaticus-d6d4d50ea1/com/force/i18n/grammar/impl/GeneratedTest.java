package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

public class GeneratedTest {

    @Test
    public void constructorEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertNotNull(termMap);
        Assert.assertTrue(termMap.isEmpty());
    }

    @Test
    public void constructorMapTest() {
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(termMap, false);
        Assert.assertNotNull(grammaticalTermMap);
        Assert.assertTrue(grammaticalTermMap.isEmpty());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, GrammaticalTerm> termMap = Mockito.mock(Map.class);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(termMap, false);
        GrammaticalTermMapImpl<GrammaticalTerm> skinnyTermMap = grammaticalTermMap.makeSkinny();
        Assert.assertTrue(skinnyTermMap.isSkinny());
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test_key", "test_value");
        Assert.assertEquals("test_value", termMap.get("test_key"));
    }

    @Test
    public void putInSkinnyMapTest() {
        Map<String, String> map = new HashMap<>();
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, true);
        termMap.put("test_key", "test_value");
    }

    @Test
    public void writeJsonTest() throws IOException {
        Appendable out = new StringBuilder();
        RenamingProvider provider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Noun term = Mockito.mock(Noun.class);
        Mockito.when(term.getName()).thenReturn("Noun");
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("Noun", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        termMap.writeJson(out, provider, dictionary, null);
        Assert.assertTrue(out.toString().contains("\"noun\":"));
    }

    @Test
    public void equalsTest() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 100);
        GrammaticalTermMapImpl<Integer> termMap1 = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<Integer> termMap2 = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertTrue(termMap1.equals(termMap2));
    }

    @Test
    public void hashCodeTest() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 100);
        GrammaticalTermMapImpl<Integer> termMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertEquals(termMap.hashCode(), termMap.hashCode());
    }

}