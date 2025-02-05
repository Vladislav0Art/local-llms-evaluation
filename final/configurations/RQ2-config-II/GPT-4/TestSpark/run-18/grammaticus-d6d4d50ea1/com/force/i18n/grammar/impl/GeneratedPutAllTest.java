package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        testMap.put("test", new Noun("test", "test", Noun.NounType.ENTITY, "test", LanguageDictionary.DEFAULT_NOUN_FORMS));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.putAll(new GrammaticalTermMapImpl<>(testMap, false));
        Assert.assertTrue(termMap.containsKey("test"));
    }

}