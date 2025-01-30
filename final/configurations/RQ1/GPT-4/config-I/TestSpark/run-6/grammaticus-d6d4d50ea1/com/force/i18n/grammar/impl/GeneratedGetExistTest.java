package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;

import com.force.i18n.grammar.LanguageTerm;

import java.util.HashMap;

public class GeneratedGetExistTest {

    @Test
    public void getExistTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        LanguageTerm term = new LanguageTerm();
        termMap.put("key", term);
        assertEquals(term, termMap.get("key"));
    }

}