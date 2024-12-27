package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedEqualsTest {

    @Test
    public void EqualsTest() {
        String obj1 = "obj1";
        String obj2 = "obj1";
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.equals(obj1));
        assertTrue(map.equals(obj2));
    }

}