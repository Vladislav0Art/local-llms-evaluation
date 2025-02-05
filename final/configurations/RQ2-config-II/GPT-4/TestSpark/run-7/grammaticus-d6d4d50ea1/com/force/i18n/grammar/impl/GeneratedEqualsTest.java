package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.*;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.HumanLanguage;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<Noun> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> map2 = new GrammaticalTermMapImpl<>();

        Assert.assertTrue(map1.equals(map2));
    }

}