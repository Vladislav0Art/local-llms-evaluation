package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GeneratedTest {

    @Test
    public void equalsAndHashCodeTest() {
        GrammaticalTermMapImpl map1 = new GrammaticalTermMapImpl();
        GrammaticalTermMapImpl map2 = new GrammaticalTermMapImpl();
        Assert.assertEquals(map1, map2);
        Assert.assertEquals(map1.hashCode(), map2.hashCode());

        Noun noun = Mockito.mock(Noun.class);
        Map<String, Noun> nounMap = new HashMap<>();
        nounMap.put("noun", noun);

        map1 = new GrammaticalTermMapImpl(nounMap, false);
        map2 = new GrammaticalTermMapImpl(nounMap, true);
        Assert.assertNotEquals(map1, map2);
        Assert.assertNotEquals(map1.hashCode(), map2.hashCode());
    }

    @Test
    public void getTest() {
        Noun noun = Mockito.mock(Noun.class);
        Map<String, Noun> nounMap = new HashMap<>();
        nounMap.put("noun", noun);
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(nounMap, false);
        Assert.assertEquals(noun, map.get("noun"));
        Assert.assertNull(map.get("non_existent_key"));
    }

    @Test
    public void containsKeyTest() {
        Noun noun = Mockito.mock(Noun.class);
        Map<String, Noun> nounMap = new HashMap<>();
        nounMap.put("noun", noun);
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(nounMap, false);
        Assert.assertTrue(map.containsKey("noun"));
        Assert.assertFalse(map.containsKey("non_existent_key"));
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        Assert.assertFalse(map.containsKey("noun"));

        Noun noun = Mockito.mock(Noun.class);
        map.put("noun", noun);
        Assert.assertTrue(map.containsKey("noun"));
    }

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl mapOriginal = new GrammaticalTermMapImpl();
        Noun noun = Mockito.mock(Noun.class);
        mapOriginal.put("noun", noun);

        GrammaticalTermMapImpl mapToPut = new GrammaticalTermMapImpl();
        mapToPut.putAll(mapOriginal);

        Assert.assertEquals(mapOriginal, mapToPut);
    }

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(new HashMap<>(), true);
        Assert.assertTrue(map.isSkinny());
        map = new GrammaticalTermMapImpl(new HashMap<>(), false);
        Assert.assertFalse(map.isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        Noun noun = Mockito.mock(Noun.class);
        Map<String, Noun> nounMap = new HashMap<>();
        nounMap.put("noun", noun);
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(nounMap, false);

        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary languageDictionary = Mockito.mock(LanguageDictionary.class);
        StringBuilder stringBuilder = new StringBuilder();

        map.writeJson(stringBuilder, renamingProvider, languageDictionary, Collections.emptyList());
        Assert.assertEquals("{}", stringBuilder.toString());
    }

}