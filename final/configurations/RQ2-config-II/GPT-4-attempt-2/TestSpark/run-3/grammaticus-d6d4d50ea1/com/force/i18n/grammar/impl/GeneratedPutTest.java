package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test1", new Noun.Human("test", "Test", "Tests"));
        Assert.assertEquals("test", termMap.get("test1").getSingularAlias());
    }

}