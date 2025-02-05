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

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", new Noun("test", "test", Noun.NounType.ENTITY, "test", LanguageDictionary.DEFAULT_NOUN_FORMS));
        Assert.assertTrue(termMap.containsKey("test"));
    }

}