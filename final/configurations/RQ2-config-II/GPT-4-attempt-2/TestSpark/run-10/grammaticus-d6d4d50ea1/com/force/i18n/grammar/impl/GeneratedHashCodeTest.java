package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedHashCodeTest {

    @Test
    public void hashCodeTest() {
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>();
        Assert.assertNotNull(instance.hashCode());
    }

}