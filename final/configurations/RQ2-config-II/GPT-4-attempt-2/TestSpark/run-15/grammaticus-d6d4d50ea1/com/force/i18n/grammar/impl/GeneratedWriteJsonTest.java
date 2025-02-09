package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        Noun noun = Mockito.mock(Noun.class);
        Map<String, Noun> nounMap = new HashMap<>();
        nounMap.put("noun", noun);
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(nounMap, false);

        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary languageDictionary = Mockito.mock(LanguageDictionary.class);
        StringBuilder stringBuilder = new StringBuilder();

        map.writeJson(stringBuilder, renamingProvider, languageDictionary, Collections.emptyList());
        Assert.assertEquals("{}", stringBuilder.toString());
    }

}