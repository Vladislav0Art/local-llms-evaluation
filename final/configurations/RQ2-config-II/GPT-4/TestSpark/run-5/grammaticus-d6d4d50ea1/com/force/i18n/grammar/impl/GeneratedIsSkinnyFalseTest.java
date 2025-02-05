package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedIsSkinnyFalseTest {

    @Test
    public void isSkinnyFalseTest() {
        GrammaticalTermMapImpl<String> termMap = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertFalse(termMap.isSkinny());
    }

}