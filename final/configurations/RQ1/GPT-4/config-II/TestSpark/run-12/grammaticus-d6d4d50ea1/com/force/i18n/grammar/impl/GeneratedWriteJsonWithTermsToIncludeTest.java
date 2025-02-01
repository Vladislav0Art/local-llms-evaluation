package com.force.i18n.grammar.impl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedWriteJsonWithTermsToIncludeTest {

    @Test
    public void writeJsonWithTermsToIncludeTest() throws IOException {
        TermMap t = Mockito.mock(TermMap.class);
        Mockito.when(t.getName()).thenReturn("test");
        Mockito.doNothing().when(t).toJson(any(Appendable.class));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", t);
        StringBuilder out = new StringBuilder()
        termMap.writeJson(out, null, null, new HashSet<>(Arrays.asList("test")));
        assertEquals("{\"test\":}", out.toString());
    }

}