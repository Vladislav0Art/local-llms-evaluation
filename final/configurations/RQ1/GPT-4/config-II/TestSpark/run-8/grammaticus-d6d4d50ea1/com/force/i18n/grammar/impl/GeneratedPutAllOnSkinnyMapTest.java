package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.*;

public class GeneratedPutAllOnSkinnyMapTest {

    @Test
    public void putAllOnSkinnyMapTest() {
        GrammaticalTermMapImpl<String> map1 = new GrammaticalTermMapImpl<>();
        map1.put("key", "value");

        GrammaticalTermMapImpl<String> skinnyMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        skinnyMap.putAll(map1);
    }

}