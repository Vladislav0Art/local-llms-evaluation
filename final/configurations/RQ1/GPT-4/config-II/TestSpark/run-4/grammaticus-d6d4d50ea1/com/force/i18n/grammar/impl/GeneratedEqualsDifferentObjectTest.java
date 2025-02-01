package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<GrammaticalTerm>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMapDifferent = new GrammaticalTermMapImpl<GrammaticalTerm>();
        Assert.assertTrue(termMap.equals(termMapDifferent));
    }

}