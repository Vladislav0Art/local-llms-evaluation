package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.*;

public class GeneratedPutIsSkinnyTrueTest {

    @Test
    public void putIsSkinnyTrueTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>(map, true);

        // This should throw runtime exception as the map is skinny
        grammaticalTermMap.put("key", new Noun() {
            @Override
            public String getName() {
                return "TestNoun";
            }
        });
    }

}