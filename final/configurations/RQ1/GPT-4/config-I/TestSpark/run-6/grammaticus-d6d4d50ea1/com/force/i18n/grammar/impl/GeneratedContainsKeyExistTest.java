package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;

import com.force.i18n.grammar.LanguageTerm;

import java.util.HashMap;

public class GeneratedContainsKeyExistTest {

    @Test
    public void containsKeyExistTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        termMap.put("key", new LanguageTerm());
        assertTrue(termMap.containsKey("key"));
    }

}