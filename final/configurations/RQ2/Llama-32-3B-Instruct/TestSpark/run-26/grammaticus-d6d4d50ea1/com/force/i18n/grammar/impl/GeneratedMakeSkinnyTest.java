package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedMakeSkinnyTest {

    @Test
    public void makeSkinnyTest() throws IOException {
        GrammaticalTermMapImpl<T> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<T> skinnyMap = map.makeSkinny();
        assertNotNull(skinnyMap);
    }

}