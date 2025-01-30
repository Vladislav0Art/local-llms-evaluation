package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> gramTermMap = new GrammaticalTermMapImpl<>(map, false);
        GrammaticalTermMapImpl<GrammaticalTerm> skinnyMap = (GrammaticalTermMapImpl<GrammaticalTerm>) gramTermMap.makeSkinny();
        Assert.assertTrue(skinnyMap.isSkinny());
    }

}