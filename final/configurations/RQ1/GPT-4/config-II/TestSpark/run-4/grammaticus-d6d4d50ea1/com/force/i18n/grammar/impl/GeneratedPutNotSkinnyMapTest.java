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

public class GeneratedPutNotSkinnyMapTest {

    @Test
    public void putNotSkinnyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<GrammaticalTerm>();
        GrammaticalTerm mockTerm = Mockito.mock(GrammaticalTerm.class);
        termMap.put("key", mockTerm);
        Assert.assertEquals(mockTerm, termMap.get("key"));
    }

}