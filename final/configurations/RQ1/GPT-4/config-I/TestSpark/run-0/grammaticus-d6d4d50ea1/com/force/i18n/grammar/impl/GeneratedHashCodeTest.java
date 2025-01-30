package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> obj = new GrammaticalTermMapImpl<>();
        Assert.assertEquals(obj.map.hashCode(), obj.hashCode());
    }

}