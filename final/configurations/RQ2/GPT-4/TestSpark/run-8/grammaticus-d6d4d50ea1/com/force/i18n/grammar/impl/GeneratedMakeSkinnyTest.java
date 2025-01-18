package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import com.force.i18n.grammar.GrammaticalTerm;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> grammaticalTermMap = new GrammaticalTermMapImpl<>();
        grammaticalTermMap.put("key1", Mockito.mock(GrammaticalTerm.class));
        assertFalse(grammaticalTermMap.isSkinny());
        GrammaticalTermMapImpl<GrammaticalTerm> skinnyTermMap = (GrammaticalTermMapImpl<GrammaticalTerm>) grammaticalTermMap.makeSkinny();
        assertTrue(skinnyTermMap.isSkinny());
    }

}