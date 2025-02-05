package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl grammaticalTermMap = new GrammaticalTermMapImpl(map, true);
        assertTrue(grammaticalTermMap.isSkinny());
    }

}