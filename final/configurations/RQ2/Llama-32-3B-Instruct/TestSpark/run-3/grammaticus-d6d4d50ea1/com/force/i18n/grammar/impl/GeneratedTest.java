package com.force.i18n.grammar.impl;

import java.io.IOException;

import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GeneratedTest {

    @Test
    public void ConstructorTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map = new GrammaticalTermMapImpl<>();
        assertTrue(map.isEmpty());
    }

    @Test
    public void EqualsTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        assertTrue(map1.equals(map2));
    }

    @Test
    public void HashCodeTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<GrammaticalTerm> map2 = new GrammaticalTermMapImpl<>();
        assertEquals(0, map1.hashCode());
        assertEquals(0, map2.hashCode());
    }

    @Test
    public void IsSkinnyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(new HashMap<>(), true);
        assertTrue(instance.isSkinny());
    }

    @Test
    public void KeySetTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>(new HashMap<>(), false);
        assertTrue(instance.keySet().isEmpty());
    }

    @Test
    public void IsEmptyTest() {
        GrammaticalTermMapImpl<GrammaticalTerm> instance = new GrammaticalTermMapImpl<>();
        assertTrue(instance.isEmpty());
    }

}