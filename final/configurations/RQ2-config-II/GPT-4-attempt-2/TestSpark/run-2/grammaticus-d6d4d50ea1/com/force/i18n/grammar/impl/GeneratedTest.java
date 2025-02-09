package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertEquals(termMap, termMap);
    }

    @Test
    public void equalsDifferentObjectTypeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertNotEquals(termMap, new Object());
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertEquals(termMap.hashCode(), termMap.hashCode());
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertFalse(termMap.isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        termMap.writeJson(new StringBuilder(), renamingProvider, dictionary, null);
    }

    @Test
    public void getTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertNull(termMap.get("name"));
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertFalse(termMap.containsKey("name"));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.isEmpty());
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("name", Mockito.mock(GrammaticalTerm.class));
        Assert.assertFalse(termMap.isEmpty());
    }

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        termMap1.putAll(termMap2);
        Assert.assertTrue(termMap1.isEmpty());
    }

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.keySet().isEmpty());
    }

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.entrySet().isEmpty());
    }

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.values().isEmpty());
    }

}