package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPutAllIsSkinnyTest {

    @Test
    public void putAllIsSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap1 = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap2 = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        termMap2.putAll(termMap1);
    }

}