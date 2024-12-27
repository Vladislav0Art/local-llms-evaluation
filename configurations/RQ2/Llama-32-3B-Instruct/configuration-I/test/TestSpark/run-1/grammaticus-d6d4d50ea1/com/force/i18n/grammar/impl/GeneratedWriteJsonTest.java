package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedWriteJsonTest {

    @Test
    public void WriteJsonTest() throws IOException {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("key1", "value1");
        PrintWriter out = new PrintWriter(new StringBuilder());
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        Collection<String> termsToInclude = Collections.emptyList();
        map.writeJson(out, renamingProvider, dictionary, termsToInclude);
        out.flush();
        assertEquals("", out.toString());
    }

}