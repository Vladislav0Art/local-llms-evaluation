package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedWriteJsonWithTermsToIncludeTest {

    @Test
    public void writeJsonWithTermsToIncludeTest() throws Exception {
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary languageDictionary = Mockito.mock(LanguageDictionary.class);
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun term = Mockito.mock(Noun.class);
        Mockito.when(term.getName()).thenReturn("term1");
        map.put("term1", term);

        Collection<String> termsToInclude = new HashSet<>(Arrays.asList("term1"));
        StringBuilder out = new StringBuilder();
        map.writeJson(out, renamingProvider, languageDictionary, termsToInclude);
    }

}