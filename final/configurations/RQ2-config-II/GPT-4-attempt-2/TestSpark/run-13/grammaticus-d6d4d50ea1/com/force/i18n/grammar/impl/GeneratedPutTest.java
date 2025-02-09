package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.google.common.collect.ImmutableMap;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTerm term = new Noun("en_US", "name", "pluralAlias", "start", Language.StartsWith.CONSONANT, Language.Position.NEUTRAL, Language.Plural.NEUTER);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", term);

        Assert.assertEquals(term, termMap.get("test"));
    }

}