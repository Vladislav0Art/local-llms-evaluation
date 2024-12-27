package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedContainsKeyTest {

    @Test
    public void ContainsKeyTest() {
        String obj1 = "obj1";
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("key1", obj1);
        assertTrue(map.containsKey("key1"));
    }

}