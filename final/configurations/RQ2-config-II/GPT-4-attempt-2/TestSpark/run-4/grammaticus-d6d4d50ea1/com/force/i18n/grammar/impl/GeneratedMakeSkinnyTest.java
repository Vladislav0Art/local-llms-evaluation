package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.Noun;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<Noun> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> skinny = grammaticalTermMap.makeSkinny();

        Assert.assertNotNull(skinny);
        Assert.assertNotEquals(grammaticalTermMap, skinny);
    }

}