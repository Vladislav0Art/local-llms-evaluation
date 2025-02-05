package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedGetExistingKeyTest {

    @Test
    public void getExistingKeyTest() {
        GrammaticalTerm term = new Noun(HumanLanguage.ENGLISH, "term", "terms", "a term", LanguageStartsWith.CONSONANT, LanguagePosition.REGULAR);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.put("term", term);
        assertEquals(term, map.get("term"));
    }

}