package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("key1", Mockito.mock(GrammaticalTerm.class));
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        assertTrue(grammaticalTermMap.isEmpty());
        grammaticalTermMap.putAll(new GrammaticalTermMapImpl<>(map, false));
        assertFalse(grammaticalTermMap.isEmpty());
    }

}