package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedConstructorTestWithParameters {

    @Test
    public void ConstructorTestWithParameters() {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        GrammaticalTermMapImpl<String> mapImpl = new GrammaticalTermMapImpl<>(map, true);
        assertEquals(map.size(), mapImpl.keySet().size());
    }

}