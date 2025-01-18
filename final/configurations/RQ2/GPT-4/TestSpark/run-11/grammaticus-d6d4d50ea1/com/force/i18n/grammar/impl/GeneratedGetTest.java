package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        termMap.put("test", term);
        assertEquals(term, termMap.get("test"));
    }

}