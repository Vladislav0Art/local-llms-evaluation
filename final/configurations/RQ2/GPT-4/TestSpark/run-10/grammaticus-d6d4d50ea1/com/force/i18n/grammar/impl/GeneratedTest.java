package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.Mockito;

import java.util.*;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<Noun> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> map2 = new GrammaticalTermMapImpl<>();
        assertTrue("Equal empty maps should return true", map1.equals(map2));
    }

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        assertNotEquals("Generated hash code should not equal 0", 0, map.hashCode());
    }

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun noun = Mockito.mock(Noun.class);
        map.put("Test", noun);
        assertEquals("Size of map should be 1", 1, map.values().size());
    }

    @Test
    public void getTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun noun = Mockito.mock(Noun.class);
        map.put("Test", noun);
        assertEquals("Retrieved value should equal the put one", noun, map.get("Test"));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        assertTrue("New map should be empty", map.isEmpty());
    }

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun noun = Mockito.mock(Noun.class);
        map.put("Test", noun);
        assertTrue("Map should contain 'Test' key", map.containsKey("Test"));
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        assertFalse("New map should not be skinny", map.isSkinny());
        map.makeSkinny();
        assertTrue("Map should be skinny after makeSkinny()", map.isSkinny());
    }

    @Test
    public void writeJsonTest() throws Exception {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun noun = Mockito.mock(Noun.class);
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary languageDictionary = Mockito.mock(LanguageDictionary.class);
        map.put("Test", noun);
        StringBuilder out = new StringBuilder();
        map.writeJson(out, renamingProvider, languageDictionary, Collections.singletonList("Test"));
        assertNotEquals("Output string should not be empty", "", out.toString());
    }

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun noun = Mockito.mock(Noun.class);
        map.put("Test", noun);

        Set<Map.Entry<String, Noun>> entries = map.entrySet();
        for (Map.Entry<String, Noun> entry : entries) {
            assertEquals("Key should be 'Test'", "Test", entry.getKey());
            assertEquals("Value should be the given noun", noun, entry.getValue());
        }
    }

}