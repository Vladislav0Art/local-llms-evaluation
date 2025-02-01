package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEqualsSameTermMapTest {

    @Test
    public void equalsSameTermMapTest() {
        GrammaticalTermImpl term = new GrammaticalTermImpl();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        termMap1.put("key", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        termMap2.put("key", term);
        Assert.assertTrue(termMap1.equals(termMap2));
    }

}