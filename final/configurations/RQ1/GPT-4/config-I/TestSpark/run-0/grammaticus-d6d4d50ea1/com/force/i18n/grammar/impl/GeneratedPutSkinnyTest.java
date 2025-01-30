package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;

import com.force.i18n.grammar.GrammaticalTerm;

public class GeneratedPutSkinnyTest {

    @Test
    public void putSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> obj = (GrammaticalTermMapImpl<GrammaticalTerm>) new GrammaticalTermMapImpl<GrammaticalTerm>().makeSkinny();
        obj.put("test", mock(GrammaticalTerm.class));
    }

}