package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.LanguageDictionary;
import org.junit.Test;

import java.util.*;
import java.io.Serializable;

import static org.junit.Assert.*;

public class GeneratedEqualsTest {

    @Test
    public void equalsTest() {
        GrammaticalTermMapImpl<String> termMap1 = new GrammaticalTermMapImpl<String>();
        GrammaticalTermMapImpl<String> termMap2 = new GrammaticalTermMapImpl<String>();
        assertTrue(termMap1.equals(termMap2));
    }

}