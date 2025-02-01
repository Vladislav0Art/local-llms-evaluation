package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedContainsKeyExistenceTest {

    @Test
    public void containsKeyExistenceTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        map.put("key", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertTrue(termMap.containsKey("key"));
    }

}