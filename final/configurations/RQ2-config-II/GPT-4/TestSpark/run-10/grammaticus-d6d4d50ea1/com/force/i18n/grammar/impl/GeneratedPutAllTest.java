package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        map1.put("term1", new Noun(HumanLanguage.ENGLISH, "term", "terms", "a term", LanguageStartsWith.CONSONANT, LanguagePosition.REGULAR));
        map2.put("term2", new Noun(HumanLanguage.ENGLISH, "term", "terms", "a term", LanguageStartsWith.CONSONANT, LanguagePosition.REGULAR));
        map1.putAll(map2);
        assertEquals(2, map1.keySet().size());
    }

}