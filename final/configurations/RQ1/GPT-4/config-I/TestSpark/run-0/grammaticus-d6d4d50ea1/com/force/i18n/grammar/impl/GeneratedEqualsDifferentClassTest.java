package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedEqualsDifferentClassTest {

    @Test
    public void equalsDifferentClassTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> obj = new GrammaticalTermMapImpl<>();
        Assert.assertFalse(obj.equals(new Object()));
    }

}