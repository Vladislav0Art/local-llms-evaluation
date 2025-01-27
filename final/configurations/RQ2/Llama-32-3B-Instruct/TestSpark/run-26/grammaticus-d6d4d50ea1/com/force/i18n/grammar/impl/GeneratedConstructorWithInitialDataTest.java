package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

public class GeneratedConstructorWithInitialDataTest {

    @Test
    public void constructorWithInitialDataTest() throws IOException, ClassNotFoundException {
        Map<String, T> map = new HashMap<>();
        map.put("key", Mockito.mock(T.class));
        GrammaticalTermMapImpl<T> mapImpl = new GrammaticalTermMapImpl<>(map, false);
        assertEquals(map.size(), mapImpl.keySet().size());
    }

}