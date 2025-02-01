package com.force.i18n.grammar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        Map<String, Noun> map = new HashMap<>();
        Noun noun = Mockito.mock(Noun.class);
        map.put("test", noun);

        GrammaticalTermMapImpl<Noun> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, false);
        boolean result = grammaticalTermMap.containsKey("test");

        assertTrue(result);
    }

}