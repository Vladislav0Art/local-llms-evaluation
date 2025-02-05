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

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMap<String> termMap1 = new GrammaticalTermMapImpl<>(new HashMap<String, String>(), false);
        assertFalse(termMap1.isSkinny());
        GrammaticalTermMap<String> termMap2 = termMap1.makeSkinny();
        assertTrue(termMap2.isSkinny());
    }

}