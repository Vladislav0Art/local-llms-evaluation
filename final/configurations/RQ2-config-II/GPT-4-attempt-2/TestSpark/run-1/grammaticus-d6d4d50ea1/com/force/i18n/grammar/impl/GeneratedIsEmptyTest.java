package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
        Noun anyNoun = new Noun.HumanLanguageNoun(HumanLanguage.PORTUGUESE);
        termMap.put("test", anyNoun);
        assertFalse(termMap.isEmpty());
    }

}