package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedWhenNewGraammaticalTermMapImplCreatedWithTermsToIncludeThenEmptySetReturnTrue {

    private final String TERM_NAME = "testTerm";
    private final HumanLanguage LANGUAGE = HumanLanguage.ENGLISH;

    @Test
    public void whenNewGraammaticalTermMapImplCreatedWithTermsToIncludeThenEmptySetReturnTrue() {
        Map<String, Term> termMap = ImmutableMap.of(TERM_NAME, new Term());
        GrammaticalTermMapImpl<Term> map = new GrammaticalTermMapImpl<>(termMap, true);
        Set<Map.Entry<String, Term>> expectedResult = ImmutableSet.of(termMap.entrySet().iterator().next());
        assertThat(map.entrySet(), is(expectedResult));
    }

}