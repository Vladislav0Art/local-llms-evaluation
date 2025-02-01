package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        GrammaticalTermMapImpl<String> skinnyMap = new GrammaticalTermMapImpl(new HashMap<>(), true);
        Assert.assertTrue(skinnyMap.isSkinny());

        GrammaticalTermMapImpl<String> notSkinnyMap = new GrammaticalTermMapImpl(new HashMap<>(), false);
        Assert.assertFalse(notSkinnyMap.isSkinny());
    }

}