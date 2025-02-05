package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedTest {

    @Test
    public void equalsObjectsAreTheSameTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        assertTrue(map1.equals(map1));
    }

    @Test
    public void equalsDifferentClassesTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.equals(new Object()));
    }

    @Test
    public void isSkinnyPropertyReturnsTrueTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(map.isSkinny());
    }

    @Test
    public void isSkinnyPropertyReturnsFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertFalse(map.isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        StringBuilder sb = new StringBuilder();

        RenamingProvider rp = Mockito.mock(RenamingProvider.class);
        LanguageDictionary ld = Mockito.mock(LanguageDictionary.class);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.writeJson(sb, rp, ld, new ArrayList<>());

        assertEquals("{}", sb.toString());
    }

    @Test
    public void keySetTest() {
        HashMap<String, GrammaticalTerm> hm = new HashMap<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        hm.put("test", gt);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(hm, true);

        Set<String> keySet = map.keySet();
        assertEquals(1, keySet.size());
        assertEquals("test", keySet.iterator().next());
    }

    @Test
    public void getExistingNameTest() {
        HashMap<String, GrammaticalTerm> hm = new HashMap<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        hm.put("test", gt);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(hm, true);

        assertEquals(gt, map.get("test"));
    }

    @Test
    public void containsKeyTest() {
        HashMap<String, GrammaticalTerm> hm = new HashMap<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        hm.put("testKey", gt);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(hm, false);

        assertTrue(map.containsKey("testKey"));
    }

    @Test
    public void containsNonexistentKeyTest() {
        HashMap<String, GrammaticalTerm> hm = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(hm, false);

        assertFalse(map.containsKey("nonexistentKey"));
    }

    @Test
    public void entrySetTest() {
        HashMap<String, GrammaticalTerm> hm = new HashMap<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        hm.put("testKey", gt);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(hm, false);

        assertTrue(map.entrySet().iterator().next().getValue().equals(gt));
    }

    @Test
    public void isEmptyTest() {
        HashMap<String, GrammaticalTerm> hm = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(hm, false);
        assertTrue(map.isEmpty());
    }

    @Test
    public void isNotEmptyTest() {
        HashMap<String, GrammaticalTerm> hm = new HashMap<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        hm.put("testKey", gt);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(hm, false);
        assertFalse(map.isEmpty());
    }

}