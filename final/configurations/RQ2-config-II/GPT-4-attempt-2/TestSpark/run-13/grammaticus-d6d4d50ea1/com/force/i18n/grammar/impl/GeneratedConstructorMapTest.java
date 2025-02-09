package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedConstructorMapTest {

    @Test
    public void constructorMapTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", new Noun("en_US", "name", "pluralAlias", "start", Language.StartsWith.CONSONANT, Language.Position.NEUTRAL, Language.Plural.NEUTER));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);

        Assert.assertNotNull(termMap);
        Assert.assertFalse(termMap.isEmpty());
        Assert.assertTrue(termMap.containsKey("test"));
        Assert.assertNotNull(termMap.get("test"));
    }

}