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

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Noun anyNoun = new Noun.HumanLanguageNoun(HumanLanguage.PORTUGUESE);
        Map<String, Noun> map = new HashMap<>();
        map.put("test", anyNoun);
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(anyNoun, termMap.get("test"));
        assertNull(termMap.get("unknown"));
    }

}