package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedPutAndGetTest {

    @Test
    public void putAndGetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        termMap.put("test", term);
        assertEquals(term, termMap.get("test"));
    }

}