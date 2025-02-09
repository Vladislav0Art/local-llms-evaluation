package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        StringBuilder out = new StringBuilder();
        termMap.writeJson(out, renamingProvider, dictionary, null);
        assertEquals("{}", out.toString());
    }

}