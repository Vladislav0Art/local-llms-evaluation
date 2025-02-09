package com.force.i18n.grammar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedPutAndGetTest {

    @Test
    public void putAndGetTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("testKey", "testValue");

        assertEquals("testValue", termMap.get("testKey"));
        assertFalse(termMap.isEmpty());
    }

}