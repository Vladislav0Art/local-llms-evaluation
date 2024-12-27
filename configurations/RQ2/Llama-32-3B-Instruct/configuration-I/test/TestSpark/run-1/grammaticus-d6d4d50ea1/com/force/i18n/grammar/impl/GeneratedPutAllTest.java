package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedPutAllTest {

    @Test
    public void PutAllTest() throws IOException {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> other = new GrammaticalTermMapImpl<>();
        other.put("key2", "value2");
        map.putAll(other);
        assertTrue(map.containsKey("key2"));
    }

}