package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedContainsKeyNonExistingTest {

    @Test
    public void containsKeyNonExistingTest() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>(map, true);
        assertFalse(instance.containsKey("anotherKey"));
    }

}