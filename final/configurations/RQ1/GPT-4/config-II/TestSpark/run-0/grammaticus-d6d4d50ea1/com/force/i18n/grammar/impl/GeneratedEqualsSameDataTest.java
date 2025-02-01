package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedEqualsSameDataTest {

    @Test
    public void equalsSameDataTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(map1.equals(map2));
    }

}