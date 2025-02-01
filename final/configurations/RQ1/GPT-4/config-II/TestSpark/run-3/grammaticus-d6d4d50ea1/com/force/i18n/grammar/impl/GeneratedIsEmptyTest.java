package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertTrue(termMap.isEmpty());
    }

    // Implement a simple version of the GrammaticalTerm interface for testing.
    static class GrammaticalTermImpl implements GrammaticalTerm {
        @Override
        public String getName() {
            return "TestTerm";
        }
    }

}