package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedWhenNewGraammaticalTermMapImplCreatedWithTermsToIncludeThenKeysReturnExpectedList {

    private final String TERM_NAME = "testTerm";
    private final HumanLanguage LANGUAGE = HumanLanguage.ENGLISH;

    @Test
    public void whenNewGraammaticalTermMapImplCreatedWithTermsToIncludeThenKeysReturnExpectedList() {
        Map<String, Term> termMap = ImmutableMap.of(TERM_NAME, new Term());
        GrammaticalTermMapImpl<Term> map = new GrammaticalTermMapImpl<>(termMap, true);
        Collection<String> expectedResult = ImmutableSet.of(TERM_NAME);
        assertThat(map.keySet(), is(expectedResult));
    }

}

class Term implements GrammaticalTerm {
    @Override
    public String getHumanLanguageName() { /* implementation */
    }

}