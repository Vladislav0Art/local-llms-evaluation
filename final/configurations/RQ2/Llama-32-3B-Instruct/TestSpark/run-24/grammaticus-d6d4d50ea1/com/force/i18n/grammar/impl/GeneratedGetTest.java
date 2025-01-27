package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term1 = new GrammaticalTerm();
        map.put("test", term1);
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, true);
        assertEquals(term1, instance.get("test"));
    }

}