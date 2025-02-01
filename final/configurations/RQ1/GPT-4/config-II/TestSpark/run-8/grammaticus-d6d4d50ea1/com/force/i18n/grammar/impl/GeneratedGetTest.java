package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedGetTest {

    @Test
    public void getTest() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl();
        map.put("key", "value");
        Assert.assertEquals("value", map.get("key"));
    }

}