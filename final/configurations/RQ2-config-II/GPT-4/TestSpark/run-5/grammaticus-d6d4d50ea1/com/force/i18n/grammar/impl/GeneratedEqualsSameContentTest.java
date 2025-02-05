package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedEqualsSameContentTest {

    @Test
    public void equalsSameContentTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap1 = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<String> termMap2 = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMap1.equals(termMap2));
    }

}