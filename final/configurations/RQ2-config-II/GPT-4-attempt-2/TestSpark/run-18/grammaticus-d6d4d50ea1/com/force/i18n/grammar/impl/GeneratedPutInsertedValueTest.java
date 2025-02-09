package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPutInsertedValueTest {

    @Test
    public void putInsertedValueTest() {
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>();
        instance.put("key", "value");
        assertEquals("value", instance.get("key"));
    }

}