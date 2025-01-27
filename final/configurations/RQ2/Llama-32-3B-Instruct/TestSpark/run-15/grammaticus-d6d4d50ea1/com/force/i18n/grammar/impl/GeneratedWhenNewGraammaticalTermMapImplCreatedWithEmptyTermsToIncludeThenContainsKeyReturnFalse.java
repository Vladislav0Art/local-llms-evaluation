package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedWhenNewGraammaticalTermMapImplCreatedWithEmptyTermsToIncludeThenContainsKeyReturnFalse {

    private final String TERM_NAME = "testTerm";
    private final HumanLanguage LANGUAGE = HumanLanguage.ENGLISH;

    @Test
    public void whenNewGraammaticalTermMapImplCreatedWithEmptyTermsToIncludeThenContainsKeyReturnFalse() {
        GrammaticalTermMapImpl<Term> map = new GrammaticalTermMapImpl<>();
        boolean result = map.containsKey(TERM_NAME);
        assertThat(result, is(false));
    }

}