package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedPutTest {

    @Test
    public void putTest() {
        GrammaticalTermMapImpl<Noun> termMap = new GrammaticalTermMapImpl<>();
        Noun noun = new Noun(HumanLanguage.ENGLISH, "Name");
        termMap.put("Name", noun);
        assertEquals(noun, termMap.get("Name"));
    }

}