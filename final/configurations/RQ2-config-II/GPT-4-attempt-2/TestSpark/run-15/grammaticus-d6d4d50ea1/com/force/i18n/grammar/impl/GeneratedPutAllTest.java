package com.force.i18n.grammar.impl;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;

public class GeneratedPutAllTest {

    @Test
    public void putAllTest() {
        GrammaticalTermMapImpl mapOriginal = new GrammaticalTermMapImpl();
        Noun noun = Mockito.mock(Noun.class);
        mapOriginal.put("noun", noun);

        GrammaticalTermMapImpl mapToPut = new GrammaticalTermMapImpl();
        mapToPut.putAll(mapOriginal);

        Assert.assertEquals(mapOriginal, mapToPut);
    }

}