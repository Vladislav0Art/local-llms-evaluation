package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedConstructorWithParamsTest {

    @Test
    public void constructorWithParamsTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl grammaticalTermMap = new GrammaticalTermMapImpl(map, true);
        assertNotNull(grammaticalTermMap);
    }

}