package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", term);
        Assert.assertEquals(term, termMap.get("test"));
    }

}