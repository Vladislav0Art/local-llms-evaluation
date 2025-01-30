package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> obj = new GrammaticalTermMapImpl<>();
        obj.put("test", mock(GrammaticalTerm.class));
        Assert.assertNotNull(obj.get("test"));
    }

}