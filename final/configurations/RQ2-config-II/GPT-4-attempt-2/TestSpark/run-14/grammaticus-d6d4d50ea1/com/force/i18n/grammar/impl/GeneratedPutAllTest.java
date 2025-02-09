package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.google.common.collect.ImmutableMap;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedPutAllTest {

    @Mock
    private GrammaticalTerm grammaticalTermMock;
    @Mock
    private RenamingProvider renamingProviderMock;
    @Mock
    private LanguageDictionary dictionaryMock;

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> otherMap = new GrammaticalTermMapImpl<>();
        assertFalse(map.containsKey("test"));
        otherMap.put("test", grammaticalTermMock);
        map.putAll(otherMap);
        assertTrue(map.containsKey("test"));
    }

}