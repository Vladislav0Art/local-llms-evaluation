package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.LanguageCase;
import com.force.i18n.grammar.GrammaticalGender;
import com.force.i18n.grammar.LanguageStartsWith;
import com.force.i18n.grammar.LanguageArticle;
import com.google.common.collect.ImmutableMap;

public class GeneratedTest {

    private class MockTerm extends Noun {
        private String name;

        public MockTerm(String string) {
            super(LanguageStartsWith.A, LanguageCase.NORTH, "a", "b", "c", GrammaticalGender.NEUTRAL, LanguageArticle.ZERO);
            this.name = string;
        }


        @Override
        public String getDictionaryKey() {
            return this.name;
        }

        @Override
        public boolean isValid() {
            return true;
        }

        @Override
        public String getName() {
            return this.name;
        }
    }

    @Test
    public void constructorDefaultTest() {
        GrammaticalTermMapImpl<MockTerm> map = new GrammaticalTermMapImpl<>();
        Assert.assertNotNull(map);
    }

    @Test
    public void constructorWithArgumentsTest() {
        Map<String, MockTerm> mockMap = new HashMap<>();
        mockMap.put("test", new MockTerm("something"));
        GrammaticalTermMapImpl<MockTerm> map = new GrammaticalTermMapImpl<>(mockMap, true);
        Assert.assertEquals(1, map.keySet().size());
    }

    @Test
    public void equalsTest() {
        Map<String, MockTerm> mockMap = new HashMap<>();
        mockMap.put("test", new MockTerm("something"));
        GrammaticalTermMapImpl<MockTerm> map1 = new GrammaticalTermMapImpl<>(mockMap, true);
        GrammaticalTermMapImpl<MockTerm> map2 = new GrammaticalTermMapImpl<>(mockMap, true);
        GrammaticalTermMapImpl<MockTerm> map3 = new GrammaticalTermMapImpl<>(mockMap, false);
        Assert.assertEquals(map1, map2);
        Assert.assertNotEquals(map1, map3);
    }

    @Test
    public void isSkinnyTest() {
        Map<String, MockTerm> mockMap = new HashMap<>();
        mockMap.put("test", new MockTerm("something"));
        GrammaticalTermMapImpl<MockTerm> map1 = new GrammaticalTermMapImpl<>(mockMap, true);
        GrammaticalTermMapImpl<MockTerm> map2 = new GrammaticalTermMapImpl<>(mockMap, false);
        Assert.assertTrue(map1.isSkinny());
        Assert.assertFalse(map2.isSkinny());
    }

    @Test
    public void makeSkinnyTest() {
        Map<String, MockTerm> mockMap = new HashMap<>();
        mockMap.put("test", new MockTerm("something"));
        GrammaticalTermMapImpl<MockTerm> map = new GrammaticalTermMapImpl<>(mockMap, false);
        GrammaticalTermMapImpl<MockTerm> skinnyMap = map.makeSkinny();
        Assert.assertTrue(skinnyMap.isSkinny());
    }

}