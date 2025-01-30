package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        when(term.getName()).thenReturn("term");
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(termMap, false);
        RenamingProvider provider = mock(RenamingProvider.class);
        StringBuilder out = new StringBuilder();
        map.writeJson(out, provider, mock(HumanLanguage.class));
        assertTrue(out.toString().contains("\"term\":"));
    }

}