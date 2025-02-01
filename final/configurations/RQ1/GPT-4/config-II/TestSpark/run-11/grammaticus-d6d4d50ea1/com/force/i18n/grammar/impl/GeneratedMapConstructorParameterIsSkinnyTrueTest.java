package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.*;

public class GeneratedMapConstructorParameterIsSkinnyTrueTest {

    @Test
    public void mapConstructorParameterIsSkinnyTrueTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertTrue(grammaticalTermMap.isSkinny());
    }

}