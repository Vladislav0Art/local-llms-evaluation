package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedIsEmptyFalseTest {

    @Test
    public void isEmptyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.put("term1", new Noun(HumanLanguage.ENGLISH, "term", "terms", "a term", LanguageStartsWith.CONSONANT, LanguagePosition.REGULAR));
        assertFalse(map.isEmpty());
    }

}