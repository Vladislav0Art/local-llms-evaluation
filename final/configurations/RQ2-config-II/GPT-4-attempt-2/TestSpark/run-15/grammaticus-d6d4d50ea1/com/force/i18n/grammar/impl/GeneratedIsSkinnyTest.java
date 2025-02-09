package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl(new HashMap<>(), true);
        Assert.assertTrue(map.isSkinny());
        map = new GrammaticalTermMapImpl(new HashMap<>(), false);
        Assert.assertFalse(map.isSkinny());
    }

}