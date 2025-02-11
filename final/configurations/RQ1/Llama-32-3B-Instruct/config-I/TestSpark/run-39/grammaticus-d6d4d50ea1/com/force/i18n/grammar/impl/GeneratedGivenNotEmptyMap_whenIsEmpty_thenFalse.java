package com.force.i18n.grammar.impl;

import org.junit.Test;

import static org.junit.Assert.*;

import org.mockito.Mockito;

import java.util.*;

public class GeneratedGivenNotEmptyMap_whenIsEmpty_thenFalse {

    @Test
    public void givenNotEmptyMap_whenIsEmpty_thenFalse() {
        GrammaticalTermMapImpl<String> map = new GrammaticalTermMapImpl<>();
        map.put("test", "value");
        assertFalse(map.isEmpty());
    }
}

}