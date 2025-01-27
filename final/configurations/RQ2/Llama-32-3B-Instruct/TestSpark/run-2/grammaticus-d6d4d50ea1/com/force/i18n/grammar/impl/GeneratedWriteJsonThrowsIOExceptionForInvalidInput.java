package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class GeneratedWriteJsonThrowsIOExceptionForInvalidInput {

    @Test
    public void writeJsonThrowsIOExceptionForInvalidInput() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        RenamingProvider renamingProvider = Mockito.mock(RenamingProvider.class);
        LanguageDictionary dictionary = new LanguageDictionary();
        Collection<String> termsToInclude = new HashSet<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        map.writeJson(out, renamingProvider, dictionary, termsToInclude);
        assertTrue(out.toString().contains("Invalid input"));
    }

}