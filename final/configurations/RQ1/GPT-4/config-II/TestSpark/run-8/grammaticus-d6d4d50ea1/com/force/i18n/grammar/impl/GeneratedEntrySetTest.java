package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        Map<String, String> sourceMap = new HashMap<>();
        sourceMap.put("key1", "value1");
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl(sourceMap, false);
        Assert.assertEquals(sourceMap.entrySet(), map.entrySet());
    }

}