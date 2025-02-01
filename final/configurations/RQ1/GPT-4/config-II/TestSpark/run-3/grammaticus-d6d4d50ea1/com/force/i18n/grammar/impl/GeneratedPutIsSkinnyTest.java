package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.junit.Assert;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPutIsSkinnyTest {

    @Test
    public void putIsSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        termMap.put("key", new GrammaticalTermImpl());
    }

}