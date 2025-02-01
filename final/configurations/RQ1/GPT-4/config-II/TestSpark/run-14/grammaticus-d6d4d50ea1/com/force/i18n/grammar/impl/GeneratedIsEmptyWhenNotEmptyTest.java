package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedIsEmptyWhenNotEmptyTest {

    @Test
    public void isEmptyWhenNotEmptyTest() {
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("test", term);
        assertFalse(termMap.isEmpty());
    }

}