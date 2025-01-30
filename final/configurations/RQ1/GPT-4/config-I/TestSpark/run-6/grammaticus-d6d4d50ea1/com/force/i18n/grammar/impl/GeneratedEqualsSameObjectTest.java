package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;

import com.force.i18n.grammar.LanguageTerm;

import java.util.HashMap;

public class GeneratedEqualsSameObjectTest {

    @Test
    public void equalsSameObjectTest() {
        GrammaticalTermMapImpl<LanguageTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.equals(termMap));
    }

}