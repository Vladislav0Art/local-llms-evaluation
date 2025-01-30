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

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Map<String, Noun> testMap = new HashMap<>();
        Noun noun = Mockito.mock(Noun.class);
        testMap.put("key", noun);
        GrammaticalTermMapImpl<Noun> testTermMap = new GrammaticalTermMapImpl<>(testMap, false);
        assertEquals(noun, testTermMap.get("key"));
    }

}