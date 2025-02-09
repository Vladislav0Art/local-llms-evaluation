package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedValuesMethodWhenMapIsNotEmptyTest {

    @Test
    public void valuesMethodWhenMapIsNotEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap.put("key", grammaticalTermMock);
        assertFalse(grammaticalTermMap.values().isEmpty());
        assertTrue(grammaticalTermMap.values().contains(grammaticalTermMock));
    }

}