package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedIsEmptyTest {

    @Test
    public void IsEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>();
        assertTrue(termMap.isEmpty());
    }

}