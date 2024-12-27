package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import org.junit.Test;

import java.util.*;
import java.io.Serializable;

import static org.junit.Assert.*;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<String>();
        termMap.put("key", "value");
        assertTrue(termMap.containsKey("key"));
        assertTrue(termMap.values().contains("value"));
    }

}