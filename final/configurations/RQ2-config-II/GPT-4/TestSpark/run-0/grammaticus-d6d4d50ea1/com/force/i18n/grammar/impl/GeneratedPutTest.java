package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("hello", "world");
        assertEquals("world", map.get("hello"));
    }

}