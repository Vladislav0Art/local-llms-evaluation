package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        GrammaticalTerm term = new Noun("en_US", "name", "pluralAlias", "start", Language.StartsWith.CONSONANT, Language.Position.NEUTRAL, Language.Plural.NEUTER);
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);

        Collection<GrammaticalTerm> values = termMap.values();
        Assert.assertEquals(1, values.size());
        Assert.assertTrue(values.contains(term));
    }

}