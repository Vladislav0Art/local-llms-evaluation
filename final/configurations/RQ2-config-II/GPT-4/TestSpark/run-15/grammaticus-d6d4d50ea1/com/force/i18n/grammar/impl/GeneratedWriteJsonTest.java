package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTerm grammaticalTerm = Mockito.mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("k", grammaticalTerm);
        StringBuilder sb = new StringBuilder();
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Collection<String> termsToInclude = new HashSet<>(Arrays.asList("k"));

        new GrammaticalTermMapImpl<>(termMap, true).writeJson(sb, renamingProvider, dictionary, termsToInclude);
    }

}