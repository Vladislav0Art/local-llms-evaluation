package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import org.junit.Test;

import java.util.*;
import java.io.Serializable;

import static org.junit.Assert.*;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<String>();
        termMap.put("key", "value");
        assertTrue(termMap.keySet().contains("key"));
    }

}