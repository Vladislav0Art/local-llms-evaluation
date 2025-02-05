package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<String> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> termMap2 = new GrammaticalTermMapImpl<>();
        termMap2.put("Test", "Value");
        termMap1.putAll(termMap2);
        assertEquals("Value", termMap1.get("Test"));
    }

}