package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", new Noun("en_US", "name", "pluralAlias", "start", Language.StartsWith.CONSONANT, Language.Position.NEUTRAL, Language.Plural.NEUTER));
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);

        Set<String> keySet = termMap.keySet();
        Assert.assertTrue(keySet.contains("test"));
    }

}