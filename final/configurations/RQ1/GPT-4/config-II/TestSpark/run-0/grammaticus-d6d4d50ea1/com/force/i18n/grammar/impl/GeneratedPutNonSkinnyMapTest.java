package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedPutNonSkinnyMapTest {

    @Test
    public void putNonSkinnyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        map.put("key", Mockito.mock(GrammaticalTerm.class));
        assertTrue(map.containsKey("key"));
    }

}