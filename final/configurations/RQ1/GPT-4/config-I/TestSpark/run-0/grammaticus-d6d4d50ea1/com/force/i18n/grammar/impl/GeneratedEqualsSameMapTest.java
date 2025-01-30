package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedEqualsSameMapTest {

    @Test
    public void equalsSameMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> obj1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> obj2 = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(obj1.equals(obj2));
    }

}