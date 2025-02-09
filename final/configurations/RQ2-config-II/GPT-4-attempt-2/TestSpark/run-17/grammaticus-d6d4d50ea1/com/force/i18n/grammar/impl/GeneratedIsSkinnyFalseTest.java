package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedIsSkinnyFalseTest {

    @Test
    public void isSkinnyFalseTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(Collections.EMPTY_MAP, false);
        assertFalse(termMap.isSkinny());
    }

}