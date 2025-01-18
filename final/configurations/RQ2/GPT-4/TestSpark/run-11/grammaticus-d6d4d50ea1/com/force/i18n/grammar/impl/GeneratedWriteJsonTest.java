package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.times;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        String termName = "term";
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        Noun noun = Mockito.mock(Noun.class);
        termMap.put(termName, noun);
        RenamingProvider provider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        Collection<String> includeTerms = Collections.singleton(termName);
        Appendable out = new StringBuilder();
        termMap.writeJson(out, provider, dictionary, includeTerms);
        Mockito.verify(noun, times(1)).outputJsonObject(out, provider, dictionary, termMap.isSkinny());
    }

}