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

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        Map<String, String> map = new HashMap<>();
        map.put("key", "value");
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(map.values(), termMap.values());
    }

}