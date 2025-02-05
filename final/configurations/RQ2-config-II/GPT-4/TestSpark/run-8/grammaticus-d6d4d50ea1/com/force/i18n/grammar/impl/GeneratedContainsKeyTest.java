package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        String key = "test";
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put(key, mock(GrammaticalTerm.class));
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertTrue(grammaticalTermMapImpl.containsKey(key));
    }

}