package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.*;

public class GeneratedGetInvalidTest {

    @Test
    public void getInvalidTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> termMap = new GrammaticalTermMapImpl<>(Collections.EMPTY_MAP, false);
        assertNull(termMap.get("test"));
    }

}