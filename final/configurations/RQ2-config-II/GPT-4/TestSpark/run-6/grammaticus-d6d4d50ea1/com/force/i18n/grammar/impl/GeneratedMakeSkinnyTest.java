package com.force.i18n.grammar.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() {
        HashMap<String, GrammaticalTerm> map = new HashMap<>();
        GrammaticalTermMapImpl beforeSkinnyTermMap = new GrammaticalTermMapImpl(map, false);
        GrammaticalTermMapImpl afterSkinnyTermMap = (GrammaticalTermMapImpl) beforeSkinnyTermMap.makeSkinny();
        assertTrue(afterSkinnyTermMap.isSkinny());
    }

}