package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedConstructorWithMapAndSkinnyTest {

    @Test
    public void constructorWithMapAndSkinnyTest() {
        Map<String, GrammaticalTerm> map = Mockito.mock(Map.class);
        GrammaticalTermTermA termA = Mockito.mock(GrammaticalTerm.class);
        GrammaticalTermTermB termB = Mockito.mock(GrammaticalTerm.class);

        GrammaticalTermMapImpl<TermA> termATestObj = new GrammaticalTermMapImpl<>(map, true);
        assertNotNull(termATestObj);
    }

}