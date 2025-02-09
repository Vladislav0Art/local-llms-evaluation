package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        Noun noun = Mockito.mock(Noun.class);
        Map<String, Noun> nounMap = new HashMap<>();
        nounMap.put("noun", noun);
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(nounMap, false);
        Assert.assertTrue(map.containsKey("noun"));
        Assert.assertFalse(map.containsKey("non_existent_key"));
    }

}