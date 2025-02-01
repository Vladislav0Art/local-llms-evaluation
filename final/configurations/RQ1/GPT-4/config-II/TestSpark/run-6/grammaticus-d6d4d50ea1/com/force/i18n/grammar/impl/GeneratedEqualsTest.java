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

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Map<String, Integer> map = new HashMap<>();
        map.put("key", 100);
        GrammaticalTermMapImpl<Integer> termMap1 = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<Integer> termMap2 = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertTrue(termMap1.equals(termMap2));
    }

}