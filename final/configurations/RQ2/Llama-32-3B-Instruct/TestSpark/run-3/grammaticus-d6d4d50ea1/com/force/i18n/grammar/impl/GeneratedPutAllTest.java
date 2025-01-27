package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.force.i18n.HumanLanguage;
import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.GrammaticalTermMap;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;

public class GeneratedPutAllTest {

    @Test
    public void PutAllTest() {
        Map<String, GrammaticalTerm> map1 = new HashMap<>();
        map1.put("term", new Noun());
        GrammaticalTermMap<GrammaticalTerm> map2 = new HashMap<>();
        map2.put("otherTerm", new Noun());
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(map1, false);
        instance.putAll(map2);
        assertTrue(instance.containsKey("term"));
    }

}