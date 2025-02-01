package com.force.i18n.grammar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEqualsSameObjectTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<Noun> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        boolean result = grammaticalTermMap.equals(grammaticalTermMap);
        assertTrue(result);
    }

}