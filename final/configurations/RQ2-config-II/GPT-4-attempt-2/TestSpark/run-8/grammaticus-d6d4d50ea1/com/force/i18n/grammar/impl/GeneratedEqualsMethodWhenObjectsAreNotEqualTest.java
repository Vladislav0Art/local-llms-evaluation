package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedEqualsMethodWhenObjectsAreNotEqualTest {

    @Test
    public void equalsMethodWhenObjectsAreNotEqualTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap2.put("key", grammaticalTermMock);
        assertFalse(grammaticalTermMap1.equals(grammaticalTermMap2));
    }

}