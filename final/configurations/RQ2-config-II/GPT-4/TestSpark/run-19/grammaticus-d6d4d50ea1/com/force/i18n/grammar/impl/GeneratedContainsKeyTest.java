package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl<>();
        assertFalse(map.containsKey("test"));
    }

}