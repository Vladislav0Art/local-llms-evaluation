package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class GeneratedGetEmptyTest {

    @Test
    public void getEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertNull(termMap.get("test"));
    }

}