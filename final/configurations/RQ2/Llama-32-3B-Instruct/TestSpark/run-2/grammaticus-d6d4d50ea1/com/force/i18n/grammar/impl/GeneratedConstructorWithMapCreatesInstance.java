package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class GeneratedConstructorWithMapCreatesInstance {

    @Test
    public void constructorWithMapCreatesInstance() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("term1", "value1");
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(1, instance.get("term1"));
    }

}