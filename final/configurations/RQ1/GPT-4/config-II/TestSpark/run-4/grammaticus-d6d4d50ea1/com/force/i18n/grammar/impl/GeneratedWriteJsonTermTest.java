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

public class GeneratedWriteJsonTermTest {

    @Test
    public void writeJsonTermTest() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<GrammaticalTerm>();
        Noun mockTerm = Mockito.mock(Noun.class);
        Mockito.when(mockTerm.getName()).thenReturn("name");
        StringBuilder sb = new StringBuilder();
        termMap.writeJsonTerm(sb, null, mockTerm, null);
        Assert.assertTrue(sb.toString().startsWith("\"name\":"));
    }

}