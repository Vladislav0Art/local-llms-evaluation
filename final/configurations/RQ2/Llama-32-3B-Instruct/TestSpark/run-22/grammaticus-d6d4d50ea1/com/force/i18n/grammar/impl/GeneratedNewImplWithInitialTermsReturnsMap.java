package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedNewImplWithInitialTermsReturnsMap {

    @Test
    public void newImplWithInitialTermsReturnsMap() {
        Map<String, GrammaticalTerm> initialTerms = new HashMap<>();
        initialTerms.put("term1", new GrammaticalTerm(HumanLanguage.English));
        initialTerms.put("term2", new GrammaticalTerm(HumanLanguage.French));
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>(initialTerms, false);
        assertEquals(initialTerms, map.keySet());
    }

}