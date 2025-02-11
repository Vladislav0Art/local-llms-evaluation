package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.*;

public class GeneratedGivenNewMap_whenEquals_thenTrue {

    @Test
    public void givenNewMap_whenEquals_thenTrue() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> other = new GrammaticalTermMapImpl<>();
        assertTrue(map.equals(other));
    }

}