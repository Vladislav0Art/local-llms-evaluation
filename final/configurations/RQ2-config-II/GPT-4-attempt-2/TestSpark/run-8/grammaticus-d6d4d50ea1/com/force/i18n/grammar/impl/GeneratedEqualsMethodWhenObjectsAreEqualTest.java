package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedEqualsMethodWhenObjectsAreEqualTest {

    @Test
    public void equalsMethodWhenObjectsAreEqualTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap2 = new GrammaticalTermMapImpl<>();
        assertTrue(grammaticalTermMap1.equals(grammaticalTermMap2));
    }

}