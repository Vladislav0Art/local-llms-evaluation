package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedWhenNewGraammaticalTermMapImplCreatedWithTermNameThenContainsKeyReturnTrue {

    private final String TERM_NAME = "testTerm";
    private final HumanLanguage LANGUAGE = HumanLanguage.ENGLISH;

    @Test
    public void whenNewGraammaticalTermMapImplCreatedWithTermNameThenContainsKeyReturnTrue() {
        GrammaticalTermMapImpl<Term> map = new GrammaticalTermMapImpl<>();
        boolean result = map.containsKey(TERM_NAME);
        assertThat(result, is(true));
    }

}