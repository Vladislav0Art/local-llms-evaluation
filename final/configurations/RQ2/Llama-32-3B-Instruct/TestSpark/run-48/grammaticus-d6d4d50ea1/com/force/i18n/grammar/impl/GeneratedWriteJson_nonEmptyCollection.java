package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class GeneratedWriteJson_nonEmptyCollection {

    private GrammaticalTermMapImpl<String> testMap;
    private MapSerializer mapSerializer = new MapSerializer();

    @Test
    public void writeJson_nonEmptyCollection() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        RenamingProvider renamingProvider = mock(RenamingProvider.class);
        LanguageDictionary dictionary = mock(LanguageDictionary.class);
        Collection<String> termsToInclude = Arrays.asList("term1", "term2");
        testMap.writeJson(outContent, renamingProvider, dictionary, termsToInclude);
        assertNotEquals(0, outContent.size());
    }

}