package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedContainsKeyTrueTest {

    @Test
    public void containsKeyTrueTest() {
        String testKey = "test";
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put(testKey, mock(GrammaticalTerm.class));
        assertTrue(termMap.containsKey(testKey));
    }

}