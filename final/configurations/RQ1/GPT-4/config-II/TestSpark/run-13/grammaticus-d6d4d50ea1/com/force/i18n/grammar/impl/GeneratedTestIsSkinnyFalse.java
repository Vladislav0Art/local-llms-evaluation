package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedTestIsSkinnyFalse {

    @Test
    public void testIsSkinnyFalse() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(termMap.isSkinny());
    }

}