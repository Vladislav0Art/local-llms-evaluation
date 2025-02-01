package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        GrammaticalTermMapImpl<String> map1 = new GrammaticalTermMapImpl();
        map1.put("key", "value");

        GrammaticalTermMapImpl<String> map2 = new GrammaticalTermMapImpl();
        map2.put("key", "value");

        Assert.assertTrue(map1.equals(map2));
    }

}