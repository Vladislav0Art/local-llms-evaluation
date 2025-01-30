package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;

import com.force.i18n.grammar.LanguageTerm;

import java.util.HashMap;

public class GeneratedPutTest_isSkinny {

    @Test
    public void putTest_isSkinny() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        termMap.put("key", new LanguageTerm());
    }

}