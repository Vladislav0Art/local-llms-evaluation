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

public class GeneratedPutExceptionTest {

    @Test
    public void putExceptionTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> testTerm = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        testTerm.put("test", Mockito.mock(GrammaticalTerm.class));
    }

}