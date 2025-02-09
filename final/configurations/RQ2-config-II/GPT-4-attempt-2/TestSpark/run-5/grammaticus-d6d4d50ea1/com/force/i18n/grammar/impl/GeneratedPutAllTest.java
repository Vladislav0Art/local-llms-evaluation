package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<String> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> map2 = new GrammaticalTermMapImpl<>();
        map2.put("Test", "Test");
        map1.putAll(map2);
        assertEquals(1, map1.keySet().size());
    }

}