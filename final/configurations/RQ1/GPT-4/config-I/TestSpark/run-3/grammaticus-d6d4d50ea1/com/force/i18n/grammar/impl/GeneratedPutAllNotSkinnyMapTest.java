package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedPutAllNotSkinnyMapTest {

    @Test
    public void putAllNotSkinnyMapTest() {
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> termMap = new HashMap<>();
        termMap.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>(termMap, false);
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        map2.putAll(map1);
        assertEquals(term, map2.get("term"));
    }

}