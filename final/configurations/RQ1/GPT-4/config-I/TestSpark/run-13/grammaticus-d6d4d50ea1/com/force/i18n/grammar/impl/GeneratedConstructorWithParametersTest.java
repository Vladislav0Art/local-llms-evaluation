package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedConstructorWithParametersTest {

    @Test
    public void constructorWithParametersTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", mock(GrammaticalTerm.class));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(map, termMap.map);
    }

}