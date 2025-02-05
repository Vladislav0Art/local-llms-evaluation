package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Map;
import java.util.Set;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl<>();
        assertEquals(map.makeSkinny(), map);
    }

}