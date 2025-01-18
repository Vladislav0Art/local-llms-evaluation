package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class GeneratedTest {

    // Mock GrammaticalTerm
    GrammaticalTerm term1 = mock(GrammaticalTerm.class);
    GrammaticalTerm term2 = mock(GrammaticalTerm.class);

    @Test
    public void defaultConstructorTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertNotNull(map);
    }

    @Test
    public void parameterisedConstructorTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("term1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        assertTrue(mapImpl.isSkinny());
    }

    @Test
    public void equalsTest() {
        Map<String, GrammaticalTerm> map1 = new HashMap<>();
        map1.put("term1", term1);
        Map<String, GrammaticalTerm> map2 = new HashMap<>();
        map2.put("term1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl1 = new GrammaticalTermMapImpl<>(map1, true);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl2 = new GrammaticalTermMapImpl<>(map2, true);
        assertTrue(mapImpl1.equals(mapImpl2));
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.put("term1", term1);
        assertTrue(map.containsKey("term1"));
    }

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> map1 = new HashMap<>();
        map1.put("term1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl1 = new GrammaticalTermMapImpl<>(map1, true);

        Map<String, GrammaticalTerm> map2 = new HashMap<>();
        map2.put("term2", term2);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl2 = new GrammaticalTermMapImpl<>(map2, true);

        mapImpl1.putAll(mapImpl2);
        assertTrue(mapImpl1.containsKey("term2"));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
    }

    @Test
    public void writeJsonTest() throws IOException {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("term1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        StringBuilder sb = new StringBuilder();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        mapImpl.writeJson(sb, renamingProvider, dictionary, Arrays.asList("term1"));
        assertNotNull(sb.toString());
    }

}