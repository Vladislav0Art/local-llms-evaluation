package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedWhenGraammaticalTermMapImplCreatedWithEmptyTermsToIncludeThenPutAllReturnTrue {

    private final String TERM_NAME = "testTerm";
    private final HumanLanguage LANGUAGE = HumanLanguage.ENGLISH;

    @Test
    public void whenGraammaticalTermMapImplCreatedWithEmptyTermsToIncludeThenPutAllReturnTrue() {
        GrammaticalTermMapImpl<Term> map = new GrammaticalTermMapImpl<>();
        boolean result = map.putAll(null);
        assertThat(result, is(true));
    }

}