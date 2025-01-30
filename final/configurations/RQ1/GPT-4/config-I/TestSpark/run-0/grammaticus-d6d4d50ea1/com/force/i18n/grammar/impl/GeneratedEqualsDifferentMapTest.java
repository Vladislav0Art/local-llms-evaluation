package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedEqualsDifferentMapTest {

    @Test
    public void equalsDifferentMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> obj1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> obj2 = new GrammaticalTermMapImpl<>();
        obj2.put("test", mock(GrammaticalTerm.class));
        Assert.assertFalse(obj1.equals(obj2));
    }

}