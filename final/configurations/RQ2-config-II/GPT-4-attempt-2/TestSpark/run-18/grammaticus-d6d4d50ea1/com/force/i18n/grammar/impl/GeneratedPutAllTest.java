package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> firstInstance = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<String> secondInstance = new GrammaticalTermMapImpl<>();
        secondInstance.putAll(firstInstance);
        assertEquals(firstInstance, secondInstance);
    }

}