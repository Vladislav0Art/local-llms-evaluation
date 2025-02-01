package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedTestEqualsTrue {

    @Test
    public void testEqualsTrue() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertEquals(termMap1.hashCode(), termMap2.hashCode());
        Assert.assertTrue(termMap1.equals(termMap2));
    }

}