package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<GrammaticalTerm>();
        LanguageDictionary mockDictionary = Mockito.mock(LanguageDictionary.class);
        RenamingProvider mockProvider = Mockito.mock(RenamingProvider.class);
        StringBuilder sb = new StringBuilder();
        termMap.writeJson(sb, mockProvider, mockDictionary, new HashSet<String>(Arrays.asList("term")));
        Assert.assertTrue(sb.toString().startsWith("{"));
        Assert.assertTrue(sb.toString().endsWith("}"));
    }

}