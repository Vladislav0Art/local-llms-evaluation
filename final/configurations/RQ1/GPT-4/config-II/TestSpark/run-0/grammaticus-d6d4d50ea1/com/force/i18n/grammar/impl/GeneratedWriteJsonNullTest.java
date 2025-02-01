package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedWriteJsonNullTest {

    @Test
    public void writeJsonNullTest() throws IOException {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        StringBuilder out = new StringBuilder();
        map.writeJson(out, Mockito.mock(RenamingProvider.class), Mockito.mock(LanguageDictionary.class), null);
        assertEquals("{}", out.toString());
    }

}