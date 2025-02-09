package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        GrammaticalTermMapImpl<Noun> termMapImpl1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> termMapImpl2 = new GrammaticalTermMapImpl<>();
        assertTrue(termMapImpl1.equals(termMapImpl2));
    }

}