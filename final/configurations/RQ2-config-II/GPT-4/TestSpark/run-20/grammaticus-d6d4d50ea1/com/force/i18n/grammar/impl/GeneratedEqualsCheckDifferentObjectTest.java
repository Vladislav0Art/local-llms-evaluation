package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.GrammaticalTerm;
import com.force.i18n.grammar.LanguageDictionary;
import com.force.i18n.grammar.RenamingProvider;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class GeneratedEqualsCheckDifferentObjectTest {

    @Test
    public void equalsCheckDifferentObjectTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        map1.put("key", new Noun());
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        map2.put("key", new GrammaticalTerm() {
        });
        assertFalse(map1.equals(map2));
    }

}