package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTerm term1 = mock(GrammaticalTerm.class);
        GrammaticalTerm term2 = mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        termMap1.put("test1", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        termMap2.put("test2", term2);
        termMap1.putAll(termMap2);
        assertEquals(term2, termMap1.get("test2"));
    }

}