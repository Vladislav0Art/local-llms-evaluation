package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", mock(GrammaticalTerm.class));
        termMap.put("test2", mock(GrammaticalTerm.class));
        Set<String> keys = termMap.keySet();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("test"));
        assertTrue(keys.contains("test2"));
    }

}