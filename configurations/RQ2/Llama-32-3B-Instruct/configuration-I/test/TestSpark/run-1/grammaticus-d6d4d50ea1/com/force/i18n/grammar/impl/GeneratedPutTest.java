package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedPutTest {

    @Test
    public void PutTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("key1", "value1");
        assertEquals("value1", map.get("key1"));
    }

}