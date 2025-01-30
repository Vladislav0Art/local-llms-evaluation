package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, false);
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Collection<String> termsToInclude = Collections.singleton("term");
        StringBuilder stringBuilder = new StringBuilder();
        testTermMap.writeJson(stringBuilder, renamingProvider, dictionary, termsToInclude);
        assertEquals("{}", stringBuilder.toString());
    }

}