package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> map1 = new HashMap<>();
        Map<String, GrammaticalTerm> map2 = new HashMap<>();

        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        map2.put("key", term);

        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map1, false);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map2, false);

        termMap1.putAll(termMap2);
        assertTrue(termMap1.containsKey("key"));
    }

}