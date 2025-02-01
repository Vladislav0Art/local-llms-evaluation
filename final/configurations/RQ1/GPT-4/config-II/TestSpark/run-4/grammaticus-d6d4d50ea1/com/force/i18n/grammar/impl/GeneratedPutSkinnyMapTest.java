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

public class GeneratedPutSkinnyMapTest {

    @Test
    public void putSkinnyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<GrammaticalTerm>(new HashMap<>(), true);
        try {
            termMap.put("key", Mockito.mock(GrammaticalTerm.class));
        } catch (Exception e) {
            Assert.assertTrue(e instanceof RuntimeException);
        }
    }

}