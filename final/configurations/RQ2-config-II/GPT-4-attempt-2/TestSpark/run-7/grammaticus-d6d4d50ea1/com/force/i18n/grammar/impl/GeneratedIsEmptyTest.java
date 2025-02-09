package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedIsEmptyTest {

    @Test
    public void isEmptyTest() {
        GrammaticalTermMapImpl<Noun> termMapImpl = new GrammaticalTermMapImpl<>();
        boolean isEmpty = termMapImpl.isEmpty();
        assertTrue(isEmpty);
    }

}