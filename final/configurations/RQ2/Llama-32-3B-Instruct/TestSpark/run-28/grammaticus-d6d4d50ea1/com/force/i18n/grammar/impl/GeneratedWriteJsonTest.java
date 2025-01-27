package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));
        RenamingProvider renamingProvider = new RenameProvider();
        LanguageDictionary dictionary = new Dictionary();
        Collection<String> termsToInclude = new HashSet<>();

        GrammaticalTerm term = new GrammaticalTerm();
        GrammaticalTermMap<GrammaticalTerm> map = new HashMap<>();
        map.put("key", term);
        map.writeJson(System.out, renamingProvider, dictionary, termsToInclude);

        System.setOut(originalOut);
        assertEquals("{\"key\":{}}", out.toString());
    }

}