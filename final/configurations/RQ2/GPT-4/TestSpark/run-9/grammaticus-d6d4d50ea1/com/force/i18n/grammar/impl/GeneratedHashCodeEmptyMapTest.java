package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class GeneratedHashCodeEmptyMapTest {

    @Test
    public void hashCodeEmptyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Map<String, GrammaticalTerm> hashMap = new HashMap<>();
        assertEquals(hashMap.hashCode(), termMap.hashCode());
    }

}