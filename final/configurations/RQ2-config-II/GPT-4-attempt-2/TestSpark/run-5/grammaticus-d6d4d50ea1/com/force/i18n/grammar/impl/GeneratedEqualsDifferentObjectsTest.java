package com.force.i18n.grammar.impl;

import com.force.i18n.grammar.impl.GrammaticalTermMapImpl;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedEqualsDifferentObjectsTest {

    @Test
    public void equalsDifferentObjectsTest() {
        GrammaticalTermMapImpl<String> map1 = new GrammaticalTermMapImpl<>();
        GrammaticalTermMapImpl<String> map2 = new GrammaticalTermMapImpl<>();
        assertTrue(map1.equals(map2));
    }

}