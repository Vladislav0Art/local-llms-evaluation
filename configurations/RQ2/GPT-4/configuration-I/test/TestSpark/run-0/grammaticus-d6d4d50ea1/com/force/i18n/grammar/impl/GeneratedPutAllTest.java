package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;

import java.util.*;
import java.io.IOException;
import java.io.StringWriter;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.lang.Exception;
import java.io.Serializable;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> other = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        other.put("term", term);
        termMap.putAll(other);
        assertTrue(termMap.containsKey("term"));
    }

}