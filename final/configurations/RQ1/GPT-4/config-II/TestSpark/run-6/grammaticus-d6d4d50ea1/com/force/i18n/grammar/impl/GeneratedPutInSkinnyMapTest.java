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

public class GeneratedPutInSkinnyMapTest {

    @Test
    public void putInSkinnyMapTest() {
        Map<String, String> map = new HashMap<>();
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(map, true);
        termMap.put("test_key", "test_value");
    }

}