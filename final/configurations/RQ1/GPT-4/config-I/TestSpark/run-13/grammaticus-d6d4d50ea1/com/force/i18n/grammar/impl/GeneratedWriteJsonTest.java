package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        LanguageDictionary dialect = mock(LanguageDictionary.class);
        RenamingProvider provider = mock(RenamingProvider.class);
        when(term.getName()).thenReturn("test");
        when(provider.getRenamedNoun(null, term.getName())).thenReturn(null);
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        StringBuilder out = new StringBuilder();
        termMap.writeJson(out, provider, dialect, new HashSet<>());
        assertEquals("{\"test\":null}", out.toString());
    }

}