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

public class GeneratedEqualsTest {

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
    public void equalsTest() {
        Map<String, MockTerm> mockMap = new HashMap<>();
        mockMap.put("test", new MockTerm("something"));
        GrammaticalTermMapImpl<MockTerm> map1 = new GrammaticalTermMapImpl<>(mockMap, true);
        GrammaticalTermMapImpl<MockTerm> map2 = new GrammaticalTermMapImpl<>(mockMap, true);
        GrammaticalTermMapImpl<MockTerm> map3 = new GrammaticalTermMapImpl<>(mockMap, false);
        Assert.assertEquals(map1, map2);
        Assert.assertNotEquals(map1, map3);
    }

}