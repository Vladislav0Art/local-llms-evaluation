package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedKeySetTest {

    @Test
    public void keySetTest() {
        HashMap<String, GrammaticalTerm> hm = new HashMap<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        hm.put("test", gt);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(hm, true);

        Set<String> keySet = map.keySet();
        assertEquals(1, keySet.size());
        assertEquals("test", keySet.iterator().next());
    }

}