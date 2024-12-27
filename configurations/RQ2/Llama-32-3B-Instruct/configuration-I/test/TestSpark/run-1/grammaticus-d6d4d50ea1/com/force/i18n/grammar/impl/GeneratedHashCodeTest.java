package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedHashCodeTest {

    @Test
    public void HashCodeTest() {
        String obj1 = "obj1";
        String obj2 = "obj1";
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertEquals(0, map.hashCode());
        assertEquals(0, obj1.hashCode());
        assertTrue(map.equals(obj1));
    }

}