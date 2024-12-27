package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import org.junit.Test;

import java.util.*;
import java.io.Serializable;

import static org.junit.Assert.*;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<String>();
        termMap.put("key", "value");
        Set<Map.Entry<String, String>> entries = termMap.entrySet();
        assertTrue(entries.contains(termMap.get("key")));
    }

}