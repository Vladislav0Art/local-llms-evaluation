package com.force.i18n.grammar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;

public class GeneratedIsSkinnyTest {

    @Test
    public void isSkinnyTest() {
        Map<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTerm term = new Noun(HumanLanguage.ENGLISH, "test", "test", "test");
        map.put("test", term);

        GrammaticalTermMapImpl termMap = new GrammaticalTermMapImpl(map, true);
        assertTrue(termMap.isSkinny());
    }

}