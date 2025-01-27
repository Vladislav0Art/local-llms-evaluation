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

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        Map<String, Noun> initialData = new HashMap<>();
        initialData.put("noun1", new Noun());
        GrammaticalTermMap<Noun> termMap = new GrammaticalTermMapImpl<>(initialData, false);
        termMap.putAll(new GrammaticalTermMapImpl<>());
        assertEquals(0, termMap.keySet().size());
    }

}