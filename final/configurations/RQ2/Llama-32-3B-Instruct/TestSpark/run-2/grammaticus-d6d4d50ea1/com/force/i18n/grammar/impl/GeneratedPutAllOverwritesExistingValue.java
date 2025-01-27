package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class GeneratedPutAllOverwritesExistingValue {

    @Test
    public void putAllOverwritesExistingValue() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        map.put("term1", "value1");
        map.putAll(new HashMap<>());
        assertEquals("value1", map.get("term1"));
    }

}