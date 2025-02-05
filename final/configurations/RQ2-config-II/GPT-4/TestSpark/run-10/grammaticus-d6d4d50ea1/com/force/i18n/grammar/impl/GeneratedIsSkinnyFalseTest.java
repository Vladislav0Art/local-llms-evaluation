package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;
import java.util.*;

public class GeneratedIsSkinnyFalseTest {

    @Test
    public void isSkinnyFalseTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(testMap, false);
        assertFalse(map.isSkinny());
    }

}