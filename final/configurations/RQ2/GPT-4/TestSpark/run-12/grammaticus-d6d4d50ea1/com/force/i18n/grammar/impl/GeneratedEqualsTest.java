package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    // Mock GrammaticalTerm
    GrammaticalTerm term1 = mock(GrammaticalTerm.class);
    GrammaticalTerm term2 = mock(GrammaticalTerm.class);

    @Test
    public void equalsTest() {
        Map<String, GrammaticalTerm> map1 = new HashMap<>();
        map1.put("term1", term1);
        Map<String, GrammaticalTerm> map2 = new HashMap<>();
        map2.put("term1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl1 = new GrammaticalTermMapImpl<>(map1, true);
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl2 = new GrammaticalTermMapImpl<>(map2, true);
        assertTrue(mapImpl1.equals(mapImpl2));
    }

}