package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedWhenNewGraammaticalTermMapImplCreatedWithTermsToIncludeThenGetReturnExpectedTerm {

    private final String TERM_NAME = "testTerm";
    private final HumanLanguage LANGUAGE = HumanLanguage.ENGLISH;

    @Test
    public void whenNewGraammaticalTermMapImplCreatedWithTermsToIncludeThenGetReturnExpectedTerm() {
        Map<String, Term> termMap = ImmutableMap.of(TERM_NAME, new Term());
        GrammaticalTermMapImpl<Term> map = new GrammaticalTermMapImpl<>(termMap, true);
        GrammaticalTerm expectedTerm = new Term();
        assertThat(map.get(TERM_NAME), is(expectedTerm));
    }

}