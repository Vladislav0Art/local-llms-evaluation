package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedEntrySetTest {

    @Test
    public void EntrySetTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertEquals(0, ((Collection<Map.Entry<String, String>>) map.entrySet()).size());
    }

}