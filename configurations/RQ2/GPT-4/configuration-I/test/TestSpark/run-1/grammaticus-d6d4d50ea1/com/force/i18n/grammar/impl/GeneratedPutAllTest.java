package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> otherMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        otherMap.put("test", term);
        termMap.putAll(otherMap);
        assertTrue(termMap.containsKey("test"));
    }

}