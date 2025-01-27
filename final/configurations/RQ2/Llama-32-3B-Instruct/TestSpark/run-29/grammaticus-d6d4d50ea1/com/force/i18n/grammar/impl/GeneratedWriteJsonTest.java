package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import java.io.ByteArrayOutputStream;
import java.io.StringWriter;

import com.force.i18n.HumanLanguage;
import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.GrammaticalTermMap;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

public class GeneratedWriteJsonTest {

    @Test
    public void writeJsonTest() throws IOException {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        StringWriter stringWriter = new StringWriter();
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        termMap.writeJson(stringWriter, null, null, new HashSet<>());
        assertTrue(outContent.toString().contains("{"));
    }

}