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

public class GeneratedEqualsDifferentTypeTest {

    @Test
    public void equalsDifferentTypeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        Integer n = 5;
        assertFalse(termMap.equals(n));
    }

}