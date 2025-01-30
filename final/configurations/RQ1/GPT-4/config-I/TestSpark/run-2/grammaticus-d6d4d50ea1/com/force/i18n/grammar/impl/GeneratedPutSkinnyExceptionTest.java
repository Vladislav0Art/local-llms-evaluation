package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.*;

import static org.junit.Assert.*;

public class GeneratedPutSkinnyExceptionTest {

    @Test
    public void putSkinnyExceptionTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(new TreeMap<>(), true);
        GrammaticalTerm term = Mockito.mock(GrammaticalTerm.class);
        termMap.put("testKey", term);
    }

}