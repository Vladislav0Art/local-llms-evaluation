package com.force.i18n.grammar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import org.junit.Test;
import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedConstructorWithArgumentsTest {

    @Test
    public void constructorWithArgumentsTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, false);
        assertNotNull(map);
        assertTrue(map.isEmpty());
    }

}