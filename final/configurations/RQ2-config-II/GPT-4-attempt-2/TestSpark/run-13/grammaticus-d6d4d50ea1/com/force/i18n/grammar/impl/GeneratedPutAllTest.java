package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTerm term = new Noun("en_US", "name", "pluralAlias", "start", Language.StartsWith.CONSONANT, Language.Position.NEUTRAL, Language.Plural.NEUTER);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>();
        termMap1.put("test", term);

        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>();
        termMap2.putAll(termMap1);

        Assert.assertEquals(term, termMap2.get("test"));
    }

}