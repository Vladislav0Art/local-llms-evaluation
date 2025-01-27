package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNewGraammaticalTermMapImplIsNotNull {

    private final String TERM_NAME = "testTerm";
    private final HumanLanguage LANGUAGE = HumanLanguage.ENGLISH;

    @Test
    public void newGraammaticalTermMapImplIsNotNull() {
        GrammaticalTermMapImpl<Term> map = new GrammaticalTermMapImpl<>();
        assertThat(map, is(notNull()));
    }

}