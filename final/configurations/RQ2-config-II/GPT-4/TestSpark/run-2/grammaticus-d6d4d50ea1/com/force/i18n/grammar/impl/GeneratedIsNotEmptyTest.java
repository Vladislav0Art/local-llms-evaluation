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

public class GeneratedIsNotEmptyTest {

    @Test
    public void isNotEmptyTest() {
        HashMap<String, GrammaticalTerm> hm = new HashMap<>();
        GrammaticalTerm gt = Mockito.mock(GrammaticalTerm.class);
        hm.put("testKey", gt);

        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(hm, false);
        assertFalse(map.isEmpty());
    }

}