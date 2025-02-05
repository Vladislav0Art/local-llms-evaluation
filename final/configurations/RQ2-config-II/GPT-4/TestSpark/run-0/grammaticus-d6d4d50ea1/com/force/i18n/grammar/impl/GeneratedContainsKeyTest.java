package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        assertFalse(map.containsKey("key"));
    }

}