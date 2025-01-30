package com.force.i18n.grammar.impl;

import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl.TermMapSerializer;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeMap;

import static org.junit.Assert.*;

public class GeneratedTermMapSerializerConstructorTest {

    @Test
    public void TermMapSerializerConstructorTest() {
        TreeMap<String, GrammaticalTerm> map = new TreeMap<>();
        TermMapSerializer<GrammaticalTerm> serializer = new TermMapSerializer<>(map);
        assertEquals(map, serializer.getMap());
    }

}