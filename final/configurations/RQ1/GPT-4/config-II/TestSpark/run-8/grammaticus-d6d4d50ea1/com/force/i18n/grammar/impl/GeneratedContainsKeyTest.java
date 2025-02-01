package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("key", "value");
        Assert.assertTrue(map.containsKey("key"));
    }

}