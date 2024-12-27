package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import org.junit.Test;

import java.util.*;
import java.io.Serializable;

import static org.junit.Assert.*;

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<String>();
        termMap.put("key", "value");
        Collection<String> values = termMap.values();
        assertTrue(values.contains("value"));
    }

}