package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.HumanLanguage;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        Map<String, Noun> map = new HashMap<>();
        Noun noun = mock(Noun.class);
        map.put("testNoun", noun);

        GrammaticalTermMapImpl<Noun> nounMap1 = new GrammaticalTermMapImpl<>(map, true);
        GrammaticalTermMapImpl<Noun> nounMap2 = new GrammaticalTermMapImpl<>(map, true);

        assertTrue(nounMap1.equals(nounMap2));
    }

}