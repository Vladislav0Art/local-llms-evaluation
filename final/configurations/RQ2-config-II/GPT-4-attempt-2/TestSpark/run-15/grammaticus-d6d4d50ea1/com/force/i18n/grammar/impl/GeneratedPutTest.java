package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        Assert.assertFalse(map.containsKey("noun"));

        Noun noun = Mockito.mock(Noun.class);
        map.put("noun", noun);
        Assert.assertTrue(map.containsKey("noun"));
    }

}