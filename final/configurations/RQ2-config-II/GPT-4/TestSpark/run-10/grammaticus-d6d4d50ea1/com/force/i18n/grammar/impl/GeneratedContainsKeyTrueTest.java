package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedContainsKeyTrueTest {

    @Test
    public void containsKeyTrueTest() {
        GrammaticalTerm term = new Noun(HumanLanguage.ENGLISH, "term", "terms", "a term", LanguageStartsWith.CONSONANT, LanguagePosition.REGULAR);
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.put("term", term);
        assertTrue(map.containsKey("term"));
    }

}