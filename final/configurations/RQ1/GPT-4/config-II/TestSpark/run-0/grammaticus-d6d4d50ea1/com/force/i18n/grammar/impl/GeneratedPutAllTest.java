package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        map2.put("key", Mockito.mock(GrammaticalTerm.class));
        map1.putAll(map2);
        assertTrue(map1.containsKey("key"));
    }

}