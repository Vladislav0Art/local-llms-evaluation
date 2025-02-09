package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Set;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedKeySetEmptyTest {

    @Test
    public void keySetEmptyTest() {
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>();
        Set<String> keySet = instance.keySet();
        assertEquals(0, keySet.size());
    }

}