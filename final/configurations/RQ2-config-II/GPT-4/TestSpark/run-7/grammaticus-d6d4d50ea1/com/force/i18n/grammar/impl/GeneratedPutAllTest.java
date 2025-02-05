package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.*;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.HumanLanguage;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<Noun> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> map2 = new GrammaticalTermMapImpl<>();
        Noun noun = new Noun.Human("Name", LanguageTestObject.TestStartNoun.class, "Name", "Name", "Name", "Name", "Name");
        map2.put("Name", noun);
        map1.putAll(map2);
        Assert.assertTrue(map1.containsKey("Name"));
    }

}