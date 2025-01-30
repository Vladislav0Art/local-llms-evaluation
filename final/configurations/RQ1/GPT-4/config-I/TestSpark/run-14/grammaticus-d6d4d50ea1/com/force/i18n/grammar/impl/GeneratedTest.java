package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.*;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class GeneratedTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.equals(termMap));
    }

    @Test
    public void equalsDifferentTypeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertFalse(termMap.equals(new Object()));
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertNotNull(termMap.makeSkinny());
        assertTrue(termMap.makeSkinny().isSkinny());
    }

    @Test
    public void writeJsonTest() throws IOException {
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        when(renamingProvider.useRenamedNouns()).thenReturn(true);
        when(dictionary.getLanguage()).thenReturn(Mockito.mock(HumanLanguage.class));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        StringBuilder sb = new StringBuilder();
        termMap.writeJson(sb, renamingProvider, dictionary, Collections.singletonList("test"));
        assertEquals("{}", sb.toString());
    }

    @Test
    public void putSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        termMap.put("abc", Mockito.mock(GrammaticalTerm.class));
    }

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
        termMap.put("TestKey", Mockito.mock(GrammaticalTerm.class));
        assertFalse(termMap.isEmpty());
    }

}