package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        Map<String, GrammaticalTerm> termMap = Mockito.mock(Map.class);
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(termMap, false);
        GrammaticalTermMapImpl<GrammaticalTerm> skinnyTermMap = grammaticalTermMap.makeSkinny();
        Assert.assertTrue(skinnyTermMap.isSkinny());
    }

}