package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import com.force.i18n.commons.util.collection.MapSerializer;
import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.HumanLanguage;
import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedPutAllCopiesTerms {

    @Test
    public void putAllCopiesTerms() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        map.put("term1", new GrammaticalTerm(HumanLanguage.English));
        GrammaticalTermMapImpl<GrammaticalTerm> other = new GrammaticalTermMapImpl<>();
        other.put("term2", new GrammaticalTerm(HumanLanguage.French));
        other.putAll(map);
        assertTrue(other.containsKey("term1"));
    }

}