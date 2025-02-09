package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GeneratedEqualsAndHashCodeTest {

    @Test
    public void equalsAndHashCodeTest() {
        GrammaticalTermMapImpl map1 = new GrammaticalTermMapImpl();
        GrammaticalTermMapImpl map2 = new GrammaticalTermMapImpl();
        Assert.assertEquals(map1, map2);
        Assert.assertEquals(map1.hashCode(), map2.hashCode());

        Noun noun = Mockito.mock(Noun.class);
        Map<String, Noun> nounMap = new HashMap<>();
        nounMap.put("noun", noun);

        map1 = new GrammaticalTermMapImpl(nounMap, false);
        map2 = new GrammaticalTermMapImpl(nounMap, true);
        Assert.assertNotEquals(map1, map2);
        Assert.assertNotEquals(map1.hashCode(), map2.hashCode());
    }

}