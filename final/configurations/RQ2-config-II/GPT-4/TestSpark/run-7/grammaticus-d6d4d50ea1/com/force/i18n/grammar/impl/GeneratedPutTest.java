package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.*;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.HumanLanguage;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<Noun> map = new GrammaticalTermMapImpl<>();
        Noun noun = new Noun.Human("Name", LanguageTestObject.TestStartNoun.class, "Name", "Name", "Name", "Name", "Name");
        map.put("Name", noun);
        Assert.assertTrue(map.containsKey("Name"));
    }

}