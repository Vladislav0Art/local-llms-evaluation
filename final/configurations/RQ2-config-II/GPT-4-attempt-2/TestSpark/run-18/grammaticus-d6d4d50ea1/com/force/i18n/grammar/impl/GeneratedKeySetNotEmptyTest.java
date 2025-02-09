package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedKeySetNotEmptyTest {

    @Test
    public void keySetNotEmptyTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>(map, true);
        Set<String> keySet = instance.keySet();
        assertEquals(1, keySet.size());
    }

}