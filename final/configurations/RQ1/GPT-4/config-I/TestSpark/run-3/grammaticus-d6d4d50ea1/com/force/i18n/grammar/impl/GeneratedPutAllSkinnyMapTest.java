package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.Noun;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedPutAllSkinnyMapTest {

    @Test
    public void putAllSkinnyMapTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> newMap1 = (GrammaticalTermMapImpl<GrammaticalTerm>) map1.makeSkinny();
        GrammaticalTermMapImpl<GrammaticalTerm> newMap2 = new GrammaticalTermMapImpl<>();
        newMap2.putAll(newMap1);
    }

}