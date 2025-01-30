package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Map<String, Noun> testMap = new HashMap<>();
        GrammaticalTermMapImpl<Noun> testTermMap1 = new GrammaticalTermMapImpl<>(testMap, true);
        GrammaticalTermMapImpl<Noun> testTermMap2 = new GrammaticalTermMapImpl<>(testMap, true);
        assertEquals(testTermMap1, testTermMap2);
    }

}