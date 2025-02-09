package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedEqualsDifferentInstancesTest {

    @Test
    public void equalsDifferentInstancesTest() {
        GrammaticalTermMapImpl<String> instanceOne = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> instanceTwo = new GrammaticalTermMapImpl<>();
        Assert.assertFalse(instanceOne.equals(instanceTwo));
    }

}