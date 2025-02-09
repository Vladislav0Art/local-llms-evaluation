package com.force.i18n.grammar.impl;

import org.junit.Test;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        Map<String, Noun> map = new HashMap<>();
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>(map, true);
        assertTrue(termMap.isSkinny());
    }

}