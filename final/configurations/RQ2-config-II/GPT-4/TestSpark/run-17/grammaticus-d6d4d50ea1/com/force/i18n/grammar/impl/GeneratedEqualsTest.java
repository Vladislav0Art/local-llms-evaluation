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

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<String> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> termMap2 = new GrammaticalTermMapImpl<>();

        assertTrue(termMap1.equals(termMap2));
        assertFalse(termMap1.equals(null));
        assertFalse(termMap1.equals(new Object()));

        termMap1.put("Test", "Value");
        termMap2.put("Test", "Value");

        assertTrue(termMap1.equals(termMap2));
        assertFalse(termMap1.equals(new GrammaticalTermMapImpl<>()));
    }

}