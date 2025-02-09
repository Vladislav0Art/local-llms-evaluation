package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl map = new GrammaticalTermMapImpl();
        Assert.assertTrue(map.equals(map));
        Assert.assertFalse(map.equals(null));
        Assert.assertFalse(map.equals(new Object()));
    }

}