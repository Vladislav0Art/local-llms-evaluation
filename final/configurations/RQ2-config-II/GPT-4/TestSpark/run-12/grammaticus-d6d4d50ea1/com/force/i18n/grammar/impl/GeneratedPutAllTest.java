package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl<Noun> termMap1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<Noun> termMap2 = new GrammaticalTermMapImpl<>();
        Noun noun = new Noun(HumanLanguage.ENGLISH, "Name");
        termMap2.put("Name", noun);
        termMap1.putAll(termMap2);
        assertEquals(noun, termMap1.get("Name"));
    }

}