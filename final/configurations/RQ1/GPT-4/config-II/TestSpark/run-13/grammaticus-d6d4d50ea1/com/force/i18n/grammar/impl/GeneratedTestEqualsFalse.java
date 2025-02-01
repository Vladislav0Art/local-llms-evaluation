package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedTestEqualsFalse {

    @Test
    public void testEqualsFalse() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("key", Mockito.mock(GrammaticalTerm.class));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertNotEquals(termMap1.hashCode(), termMap2.hashCode());
        Assert.assertFalse(termMap1.equals(termMap2));
    }

}