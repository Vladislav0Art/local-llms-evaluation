package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

public class GeneratedConstructorEmptyTest {

    @Test
    public void constructorEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Assert.assertNotNull(termMap);
        Assert.assertTrue(termMap.isEmpty());
    }

}