package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;

import com.force.i18n.grammar.LanguageTerm;

import java.util.HashMap;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertTrue(termMap.makeSkinny().isSkinny());
    }

}