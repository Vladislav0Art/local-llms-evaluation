package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.io.IOException;
import java.util.*;

import org.junit.Test;
import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;

public class GeneratedContainsKeyTest {

    @Test
    public void containsKeyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = mock(GrammaticalTerm.class);
        map.put("term", term);
        GrammaticalTermMapImpl<GrammaticalTerm> termMapImpl = new GrammaticalTermMapImpl<>(map, false);
        assertTrue(termMapImpl.containsKey("term"));
    }

}