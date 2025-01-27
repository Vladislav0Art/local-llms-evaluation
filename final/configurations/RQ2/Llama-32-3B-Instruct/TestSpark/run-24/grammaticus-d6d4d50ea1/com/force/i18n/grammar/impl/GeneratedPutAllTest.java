package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term1 = new GrammaticalTerm();
        GrammaticalTermMapImpl<GrammaticalTerm> other = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        other.put("test", new GrammaticalTerm());
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>();
        instance.putAll(other);
        assertEquals(1, instance.keySet().size());
    }

}