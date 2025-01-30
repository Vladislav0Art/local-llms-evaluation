package com.force.i18n.grammar.impl;

import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedEqualsFalseTest {

    @Test
    public void equalsFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm2 = new GrammaticalTermMapImpl<>();

        assertFalse(testTerm1.equals(testTerm2.makeSkinny()));
        assertFalse(testTerm1.equals("wrong object"));
    }

}