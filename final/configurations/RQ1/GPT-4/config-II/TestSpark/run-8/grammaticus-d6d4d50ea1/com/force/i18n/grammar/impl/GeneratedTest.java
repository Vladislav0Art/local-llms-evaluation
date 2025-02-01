package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedTest {

    @Test
    public void equalsIdenticalObjectTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        Assert.assertTrue(map.equals(map));
    }

    @Test
    public void equalsDifferentObjectTest() {
        GrammaticalTermMapImpl<String> map1 = new GrammaticalTermMapImpl();
        map1.put("key", "value");

        GrammaticalTermMapImpl<String> map2 = new GrammaticalTermMapImpl();
        map2.put("key", "value");

        Assert.assertTrue(map1.equals(map2));
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<String> skinnyMap = new GrammaticalTermMapImpl(new HashMap<>(), true);
        Assert.assertTrue(skinnyMap.isSkinny());

        GrammaticalTermMapImpl<String> notSkinnyMap = new GrammaticalTermMapImpl(new HashMap<>(), false);
        Assert.assertFalse(notSkinnyMap.isSkinny());
    }

    @Test
    public void putOnSkinnyMapTest() {
        GrammaticalTermMapImpl<String> skinnyMap = new GrammaticalTermMapImpl(new HashMap<>(), true);
        skinnyMap.put("key", "value");
    }

    @Test
    public void getTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl();
        map.put("key", "value");
        Assert.assertEquals("value", map.get("key"));
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("key", "value");
        Assert.assertTrue(map.containsKey("key"));
    }

    @Test
    public void entrySetTest() {
        Map<String, String> sourceMap = new HashMap<>();
        sourceMap.put("key1", "value1");
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl(sourceMap, false);
        Assert.assertEquals(sourceMap.entrySet(), map.entrySet());
    }

    @Test
    public void putAllOnSkinnyMapTest() {
        GrammaticalTermMapImpl<String> map1 = new GrammaticalTermMapImpl<>();
        map1.put("key", "value");

        GrammaticalTermMapImpl<String> skinnyMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        skinnyMap.putAll(map1);
    }

    @Test
    public void writeJsonWithTermsToIncludeTest() throws Exception {
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary languageDictionary = Mockito.mock(LanguageDictionary.class);
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun term = Mockito.mock(Noun.class);
        Mockito.when(term.getName()).thenReturn("term1");
        map.put("term1", term);

        Collection<String> termsToInclude = new HashSet<>(Arrays.asList("term1"));
        StringBuilder out = new StringBuilder();
        map.writeJson(out, renamingProvider, languageDictionary, termsToInclude);
    }

    @Test
    public void writeJsonWithoutTermsToIncludeTest() throws Exception {
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary languageDictionary = Mockito.mock(LanguageDictionary.class);
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun term = Mockito.mock(Noun.class);
        Mockito.when(term.getName()).thenReturn("term1");
        map.put("term1", term);

        StringBuilder out = new StringBuilder();
        map.writeJson(out, renamingProvider, languageDictionary, null);
    }

}