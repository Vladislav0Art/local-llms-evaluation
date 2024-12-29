package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.GrammaticalTermMap;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.Appendable;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @InjectMocks
    private GrammaticalTermMapImpl<Noun> gramaticalTermMap;

    @Mock
    private RenamingProvider renamingProvider;

    @Mock
    private LanguageDictionary dictionary;

    @Mock
    private Appendable out;

    @Test
    public void constructorTest_NoArgs() {
        gramaticalTermMap = new GrammaticalTermMapImpl<>();
        assertNotNull(gramaticalTermMap);
    }

    @Test
    public void constructorTest_MapAndSkinny() {
        Map<String, Noun> map = new HashMap<>();
        gramaticalTermMap = new GrammaticalTermMapImpl<>(map, true);
        assertNotNull(gramaticalTermMap);
    }

    @Test
    public void equalsTest_SameObject() {
        gramaticalTermMap = new GrammaticalTermMapImpl<>();
        assertTrue(gramaticalTermMap.equals(gramaticalTermMap));
    }

    @Test
    public void equalsTest_DifferentObject() {
        gramaticalTermMap = new GrammaticalTermMapImpl<>();
        assertFalse(gramaticalTermMap.equals(null));
    }

    @Test
    public void equalsTest_SameClassDifferentFields() {
        gramaticalTermMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMap<Noun> other = new GrammaticalTermMapImpl<>();
        assertFalse(gramaticalTermMap.equals(other));
    }

}