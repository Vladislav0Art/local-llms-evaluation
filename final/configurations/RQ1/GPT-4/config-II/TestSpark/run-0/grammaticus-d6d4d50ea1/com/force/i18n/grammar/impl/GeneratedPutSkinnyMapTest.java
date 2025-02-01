package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;

import static org.junit.Assert.*;

public class GeneratedPutSkinnyMapTest {

    @Test
    public void putSkinnyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        try {
            map.put("key", Mockito.mock(GrammaticalTerm.class));
            fail("Exception not thrown");
        } catch (RuntimeException e) {
            assertNotNull(e);
        }
    }

}