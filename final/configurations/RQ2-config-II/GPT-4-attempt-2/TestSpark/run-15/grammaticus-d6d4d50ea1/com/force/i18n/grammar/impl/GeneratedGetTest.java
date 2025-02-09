package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        Noun noun = Mockito.mock(Noun.class);
        Map<String, Noun> nounMap = new HashMap<>();
        nounMap.put("noun", noun);
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(nounMap, false);
        Assert.assertEquals(noun, map.get("noun"));
        Assert.assertNull(map.get("non_existent_key"));
    }

}