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

public class GeneratedPutAndGetTest {

    @Test
    public void putAndGetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        termMap.put("term", term);
        assertEquals(term, termMap.get("term"));
    }

}