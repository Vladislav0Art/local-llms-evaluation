package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class GeneratedTest {

    class DummyGrammaticalTerm implements GrammaticalTerm {
        @Override
        public String getName() {
            return "dummy";
        }

        @Override
        public void toJson(Appendable out) throws IOException {
            out.append("{}");
        }

        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            return super.equals(o);
        }

        @Override
        public String toString() {
            return super.toString();
        }
    }

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<DummyGrammaticalTerm> gramMap = new GrammaticalTermMapImpl<>();
        assertTrue(gramMap.equals(gramMap));
    }

    @Test
    public void equalsDifferentClassObjectTest() {
        GrammaticalTermMapImpl<DummyGrammaticalTerm> gramMap = new GrammaticalTermMapImpl<>();
        assertFalse(gramMap.equals(new Object()));
    }

    @Test
    public void equalsDiffObjectTest() {
        assertFalse(new GrammaticalTermMapImpl<DummyGrammaticalTerm>().equals(new GrammaticalTermMapImpl<DummyGrammaticalTerm>()));
    }

    @Test
    public void hashCodeTest() {
        int hashCode = new GrammaticalTermMapImpl<DummyGrammaticalTerm>().hashCode();
        assertTrue(hashCode >= 0);
    }

    @Test
    public void isSkinnyTest() {
        assertFalse(new GrammaticalTermMapImpl<DummyGrammaticalTerm>().isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        assertTrue(new GrammaticalTermMapImpl<DummyGrammaticalTerm>().makeSkinny().isSkinny());
    }

    @Test
    public void writeJsonNullTermsToIncludeTest() throws IOException {
        Appendable out = new StringBuilder();
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Mockito.when(renamingProvider.useRenamedNouns()).thenReturn(false);

        new GrammaticalTermMapImpl<DummyGrammaticalTerm>().writeJson(out, renamingProvider, dictionary, null);
        assertEquals("{}", out.toString());
    }

    @Test
    public void getExistingKeyTest() {
        Map<String, DummyGrammaticalTerm> map = new HashMap<>();
        map.put("test", new DummyGrammaticalTerm());
        GrammaticalTermMapImpl<DummyGrammaticalTerm> gramMap = new GrammaticalTermMapImpl<>(map, true);

        assertEquals(map.get("test"), gramMap.get("test"));
    }

    @Test
    public void getNonExistingKeyTest() {
        GrammaticalTermMapImpl<DummyGrammaticalTerm> gramMap = new GrammaticalTermMapImpl<>();
        assertNull(gramMap.get("test"));
    }

    @Test
    public void putInSkinnyMapTest() {
        new GrammaticalTermMapImpl<DummyGrammaticalTerm>(new HashMap<>(), true).put("test", new DummyGrammaticalTerm());
    }

    @Test
    public void putAllInSkinnyMapTest() {
        GrammaticalTermMapImpl<DummyGrammaticalTerm> map1 = new GrammaticalTermMapImpl<DummyGrammaticalTerm>(new HashMap<>(), true);
        GrammaticalTermMapImpl<DummyGrammaticalTerm> map2 = new GrammaticalTermMapImpl<DummyGrammaticalTerm>(new HashMap<>(), false);
        map1.putAll(map2);
    }

    @Test
    public void isEmptyTest() {
        assertTrue(new GrammaticalTermMapImpl<DummyGrammaticalTerm>().isEmpty());
    }

}