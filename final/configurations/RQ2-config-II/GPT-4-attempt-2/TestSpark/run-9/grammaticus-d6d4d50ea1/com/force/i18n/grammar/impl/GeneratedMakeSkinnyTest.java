package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(new HashMap<String, GrammaticalTerm>(), false);
        map = map.makeSkinny();
        Assert.assertTrue(map.isSkinny());
    }

}