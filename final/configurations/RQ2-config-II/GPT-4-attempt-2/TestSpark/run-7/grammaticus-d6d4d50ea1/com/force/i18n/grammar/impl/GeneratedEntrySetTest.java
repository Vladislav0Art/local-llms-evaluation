package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedEntrySetTest {

    @Test
    public void entrySetTest() {
        GrammaticalTermMapImpl<Noun> termMapImpl = new GrammaticalTermMapImpl<>();
        Set<Map.Entry<String, Noun>> entries = termMapImpl.entrySet();
        assertNotNull(entries);
    }

}