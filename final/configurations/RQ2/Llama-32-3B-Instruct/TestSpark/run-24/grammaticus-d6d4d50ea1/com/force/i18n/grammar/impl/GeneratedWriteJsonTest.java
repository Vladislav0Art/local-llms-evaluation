package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(outContent);
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = new LanguageDictionary();
        Collection<String> termsToInclude = new HashSet<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        map.writeJson(outContent, renamingProvider, dictionary, termsToInclude);
        oos.flush();
        assertEquals(0, outContent.size());
    }

}