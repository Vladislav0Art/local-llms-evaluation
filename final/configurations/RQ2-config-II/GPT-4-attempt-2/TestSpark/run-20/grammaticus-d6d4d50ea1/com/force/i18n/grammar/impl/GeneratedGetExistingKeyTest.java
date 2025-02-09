package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedGetExistingKeyTest {

    @Test
    public void getExistingKeyTest() {
        Noun noun = mock(Noun.class);
        Map<String, Noun> map = new HashMap<>();
        map.put("key", noun);
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>(map, true);
        assertEquals(noun, termMap.get("key"));
    }

}