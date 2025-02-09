package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedPutValueTest {

    @Test
    public void putValueTest() {
        GrammaticalTermMapImpl<Noun> termMapImpl = new GrammaticalTermMapImpl<>();
        Noun noun = new Noun("label", "pluralAlias", "plural", false);
        termMapImpl.put("name", noun);
        assertEquals(noun, termMapImpl.get("name"));
    }

}