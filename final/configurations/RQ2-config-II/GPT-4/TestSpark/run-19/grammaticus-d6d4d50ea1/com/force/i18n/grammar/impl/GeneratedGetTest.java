package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl<>();
        assertNull(map.get("test"));
    }

}