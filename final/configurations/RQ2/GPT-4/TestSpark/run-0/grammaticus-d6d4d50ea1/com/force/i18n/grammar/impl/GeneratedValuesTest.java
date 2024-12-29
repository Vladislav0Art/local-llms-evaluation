package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedValuesTest {

    @Test
    public void valuesTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        map.put("test", null);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        Collection<GrammaticalTerm> values = termMap.values();
        Assert.assertEquals(1, values.size());
    }

}