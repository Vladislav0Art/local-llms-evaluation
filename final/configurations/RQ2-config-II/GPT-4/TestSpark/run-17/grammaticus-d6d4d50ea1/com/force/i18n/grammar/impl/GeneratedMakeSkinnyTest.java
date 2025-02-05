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

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        Map<String, String> termMap = new HashMap<>();
        termMap.put("Test", "Value");
        GrammaticalTermMapImpl<String> termMapImpl = new GrammaticalTermMapImpl<>(termMap, false);
        assertFalse(termMapImpl.isSkinny());
        termMapImpl = termMapImpl.makeSkinny();
        assertTrue(termMapImpl.isSkinny());
    }

}