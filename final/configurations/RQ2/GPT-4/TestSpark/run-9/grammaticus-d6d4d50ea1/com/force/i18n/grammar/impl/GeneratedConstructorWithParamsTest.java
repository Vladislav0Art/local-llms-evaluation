package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedConstructorWithParamsTest {

    @Test
    public void constructorWithParamsTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        // GrammaticalTerm instance can be replaced with a mocked instance
        testMap.put("term", new GrammaticalTerm());
        assertEquals(testMap, new GrammaticalTermMapImpl<>(testMap, true));
    }

}