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

public class GeneratedGetTest {

    @Test
    public void getTest() {
        String key = "test";
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put(key, term);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMapImpl = new GrammaticalTermMapImpl<>(map, true);
        Assert.assertEquals(term, grammaticalTermMapImpl.get(key));
    }

}