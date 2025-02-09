package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<Noun> termMapImpl1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> termMapImpl2 = new GrammaticalTermMapImpl<>();
        Noun noun = new Noun("label", "pluralAlias", "plural", false);
        termMapImpl1.put("name", noun);
        termMapImpl2.putAll(termMapImpl1);
        assertEquals(noun, termMapImpl2.get("name"));
    }

}