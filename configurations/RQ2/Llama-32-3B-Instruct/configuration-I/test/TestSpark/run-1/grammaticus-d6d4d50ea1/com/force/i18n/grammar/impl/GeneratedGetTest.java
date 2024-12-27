package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedGetTest {

    @Test
    public void GetTest() {
        String obj1 = "obj1";
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("key1", obj1);
        assertEquals(obj1, map.get("key1"));
    }

}