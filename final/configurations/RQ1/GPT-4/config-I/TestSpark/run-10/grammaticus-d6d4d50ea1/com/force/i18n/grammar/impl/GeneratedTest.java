package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class GeneratedTest {

    @Test
    public void equalsTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        boolean isEqual = gramTermMap.equals(gramTermMap);
        Assert.assertTrue(isEqual);
    }

    @Test
    public void hashCodeTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertEquals(map.hashCode(), gramTermMap.hashCode());
    }

    @Test
    public void isSkinnyFalseTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(gramTermMap.isSkinny());
    }

    @Test
    public void isSkinnyTrueTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertTrue(gramTermMap.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> skinnyMap = (GrammaticalTermMapImpl<GrammaticalTerm>) gramTermMap.makeSkinny();
        Assert.assertTrue(skinnyMap.isSkinny());
    }

    @Test
    public void writeJsonNullTermsIncludeTest() throws IOException {
        HashSet<String> set = new HashSet<>();
        StringBuilder out = new StringBuilder();
        RenamingProvider renamingProvider = null;
        LanguageDictionary dictionary = null;
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        gramTermMap.writeJson(out, renamingProvider, dictionary, null);
        Assert.assertEquals("{}", out.toString());
    }

    @Test
    public void keySetTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertEquals(map.keySet(), gramTermMap.keySet());
    }

    @Test
    public void getTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertEquals(map.get("test"), gramTermMap.get("test"));
    }

    @Test
    public void containsKeyTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertEquals(map.containsKey("test"), gramTermMap.containsKey("test"));
    }

    @Test
    public void entrySetTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertEquals(map.entrySet(), gramTermMap.entrySet());
    }

    @Test
    public void valuesTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertEquals(map.values(), gramTermMap.values());
    }

    @Test
    public void putSkinnyExceptionTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, true);
        gramTermMap.put("Key", null);
    }

    @Test
    public void putAllSkinnyExceptionTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap1 = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap2 = new GrammaticalTermMapImpl<>(map, false);
        gramTermMap1.putAll(gramTermMap2);
    }

}