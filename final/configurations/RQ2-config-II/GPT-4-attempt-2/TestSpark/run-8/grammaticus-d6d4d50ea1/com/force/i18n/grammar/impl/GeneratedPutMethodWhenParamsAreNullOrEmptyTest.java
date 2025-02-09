package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class GeneratedPutMethodWhenParamsAreNullOrEmptyTest {

    @Test
    public void putMethodWhenParamsAreNullOrEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm grammaticalTermMock = mock(GrammaticalTerm.class);
        grammaticalTermMap.put("", grammaticalTermMock);
        assertNull(grammaticalTermMap.get(""));

        grammaticalTermMap.put(null, grammaticalTermMock);
        assertNull(grammaticalTermMap.get(null));

        grammaticalTermMap.put("key", null);
        assertNull(grammaticalTermMap.get("key"));
    }

}