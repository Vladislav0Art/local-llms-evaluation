package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws Exception {
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        Mockito.when(term.getName()).thenReturn("Term");

        HashMap<String, GrammaticalTerm> grammarMap = new HashMap<>();
        grammarMap.put("term", term);

        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        StringBuilder sb = new StringBuilder();

        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(grammarMap);
        termMap.writeJson(sb, null, dictionary, new HashSet<>());

        assertTrue(sb.toString().contains("\"term\":"));
    }

}