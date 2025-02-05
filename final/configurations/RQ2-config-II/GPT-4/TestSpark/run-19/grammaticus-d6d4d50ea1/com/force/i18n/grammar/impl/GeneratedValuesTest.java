package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl<>();
        Collection<GrammaticalTerm> values = map.values();
        assertTrue(values.isEmpty());
    }

}