package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.*;

public class GeneratedIsSkinnyWhenTrueTest {

    @Test
    public void isSkinnyWhenTrueTest() {
        Map<String, GrammaticalTerm> testMap = new HashMap<>();
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(testMap, true);
        assertTrue(termMap.isSkinny());
    }

}