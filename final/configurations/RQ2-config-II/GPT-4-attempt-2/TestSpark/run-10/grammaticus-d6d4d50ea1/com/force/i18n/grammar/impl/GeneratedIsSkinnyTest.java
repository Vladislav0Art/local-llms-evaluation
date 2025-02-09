package com.force.i18n.grammar.impl;

import org.junit.Test;
import org.junit.Assert;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        Map<String, String> map = new HashMap<>();
        GrammaticalTermMapImpl<String> instance = new GrammaticalTermMapImpl<>(map, false);
        Assert.assertFalse(instance.isSkinny());
    }

}