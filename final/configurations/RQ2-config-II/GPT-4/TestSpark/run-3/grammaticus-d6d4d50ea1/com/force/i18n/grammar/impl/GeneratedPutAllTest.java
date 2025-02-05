package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl();
        GrammaticalTermMapImpl other = Mockito.mock(GrammaticalTermMapImpl.class);
        termMap.putAll(other);
        Mockito.verify(other, Mockito.times(1)).entrySet();
    }

}