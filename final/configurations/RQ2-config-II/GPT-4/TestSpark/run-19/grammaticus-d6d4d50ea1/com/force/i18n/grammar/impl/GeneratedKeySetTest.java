package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl<>();
        Set<String> keySet = map.keySet();
        assertTrue(keySet.isEmpty());
    }

}