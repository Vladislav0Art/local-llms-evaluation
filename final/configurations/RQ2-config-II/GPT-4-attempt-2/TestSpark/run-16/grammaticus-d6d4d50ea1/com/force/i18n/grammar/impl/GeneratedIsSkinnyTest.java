package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GeneratedIsSkinnyTest {

    @Test
    public void IsSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(map, false);
        assertFalse(termMap.isSkinny());
    }

}