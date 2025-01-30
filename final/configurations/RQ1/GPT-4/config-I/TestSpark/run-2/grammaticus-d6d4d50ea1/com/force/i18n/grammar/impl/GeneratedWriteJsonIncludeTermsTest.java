package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class GeneratedWriteJsonIncludeTermsTest {

    @Test
    public void writeJsonIncludeTermsTest() throws IOException {
        TreeMap<String, GrammaticalTerm> map = new TreeMap<>();
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        GrammaticalTerm term1 = Mockito.mock(GrammaticalTerm.class);
        Mockito.when(term1.getName()).thenReturn("term1");
        map.put("term1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        StringBuilder out = new StringBuilder();
        termMap.writeJson(out, renamingProvider, dictionary, new HashSet<>(Arrays.asList("term1")));
        assertTrue(out.toString().contains("term1"));
    }

}