package com.force.i18n.grammar.impl;

import org.junit.Test;

import java.io.IOException;
import java.util.*;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedEqualsDifferentObjectTest {

    @Test
    public void equalsDifferentObjectTest() {
        GrammaticalTermMapImpl<String> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> map2 = new GrammaticalTermMapImpl<>();
        assertTrue(map1.equals(map2));
    }

}