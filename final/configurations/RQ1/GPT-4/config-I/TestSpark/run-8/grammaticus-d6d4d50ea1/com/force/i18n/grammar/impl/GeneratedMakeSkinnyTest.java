package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedMakeSkinnyTest {


    private class GrammaticalTermMock implements GrammaticalTerm {
        private String name;

        public GrammaticalTermMock(String name) {
            this.name = name;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public void toJson(Appendable appendable) throws java.io.IOException {

        }
    }

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMapSkinny = (GrammaticalTermMapImpl<GrammaticalTerm>) termMap.makeSkinny();
        assertTrue(termMapSkinny.isSkinny());

        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", new GrammaticalTermMock("test"));
        termMap = new GrammaticalTermMapImpl<>(map, false);
        termMapSkinny = (GrammaticalTermMapImpl<GrammaticalTerm>) termMap.makeSkinny();
        assertEquals(termMap, termMapSkinny);
    }

}