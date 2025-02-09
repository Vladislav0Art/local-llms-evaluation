package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<Noun> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> termMap2 = new GrammaticalTermMapImpl<>();
        assertEquals(termMap1.hashCode(), termMap2.hashCode());
    }

}