package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEqualsTest {

    @Mock
    GrammaticalTerm grammaticalTermMock;

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> mapImpl2 = new GrammaticalTermMapImpl<>();
        assertTrue(mapImpl1.equals(mapImpl2));
    }

}