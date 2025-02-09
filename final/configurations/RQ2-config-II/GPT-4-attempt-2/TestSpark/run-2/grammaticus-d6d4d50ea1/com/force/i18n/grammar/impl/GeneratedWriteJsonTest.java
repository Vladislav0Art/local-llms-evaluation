package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = Mockito.mock(LanguageDictionary.class);
        termMap.writeJson(new StringBuilder(), renamingProvider, dictionary, null);
    }

}